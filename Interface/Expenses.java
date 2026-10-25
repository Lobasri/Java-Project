interface ExpenseInput {
    void input();
}

interface ExpenseDisplay {
    void display();
}

class ExpenseDetails implements ExpenseInput, ExpenseDisplay {
    int ExpenseId;
    String Category;
    Double Amount;

    public void input() {
        System.out.println("\n==== SMART EXPENSE TRACKER ====");
        ExpenseId = 101;
        Category = "Food";
        Amount = 500.0;
    }

    public void display() {
        System.out.println("---- EXPENSE DETAILS ----");
        System.out.println("ExpenseId: " + ExpenseId);
        System.out.println("Category: " + Category);
        System.out.println("Amount: " + Amount);
    }
}

public class Expenses {
    public static void main(String args[]) {

        ExpenseDetails obj = new ExpenseDetails();
        ExpenseInput e1 = obj;
        ExpenseDisplay e2 = obj;
        e1.input();
        e2.display();

        System.out.println("\nProgram Executed Successfully");
    }
}