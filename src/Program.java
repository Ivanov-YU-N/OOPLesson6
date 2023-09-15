public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        Jason jason = new Jason();
        order.inputFromConsole();
        jason.saveToJson();
    }
}