import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Logic test
        CashProvider cashProvider1 = new CashProvider(1234567890);
        Customer customer1 = new Customer(1, cashProvider1);
        ArrayList<Ticket> searchTickets = customer1.searchTicket(LocalDateTime.of(2022, 1, 1, 14, 5), 1);
        // Some logic
        // ....
        int ticketIndex = 0;
        // ....
        // Some logic
        try {
            if (customer1.buyTicket(searchTickets.get(ticketIndex))) System.out.println("Test buy: Ok!");
            else System.err.println("Test buy: Error!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}