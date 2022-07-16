import java.util.ArrayList;
import java.util.List;

public class Statement {

    private List<Transaction> transactionList;

    public Statement() {
        this.transactionList = new ArrayList<>();
    }
    public void deposit(Transaction transaction){
        this.transactionList.add(transaction);

    }

    public void withDraw(Transaction transaction){
        this.transactionList.add(transaction);
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }
}
