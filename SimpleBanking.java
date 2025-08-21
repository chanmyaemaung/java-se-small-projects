import java.util.Scanner;

public class SimpleBanking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        /* DECLARE VARIABLES */
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            /* DISPLAY MENU */
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            /* GET AND PROCESS TO USER CHOICE */
            System.out.print("Enter your choice 1-4: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }

    public static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("MMK%.2f\n", balance);
    }

    public static double deposit() {
        double amount;

        System.out.print("Enter a mount to be depositted: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("AMOUNT CAN'T BE NEGATIVE!");
            return 0;
        } else {
            return amount;
        }

    }

    public static double withdraw(double balance) {
        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        } else if (amount < 0) {
            System.out.println("AMOUNT CAN'T BE NEGATIVE!");
            return 0;
        } else {
            return amount;
        }

    }
}
Ï
