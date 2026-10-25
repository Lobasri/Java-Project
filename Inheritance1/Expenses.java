import java.util.Scanner;
class User {
    int userId;
    String userName;

    void inputUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== SMART EXPENSE TRACKER =====");
        System.out.print("Enter User ID: ");
        userId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter User Name: ");
        userName = sc.nextLine();
    }

    void displayUser() {
        System.out.println("\n----- User Details -----");
        System.out.println("User ID   : " + userId);
        System.out.println("User Name : " + userName);
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


class Report extends Expense {

    void generateReport() {
        System.out.println("\n===== EXPENSE REPORT =====");
        System.out.println("User ID        : " + userId);
        System.out.println("User Name      : " + userName);
        System.out.println("Category       : " + category);
        System.out.println("Expense Amount : Rs. " + amount);
    }
}


public class Expenses {

    public static void main(String[] args) {
        Report r = new Report();
        r.inputUser();
        r.inputExpense();
        r.displayUser();
        r.displayExpense();
        r.generateReport();
        System.out.println("\nProgram Executed Successfully!");
    }
}