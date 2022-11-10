import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Temp database of tickets
 */
public class TicketDatabase {
    public static ArrayList<Ticket> tickets = new ArrayList<>();

    static {
        Ticket ticket1 = new Ticket(1, 1, 100, LocalDateTime.of(2022, 1, 1, 14, 5), true);
        Ticket ticket2 = new Ticket(2, 2, 200, LocalDateTime.of(2022, 1, 1, 14, 5), true);
        Ticket ticket3 = new Ticket(3, 1, 100, LocalDateTime.of(2022, 2, 1, 14, 5), true);
        Ticket ticket4 = new Ticket(4, 2, 200, LocalDateTime.of(2022, 2, 1, 14, 5), true);
        Ticket ticket5 = new Ticket(5, 4, 300, LocalDateTime.of(2022, 2, 1, 14, 5), true);
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
    }
}