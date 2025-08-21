import java.util.Scanner;

public class ShoppingCart {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String item;
        int quantity = 1000;
        double price;
        char currency = 'K';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many will you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou've bought " + quantity + " " + item + "/s");

        System.out.println("Your total is: " + total + currency + "yat");

        scanner.close();
    }
}
Ï
