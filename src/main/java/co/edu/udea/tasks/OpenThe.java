package co.edu.udea.tasks;

import co.edu.udea.interactions.BancolombiaHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

public class OpenThe implements Task {

    private PageObject page;
    private WebDriver driver;

    public OpenThe(PageObject page, WebDriver driver) {
        this.page = page;
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(BancolombiaHomePage.go(driver));
    }

    public static OpenThe Browser(PageObject page, WebDriver driver) {
        return Tasks.instrumented(OpenThe.class, page, driver);
    }
}
