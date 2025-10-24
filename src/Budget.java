public class Budget {
    private TransactionCategory category;
    private double limitAmount;
    private double currentSpending;
    private CashFlow cashFlow;
    //methods 
    public Budget(TransactionCategory newCategory, double newLimit){
        this.category = newCategory;
        this.limitAmount = newLimit;
        this.currentSpending = 0.0;
    }
    public TransactionCategory getCategory(){
        return category;
    }
    public double getLimitAmount(){
        return limitAmount;
    }
    public double getCurrentSpending(){
        return currentSpending;
    }
    //update spending when a transaction is created of type expense 
    public void updateSpending(){
        this.currentSpending = this.cashFlow.getTotalExpenses();
    }
    public double getRemainingBudget() {
        return this.limitAmount - this.currentSpending;
    }
    public boolean isOverBudget(){
        if (this.getRemainingBudget() <0){
            return true;
        } else {
            return false;
        }
    }
}