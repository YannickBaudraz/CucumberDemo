package org.example.cucumberdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculateNumbers {

    private Calculator calculator;
    private int number1;
    private int number2;
    private int result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @Given("Two numbers {int} and {int}")
    public void two_numbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @When("I add them")
    public void i_add_them() {
        result = calculator.add(number1, number2);
    }

    @When("I subtract them")
    public void iSubtractThem() {
        result = calculator.subtract(number1, number2);
    }

    @Then("The result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
