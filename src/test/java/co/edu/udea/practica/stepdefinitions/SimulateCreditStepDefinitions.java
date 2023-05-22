package co.edu.udea.practica.stepdefinitions;

import co.edu.udea.questions.Validation;
import co.edu.udea.tasks.OpenThe;
import co.edu.udea.userinterfaces.BancolombiaPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SimulateCreditStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;

    private Actor client = Actor.named("Cliente");

    @Before
    public void setup() {
        driver.manage().window().maximize();
        client.can(BrowseTheWeb.with(driver));
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @Given("that I am at the homepage of Bancolombia")
    public void thatIAmAtTheHomepageOfBancolombia() {
        client.can(BrowseTheWeb.with(driver));
    }

    @When("I go to the Credit Simulation option")
    public void iGoToTheCreditSimulationOption () {
        client.attemptsTo(OpenThe.Browser(new BancolombiaPage(), driver));
    }

    @Then("I can see the result of the simulation")
    public void iCanSeeTheResultOfTheSimulation() {
        client.should(seeThat(Validation.theSimulationPage(), equalTo(true)));
    }
}
