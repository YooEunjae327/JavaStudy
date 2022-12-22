public class Main {
    public static void main(String[] args) {
        final OrderService orderService = new OrderServiceIml();
        final Order order = orderService.createOrder(20, "한남하나", 4000);

        System.out.println(order.getDisconutPrice());
    }
}
