package timecalculator.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import timecalculator.TimeCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeCalculatorEarthToVenusSteps{

    private TimeCalculator test;
    private double calculated;

    @Given("Instantiated TimeCalculator object")
    public void givenInstantiatedTimeCalculator(){
        test = new TimeCalculator();
    }

    @Then("After calculation I get <result> with calculation error <error>")
    public void thenAfterCalculationIGetResult(@Named("result") double result, @Named("error") double error){
        assertEquals(result, calculated, error);
    }

    @When("Set amount of seconds on earth to <time>")
    public void whenSetAmountOfSecondsOnEarth(@Named("time") double time){
        this.calculated = test.calculate("Wenus", time);
    }
}
