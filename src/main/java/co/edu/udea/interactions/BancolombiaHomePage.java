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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
             WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='closeModalBtn']")));
           if (closeButton != null) {
               closeButton.click();
           }
        } catch (TimeoutException e) {
            System.out.println("El botón no se hizo cliqueable dentro del tiempo límite.");
        }

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
