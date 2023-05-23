package co.edu.udea.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;

import static co.edu.udea.userinterfaces.BancolombiaPage.*;

public class BancolombiaHomePage implements Interaction {

    private WebDriver driver;

    public BancolombiaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SecureRandom random = new SecureRandom();
        WebDriverWait wait = new WebDriverWait(driver, 120);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body[@id='content']/div[2]/div[@id='layoutContainers']/div[@class='wpthemeInner']/div[@class='wptheme1Col']/div[@class='component-container wpthemeLeft wpthemeCol ibmDndColumn wpthemeCol12of12 wpthemeFull wpthemePrimary id-Z7_U7URPIEM9PR62GAUKF3MU4AN43']/div[@class='component-control id-Z7_OHHGG4G0PGU0C06S3PCNGIHR85']/section[@class='ibmPortalControl wpthemeNoSkin a11yRegionTarget']/div[@class='wpthemeOverflowAuto']/div[@id='container-modal']/section[@id='container-prehome']/div[@class='row-modal-prehome']/div[@class='container-btn-close-prehome']/button[@id='closeModalBtn']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body[@id='content']/div[2]/div[@id='layoutContainers']/div[@class='wpthemeInner']/div[@class='wptheme1Col']/div[@class='component-container wpthemeLeft wpthemeCol ibmDndColumn wpthemeCol12of12 wpthemeFull wpthemePrimary id-Z7_U7URPIEM9PR62GAUKF3MU4AN43']/div[@class='component-control id-Z7_OHHGG4G0PGU0C06S3PCNGIHR85']/section[@class='ibmPortalControl wpthemeNoSkin a11yRegionTarget']/div[@class='wpthemeOverflowAuto']/div[@id='container-modal']/section[@id='container-prehome']/div[@class='row-modal-prehome']/div[@class='container-btn-close-prehome']/button[@id='closeModalBtn']")));
        actor.attemptsTo(Click.on(CLOSE_DISCOVER_MORE_BUTTON));

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
