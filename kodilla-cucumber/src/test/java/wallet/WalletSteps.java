package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_in_my_wallet(int amount) {
        wallet.deposit(amount);
    }

    @When("I request ${int}")
    public void i_request(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, amount);
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int amount) {
        Assertions.assertEquals(amount, cashSlot.getContents(),
                "Incorrect amount dispensed");
    }

    @Then("my wallet balance should be ${int}")
    public void my_wallet_balance_should_be(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, wallet.getBalance(),
                "Incorrect wallet balance");
    }
}