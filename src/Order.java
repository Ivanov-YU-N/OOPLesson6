import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    //region Filed
    private String clientName;
    private String product;
    private int qnt;
    private int price;
    //endregion
    //region Constructor
    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    public Order() {
    }

    //endregion
    //region Geters
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }
    //endregion
    //region Metod
    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    //endregion

}

