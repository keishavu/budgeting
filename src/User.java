public class User{
    private String name;
    private String email;
    private CashFlow cashFlow;
    private List<Budget> budgets;
    //methods 
    public User(String newName, String newEmail){
        this.name = newName;
        this.email = newEmail;
        this.cashFlow = new CashFlow();
        this.budgets = new ArrayList<>();
    }
    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public CashFlow getCashFlow() {
        return cashFlow;
    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Core methods
    public void addTransaction(Transaction t) {
        cashFlow.addTransaction(t);
    }

    public double getBalance() {
        return cashFlow.calculateNetBalance();
    }

    public List<Transaction> getTransactionsByType(TransactionType type) {
        return cashFlow.getTransactionsByType(type);
    }

    public void addBudget(Budget b) {
        budgets.add(b);
    }

    public boolean overUnderBudget() {
        for (Budget b : budgets) {
            if (b.isOverBudget()) {
                return true;
            }
        }
        return false;
    }
}
}