import java.time.LocalDateTime;

/**
 * Class of ticket
 */
public class Ticket {
    public int rootNumber;
    public int place;
    public int price;
    public LocalDateTime date;
    public boolean isValid;

    public Ticket(int rootNumber, int place, int price, LocalDateTime date, boolean isValid) {
        this.rootNumber = rootNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }
}