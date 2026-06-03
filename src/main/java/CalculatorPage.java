public class CalculatorPage {
    private int result;

    // GIVEN
    @Given("")
    public void open() {
        System.out.println("Calculator is opened.");
    }

    // WHEN
    public void sum(int a, int b) {
        result = a + b;
    }

    // THEN
    public boolean verifySum(int expected) {
        return expected == result;
    }
}
