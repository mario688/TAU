package lab3;

public class PersonalizedMeal {

    private int price;
    private String nameOfMeal;
    public PersonalizedMeal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountedPrice(int discount){

        return this.price - discount;
    }
}
