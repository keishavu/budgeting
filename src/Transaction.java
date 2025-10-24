public class Transaction {
    double amount;
    TransactionType type;
    TransactionCategory category;
    //constructor
    public Transaction(double newAmount, TransactionType newType, TransactionCategory newCategory){
        this.amount = newAmount;
        this.type = newType;
        this.category = newCategory;
    }
    //getters and setters
    public double getAmount(){
        return amount;
    }
    public void setAmount(double newAmount){
        if (newAmount>0){
            this.amount=newAmount;
        }
    }
    public TransactionType getTransactionType(){
        return type;
    }
    public void setTransactionType(TransactionType newType){
        this.type = newType;
    }
    public TransactionCategory getCategory(){
        return category;
    }
    public void setCategory(TransactionCategory newCategory){
        this.category = newCategory;
    }
}