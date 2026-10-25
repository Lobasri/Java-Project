class Expense {
    int id;
    String category;
    double amount;

    Expense() {
        id = 101;
        category = "Food";
        amount = 500;
    }

    Expense(int id, String category, double amount) {
        this.id = id;
        this.category = category;
        this.amount = amount;
    }

    Expense(Expense e) {
        id = e.id;
        category = e.category;
        amount = e.amount;
    }

    void display() {
        System.out.println(id + "  " + category + "  Rs." + amount);
    }
}

public class Expenses {
    public static void main(String[] args) {
        Expense e1 = new Expense();
        Expense e2 = new Expense(102, "Travel", 750.50);
        Expense e3 = new Expense(e2);

        e1.display();
        e2.display();
        e3.display();
    }
}