package co.edu.udea.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import java.security.SecureRandom;
import java.time.Duration;

import static co.edu.udea.userinterfaces.BancolombiaPage.*;

public class BancolombiaHomePage implements Interaction {

    private WebDriver driver;

    public BancolombiaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SecureRandom random = new SecureRandom();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("localStorage.setItem('ShowPrehome', 'true');");

        actor.attemptsTo(Click.on(KNOW_MORE_CREDIT_BUTTON));

        actor.attemptsTo(Click.on(SIMULATE_CREDIT_BUTTON));

        actor.attemptsTo(Click.on(CONTINUE_CREDIT_BUTTON));

        actor.attemptsTo(Click.on(YES_RADIO));

        int randomAmount = random.nextInt(499999001) + 1000000;
        actor.attemptsTo(Enter.theValue("" + randomAmount).into(AMOUNT_INPUT).thenHit(Keys.RETURN));

        int randomMonths = random.nextInt(37) + 48;
        actor.attemptsTo(Enter.theValue("" + randomMonths).into(MONTHS_INPUT).thenHit(Keys.RETURN));

        actor.attemptsTo(Click.on(CALENDAR_INPUT));

        actor.attemptsTo(Click.on(CALENDAR_YEAR_BUTTON));

        actor.attemptsTo(Click.on(CALENDAR_MONTH_BUTTON));

        actor.attemptsTo(Click.on(CALENDAR_DAY_BUTTON));

        actor.attemptsTo(Click.on(SIMULATE_BUTTON));
    }

    public static BancolombiaHomePage go(WebDriver driver) {
        return Tasks.instrumented(BancolombiaHomePage.class, driver);
    }
}
