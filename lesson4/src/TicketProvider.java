import java.util.ArrayList;

/**
 * Class of Ticket Provider
 */
public class TicketProvider {
    public ArrayList<Ticket> tickets;

    public TicketProvider() {
        this.tickets = TicketDatabase.tickets;
    }

    /**
     * Get all ticket or by root number
     *
     * @param rootNumber 0 - All, 1..n - number of ticket
     */
    public ArrayList<Ticket> getTickets(int rootNumber) {
        ArrayList<Ticket> ticketArrayList = new ArrayList<>();
        if (rootNumber == 0) return tickets;
        for (Ticket ticket : TicketDatabase.tickets) {
            if (ticket.rootNumber == rootNumber)
                ticketArrayList.add(ticket);
        }
        return ticketArrayList;
    }

    public boolean updateTicketStatus(Ticket ticket) {
        return tickets.get(tickets.indexOf(ticket)).isValid;
    }
}