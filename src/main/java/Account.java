import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Account {

    Statement statement = new Statement();

    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(double amount, LocalDate date) {
        Transaction transaction = new Transaction(amount, date, TransactionType.CREDIT);
        statement.deposit(transaction);
    }

    void withdraw(double amount, LocalDate date) {
        Transaction transaction = new Transaction(amount, date, TransactionType.DEBIT);
        statement.withDraw(transaction);
    }

    void printStatements(PrintStream out) {
        out.println("date\t\tcredit\tdebit\tbalance");
        List<Transaction> transactions = statement.getTransactionList();
        List<String> dataImprimir = new ArrayList<>();
        double balance = 0;
        for (Transaction t : transactions) {
            String format = t.getDate()
                    .format(DateTimeFormatter
                            .ofPattern("dd/MM/yyyy"));
            if (t.getTipo().equals(TransactionType.CREDIT)) {
                balance = balance + t.getAmount();
                dataImprimir.add(format + "\t" + t.getAmount() + "\t\t\t" + balance);
            }
            if (t.getTipo().equals(TransactionType.DEBIT)) {
                balance = balance - t.getAmount();
                dataImprimir.add(format + "\t\t\t" + t.getAmount() + "\t" + balance);
            }
        }
        for (int i = dataImprimir.size() - 1; i >= 0; i--) {
            out.println(dataImprimir.get(i));
        }
    }
}
