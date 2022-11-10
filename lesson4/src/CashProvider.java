/**
 * Class of CashProvider
 */
public class CashProvider {
    public long card;
    public boolean isAuthorization;

    public CashProvider(long card) {
        this.card = card;
    }

    public void buy() {
        // Some logic
    }

    public void authorization(Customer customer) {
        // Some logic with customer
        this.isAuthorization = true;
    }
}