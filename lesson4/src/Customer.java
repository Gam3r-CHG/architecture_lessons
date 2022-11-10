import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Class of Customer
 */
public class Customer {
    public int id;
    public ArrayList<Ticket> tickets;
    public CashProvider cash;
    public TicketProvider ticketProvider;

    public Customer(int id, CashProvider cash) {
        this.id = id;
        this.ticketProvider = new TicketProvider();
        this.cash = cash;
    }

    public boolean buyTicket(Ticket ticket) {
        cash.authorization(this);
        if (cash.isAuthorization) {
            cash.buy();
            return true;
        }
        return false;
    }

    public ArrayList<Ticket> searchTicket(LocalDateTime dateTime, int place) {
        // Simple logic just for test example
        tickets = ticketProvider.getTickets(0);
        ArrayList<Ticket> ticketArrayList = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.date.equals(dateTime)
                    && ticket.place == place
                    && ticketProvider.updateTicketStatus(ticket))
                ticketArrayList.add(ticket);
        }
        return ticketArrayList;
    }
}