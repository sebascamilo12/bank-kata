import java.time.LocalDate;

public class Transaction {

    private double amount;
    private LocalDate date;

    private TransactionType tipo;



    public Transaction(double amount, LocalDate date, TransactionType tipo) {
        this.amount = amount;
        this.date = date;
        this.tipo = tipo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TransactionType getTipo() {
        return tipo;
    }

    public void setTipo(TransactionType tipo) {
        this.tipo = tipo;
    }
}
