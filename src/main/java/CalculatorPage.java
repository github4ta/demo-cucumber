import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorPage {
    private int result;

    @Given("User open calculator")
    public void open() {
        System.out.println("Calculator is opened.");
    }

    @When("User sum numbers {int}, {int}")
    public void sum(int a, int b) {
        result = a + b;
    }

    @Then("Verify sum {int}")
    public void verifySum(int expected) {
        Assertions.assertEquals(expected, result);
    }
}
