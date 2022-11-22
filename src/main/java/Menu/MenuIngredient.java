package Menu;

public class MenuIngredient {
    //메뉴 만드는 재료의 이름, 재고수 들어갈 예정.
    String ingredientName;
    int ingredientQuantity;

    MenuIngredient(String ingredientName, int ingredientQuantity){ //MenuIngredient(재료명, 재료수량) 생성자입니다.
        this.ingredientName = ingredientName;
        this.ingredientQuantity = ingredientQuantity;
    }

}
