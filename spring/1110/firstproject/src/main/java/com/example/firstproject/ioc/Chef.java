package com.example.firstproject.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component 어노테이션을 이용하면 Bean Configuration 파일에 Bean을 따로 등록하지 않아도 사용할 수 있다.
//빈 등록자체를 빈 클래스 자체에다가 할 수 있다는 의미이다.
//@Component 어노테이션은 기본적으로 타입기반의 자동주입 어노테이션이다.
//@Autowired, @Resource와 비슷한 기능을 수행한다고 할 수 있겠다.
//@Component 어노테이션을 xml 설정파일에서 설정하는 방법이다.
@Component
public class Chef {
    //셰프는 식재료 공장을 알고 있음
    private IngredientFactory ingredientFactory;
    //셰프가 식재료 공장과 협업하기 위한DI
    public Chef(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public String cook(String menu) {
        //재료 준비
        //Pork pork = new Pork("한돈 등심");
        //Beef beef = new Beef("한우 꽃등심");
        Ingredient ingredient = ingredientFactory.get(menu);
        //요리반환
        //return pork.getName() + "으로 만든 " + menu;
        //return beef.getName() + "으로 만든 " + menu;
        return ingredient.getName() + "으로 만든 " + menu;
    }
}
