import atm.Account;
import atm.Atm;
import atm.AtmImpl;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;

/**
 * Created by gorobec on 27.11.16.
 */
public class StepDefinitions {


    AtmImpl atm = new AtmImpl();

    int res;



    @cucumber.api.java.Before
    public void init() {
        System.out.println("Before scenario");
        setupAtm();
    }




    private void setupAtm() {
        Account account = new Account("1234 0000 6565 0000", 1111, 3000.5);
        Account account1 = new Account("1234 0000 6565 9988", 1111, 7000.5);
        Account account2 = new Account("1234 0000 6565 1234", 1111, 5000.5);

        atm.addAcc(account);
        atm.addAcc(account2);
        atm.addAcc(account1);
    }


    @Given("^client insert card \"([^\"]*)\" into atm$")
    public void clientInsertCard(String card) throws Throwable {
        atm.insertCard(card);
    }


    @When("^client try withdraw \"(\\d*)\" cash$")
    public void clientTryWithdrawCash(int arg0) throws Throwable {
        res = atm.withdrawCash(arg0);
    }

    @Then("^client get \"(\\d*)\" dollars$")
    public void clientGetDollars(int arg0) throws Throwable {
        Assert.assertTrue(arg0 == res);
    }

    @And("^client enter \"([^\"]*)\" pin$")
    public void clientEnterPin(int arg0) throws Throwable {
        atm.enterPin(arg0);

    }


    /*@Given("^client insert card <Card> into atm$")
    public void clientInsertCardCardIntoAtm() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^client enter <pin> pin$")
    public void clientEnterPinPin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^client try withdraw <cash> cash$")
    public void clientTryWithdrawCashCash() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^client get <res> dollars$")
    public void clientGetResDollars() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
