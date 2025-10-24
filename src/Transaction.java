public class Transaction {
    private double amount;
    private TransactionType type;
    private TransactionCategory category;
    private String user; 
    //constructor
    public Transaction(double newAmount, TransactionType newType, TransactionCategory newCategory, User newUser){
        this.amount = newAmount;
        this.type = newType;
        this.category = newCategory;
        this.user = newUser;
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