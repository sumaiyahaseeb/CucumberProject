package stepdefs;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	int num1;
	int num2;
	int result;
	List<Integer> values;

	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(int val1, int val2) {
		this.num1 = val1;
		this.num2 = val2;

	}

	@When("I add those two numbers")
	public void i_add_those_two_numbers() {
		result = num1 + num2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expresult) {
		Assert.assertEquals(expresult, result);

	}

	@When("I sub those two numbers")
	public void i_sub_those_two_numbers() {
		result = num1 - num2;
	}

	@Given("I have below numbers")
	public void i_have_below_numbers(List<Integer> numbers) {
		this.values = numbers;
	}

	@When("I add those numbers")
	public void i_add_those_numbers() {
		for (int num : values) {
			result = result + num;
		}

	}

}
