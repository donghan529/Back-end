package jpabook.jpashop.service;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderStatus;
import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.exception.NotEnoughStockException;
import jpabook.jpashop.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class OrderServiceTest {

    @PersistenceContext
    EntityManager em;

    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @Test
    void order() {
        //Given
        Member member = crateMember();
        Item item = createBook("시골 JPA", 10000, 10);
        int orderCount = 2;

        //When
        Long orderId = orderService.order(member.getId(), item.getId(), orderCount);

        //Then
        Order getOrder = orderRepository.findOne(orderId);

        assertEquals(OrderStatus.ORDER, getOrder.getStatus(), "상품 주문시 상태는 ORDER");
        assertEquals(10000*2, getOrder.getTotalPrice(), "주문 가격은 가격 * 수량");
        assertEquals(8, item.getStockQuantity(),"주문 수량 만큼 재고가 줄어야 한다.");
    }
    private Member crateMember() {
        Member member = new Member();
        member.setName("회원1");
        member.setAddress(new Address("서울", "경기" , "123-123"));
        em.persist(member);
        return member;
    }
    private Book createBook(String name, int price, int stockQuantity) {
        Book book = new Book();
        book.setName(name);
        book.setStockQuantity(stockQuantity);
        book.setPrice(price);
        em.persist(book);
        return book;
    }

    @Test
    void 상품주문_재고수량초과() throws Exception {
        //Given
        //1.member 생성
        //2.item 생성시 재고 10개
        Member member = crateMember();
        Item item = createBook("시골 JPA", 10000, 10);
        //3.재고보다 많은 수량
        int orderCount = 11;
        //When
        //orderservice를 실행 했을때
        //("재고 수량 부족 예외가 발생해야 한다.")
        //"need more stock" 예외가 발생해서 테스트 성공하게 만드시오.

        //Then
        assertThrows(NotEnoughStockException.class, ()->{
           orderService.order(member.getId(), item.getId(), orderCount);
        });
    }

    @Test
    void 주문취소() throws Exception {
        //Given
        Member member = crateMember();
        Item item = createBook("시골 JPA", 10000, 10);
        int orderCount = 2;
        Long orderId = orderService.order(member.getId(), item.getId(), orderCount);

        //When
        orderService.cancelOrder(orderId);

        //Then
        Order getOrder = orderRepository.findOne(orderId);
        assertEquals(OrderStatus.CANCEL, getOrder.getStatus());
        assertEquals(10, item.getStockQuantity());
    }
}