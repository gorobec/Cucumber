package atm;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gorobec on 27.11.16.
 */
public class AtmImpl implements Atm{

    private String cardNum;

    private int pin;

    private List<Account> accounts = new LinkedList<Account>();


    public String insertCard(String card) {
        cardNum = card;
        return card;
    }

    public int enterPin(int pin) {
          this.pin = pin;
        return pin;
    }

    public double checkBalance() {

        for (Account acc: accounts) {
            if (acc.getCardNumber().equals(cardNum) && acc.getPin() == pin) {
                return acc.getAmount();
            }
        }
        return 0;
    }

    public int withdrawCash(int amount) {
        for (Account acc: accounts) {
            if (acc.getCardNumber().equals(cardNum) && acc.getPin() == pin
                    && amount <= acc.getAmount()) {
                acc.setAmount(acc.getAmount() - amount);
                return amount;
            }
        }
        return 0;
    }

    public void addAcc(Account account) {
        accounts.add(account);
    }
}
