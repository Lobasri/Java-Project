class User {
    int UserId;
    String Name;

    void input() {
        System.out.println("User input method");
    }

    void display() {
        System.out.println("User display method");
    }
}

class Expense extends User {
    String Category;
    Double Amount;

    void input() {
        System.out.println("\n==== SMART EXPENSE TRACKER ====");
        UserId = 101;
        Name = "Lobasri";
        Category = "Food";
        Amount = 500.0;
    }

    void display() {
        System.out.println("---- USER DETAILS ----");
        System.out.println("UserId: " + UserId);
        System.out.println("Name: " + Name);
        System.out.println("---- EXPENSE DETAILS ----");
        System.out.println("Category: " + Category);
        System.out.println("Amount: " + Amount);
    }
}

class FoodExpense extends Expense {
    String FoodType;

    void input() {
        System.out.println("\n==== FOOD EXPENSE ====");
        UserId = 101;
        Name = "Lobasri";
        Category = "Food";
        Amount = 500.0;
        FoodType = "Biryani";
    }

    void display() {
        System.out.println("---- FOOD EXPENSE DETAILS ----");
        System.out.println("UserId: " + UserId);
        System.out.println("Name: " + Name);
        System.out.println("Category: " + Category);
        System.out.println("Amount: " + Amount);
        System.out.println("Food Type: " + FoodType);
    }
}

public class Expenses {
    public static void main(String args[]) {

        FoodExpense f = new FoodExpense();
        f.input();
        f.display();
        
        System.out.println("\nProgram Executed Successfully");
    }
}