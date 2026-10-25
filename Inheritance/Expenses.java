import java.util.Scanner;
class User {
    String name;
    int userId;

    void inputUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== SMART EXPENSE TRACKER =====");
        System.out.print("Enter User ID: ");
        userId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter User Name: ");
        name = sc.nextLine();
    }

    void displayUser() {
        System.out.println("\n----- User Details -----");
        System.out.println("User ID   : " + userId);
        System.out.println("User Name : " + name);
    }
}

class Expense extends User {

    String category;
    double amount;

    void inputExpense() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expense Category: ");
        category = sc.nextLine();
        System.out.print("Enter Expense Amount: ");
        amount = sc.nextDouble();
    }

    void displayExpense() {
        System.out.println("\n----- Expense Details -----");
        System.out.println("Category : " + category);
        System.out.println("Amount   : Rs. " + amount);
    }
}


public class Expenses {

    public static void main(String[] args) {

        Expense e = new Expense();
        e.inputUser();
        e.inputExpense();
        e.displayUser();
        e.displayExpense();

        System.out.println("\nProgram Executed Successfully!");
    }
}