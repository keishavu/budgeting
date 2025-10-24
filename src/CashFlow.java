import java.util.*;
public class CashFlow {
    private List<Transaction> transactions;
    private double totalIncome;
    private double totalExpenses; 
    // methods
    public CashFlow(){
        transactions = new ArrayList<>();
        totalIncome = 0;
        totalExpenses = 0;
    }
    public void addTransaction(Transaction t) {
        transactions.add(t);
        if (t.getType() == TransactionType.INCOME){
            totalIncome += t.getAmount();
        } else if (t.getType() == TransactionType.EXPENSE){
            totalExpenses -= t.getAmount();
        }
    }
    public double getTotalIncome(){
        return totalIncome;
    }
    public double getTotalExpenses(){
        return totalExpenses;
    }
    public double netBalance(){
        return totalIncome-totalExpenses;
    }
    public List<Transaction> getTransactionByType(TransactionType ty){
        List<Transaction> filtered = new ArrayList<>();
        for(Transaction t : transactions){
            if(t.getType()==ty){
                filtered.add(t);
            }
        }
        return filtered;
    }
    public List<Transaction> getTransactionByCategory(TransactionCategory cat){
        List<Transaction> filtered = new ArrayList<>();
        for(Transaction t : transactions){
            if(t.getCategory()==cat){
                filtered.add(t);
            }
        }
        return filtered;
    }
}