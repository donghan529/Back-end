package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B") // 엔티티 저장 시 구분 컬럼에 입력할 값을 지정. 만약 영화 엔티티를 저장하면 구분 컬럼인 DTYPE에 값 B이 저장된다.
@Getter
@Setter
public class Book extends Item {
    private String author;
    private String isbn;
}
