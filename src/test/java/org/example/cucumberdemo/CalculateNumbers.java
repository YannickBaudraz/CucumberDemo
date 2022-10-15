package org.example.cucumberdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculateNumbers {

    private Calculator calculator;
    private int number1;
    private int number2;
    private List<Integer> numbers;
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

    @Given("The following numbers : {listInt}")
    public void the_following_numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @When("I add them")
    public void i_add_them() {
        result = calculator.add(number1, number2);
    }

    @When("I add them all")
    public void i_add_them_all() {
        result = calculator.add(numbers);
    }

    @When("I subtract them")
    public void i_subtract_them() {
        result = calculator.subtract(number1, number2);
    }

    @Then("The result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }

    @Then("The result should be")
    public void theResultShouldBe(int result) {
        assertEquals(result, this.result);
    }
}
