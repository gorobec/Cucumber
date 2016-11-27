package atm;

/**
 * Created by gorobec on 27.11.16.
 */
public class Account {

   private String cardNumber;

    private int pin;

    private double amount;


    public Account(String cardNumber, int pin, double amount) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
