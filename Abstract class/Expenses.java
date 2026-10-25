abstract class User {
    int UserId;
    String Name;

    abstract void input();
    abstract void display();
}

class Expense extends User {
    String Category;
    Double Amount;

    void input() {
        UserId = 101;
        Name = "Lobasri";
        Category = "Food";
        Amount = 500.0;
    }

    void display() {
        System.out.println("\n==== SMART EXPENSE TRACKER ====");
        System.out.println("\n---- USER DETAILS ----");
        System.out.println("UserId: " + UserId);
        System.out.println("Name: " + Name);
        System.out.println("---- EXPENSE DETAILS ----");
        System.out.println("Category: " + Category);
        System.out.println("Amount: " + Amount);
    }
}

public class Expenses {
    public static void main(String args[]) {

        User e = new Expense();
        e.input();
        e.display();

        System.out.println("\nProgram Executed Successfully");
    }
}
