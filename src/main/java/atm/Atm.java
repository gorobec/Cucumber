package atm;

/**
 * Created by gorobec on 27.11.16.
 */
public interface Atm {

    String insertCard(String cardNum);

    int enterPin(int pin);

    double checkBalance();

    int withdrawCash(int amount);
}
