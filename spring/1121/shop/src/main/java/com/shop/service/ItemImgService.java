package com.shop.service;

import com.shop.entity.ItemImg;
import com.shop.repository.ItemImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemImgService {

    @Value("${itemImgLocation}")
    private String itemImgLocation;

    private final ItemImgRepository itemImgRepository;

    private final FileService fileService;

    public void saveItemImg(ItemImg itemImg, MultipartFile itemImgFile) throws Exception {
        String oriImgName = itemImgFile.getOriginalFilename();
        String imgName = "";
        String imgUrl = "";

        //파일 업로드
        if(!StringUtils.isEmpty(oriImgName)) {
            imgName = fileService.uploadFile(itemImgLocation, oriImgName,
                    itemImgFile.getBytes());
            //uploadFile을 호출하여 파일을 업로드하고
            imgUrl = "/images/item/" + imgName;
            //업로드된 파일의 이름과 url을 얻어옵니다.
            //WebMvcConfig - "/images/**"
            //application.properties - uploadPath=file://D:/shop/
            //아래 item 폴더에 이미지를 저장
            //이미지를 불러오는 경로는 "images/item"
        }

        //상품 이미지 정보 저장
        itemImg.updateItemImg(oriImgName, imgName, imgUrl);
        itemImgRepository.save(itemImg);
    }
    public void updateItemImg(Long itemImgId,
                              MultipartFile itemImgFile) throws Exception {
        if(!itemImgFile.isEmpty()) {
            ItemImg savedItemImg = itemImgRepository.findById(itemImgId)
                    .orElseThrow(EntityNotFoundException::new);
            //상품 이미지 아이디를 이용해서 기존에 저장했던 상품 이미지 엔티티를 조회합니다.
            if(!StringUtils.isEmpty(savedItemImg.getImgName())) {
                fileService.deleteFile(itemImgLocation + "/" +
                        savedItemImg.getImgName());
            } //기존에 등록된 상품이미지 파일이 있을 경우 해당파일 삭제
            String oriImgName = itemImgFile.getOriginalFilename();
            String imgName = fileService.uploadFile(itemImgLocation,
                    oriImgName, itemImgFile.getBytes());
            String imgUrl = "/images/item/" + imgName;
            savedItemImg.updateItemImg(oriImgName, imgName, imgUrl);

        }
    }
    //변경된 상품 이미지 정보를 세팅해줍니다. 여기서 중요한 점은
    //상품 등록 때 처럼 itemImgRepository.save()로 로직호출 하지 않는다.
    //savedItemImg 엔티티는 현재 영속 상태 데이터를 변경하는 것만으로
    //변경감지 기능이 동작하여 트랜잭션이 끝날때 upadte 쿼리가 실행
}
