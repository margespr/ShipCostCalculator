import java.util.Scanner;
public class ShipCostCalculator {

    public static void main(String[] args) {

        // ask user for item price
        // validate input
        // if price >= 100 shipping = 0
        // else shipping = 0.02 * price
        // total = price + shipping
        // print shipping and total

        Scanner in = new Scanner(System.in);
        double price = 0.0;
        double shipping = 0.0;
        double total = 0.0;
        String trash = "";

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();

            if (price >= 100.0) {
                shipping = 0.0;
            } else {
                shipping = price * 0.02;
            }

            total = price + shipping;

            System.out.println("Item price: $" + price);
            System.out.println("Shipping cost: $" + shipping);
            System.out.println("Total price: $" + total);
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}
