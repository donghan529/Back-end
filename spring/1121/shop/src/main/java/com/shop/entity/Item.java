package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import com.shop.dto.ItemFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item extends BaseEntity {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;                        //상품 코드

    @Column(nullable = false, length = 50)
    private String itemNm;                  //상품명
    //null 허용 하지 않고 - itemNm 필드는 항상 값을 가져야 한다. 최대 50자

    @Column(name = "price", nullable = false)
    private int price;                      //가격

    @Column(nullable = false)
    private int stockNumber;                //재고 수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;              //상품 상세 설명
    //@Lob - 대용량의 데이터를 저장

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;  //상품 판매 상태

    public void updateItem(ItemFormDto itemFormDto) {
        this.itemNm = itemFormDto.getItemNm();
        this.price = itemFormDto.getPrice();
        this.stockNumber = itemFormDto.getStockNumber();
        this.itemDetail = itemFormDto.getItemDetail();
        this.itemSellStatus = itemFormDto.getItemSellStatus();
    }

//    private LocalDateTime regTime;          //등록 시간

//    private LocalDateTime updateTime;       //수정 시간
}
