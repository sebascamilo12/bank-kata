import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StartApp {


    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2021"));
        account.deposit(amountOf(2000), date("13/01/2021"));
        account.withdraw(amountOf(500), date("14/01/2021"));

        account.printStatements(System.out);
    }

    private static LocalDate date(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        return localDate;
    }

    private static double amountOf(int i) {
        return i;
    }

}
