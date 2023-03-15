package dependency.old;

public class Order {

    private final String itemName;
    private final int itemPrice;
    private final int disconutPrice;

    public Order(String itemName, int itemPrice, int disconutPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.disconutPrice = disconutPrice;
    }

    public int getDisconutPrice() {
        return disconutPrice;
    }
}

interface OrderService {
    Order createOrder(int age, String itemName, int itemPrice);
}

class OrderServiceIml implements OrderService {
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(int age, String itemName, int itemPrice) {
        int discountPrice = discountPolicy.discount(age, itemPrice);
        return new Order(itemName, itemPrice, discountPrice);
    }
}
