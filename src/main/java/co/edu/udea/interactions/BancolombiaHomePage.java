package co.edu.udea.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.userinterfaces.BancolombiaPage.*;

public class BancolombiaHomePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO: click en Conoce más de nuestros productos > Saber más
        actor.attemptsTo(Click.on(KNOW_MORE_CREDIT_BUTTON));

        // TODO: click en Crédito de libre inversión Bancolombia > Simular
        actor.attemptsTo(Click.on(SIMULATE_CREDIT_BUTTON));

        // TODO: click en Continuar
        actor.attemptsTo(Click.on(CONTINUE_CREDIT_BUTTON));

        // TODO: click en Si
        actor.attemptsTo(Click.on(YES_RADIO));

        // TODO: escribir un numero entre 1.000.000 y 500.000.000 y dar Enter
        int randomAmount = (int) (Math.random() * (500000000 - 1000000 + 1)) + 1000000;
        actor.attemptsTo(Enter.theValue("" + randomAmount).into(AMOUNT_INPUT).thenHit(Keys.RETURN));

        int randomMonths = (int) (Math.random() * (84 - 48 + 1)) + 48;
        // TODO: escribir numero entre 48 y 84 en ¿A cuantos meses? y dar Enter
        actor.attemptsTo(Enter.theValue("" + randomMonths).into(MONTHS_INPUT).thenHit(Keys.RETURN));

        // TODO: click en Calendario
        actor.attemptsTo(Click.on(CALENDAR_INPUT));

        // TODO: click en un año
        actor.attemptsTo(Click.on(CALENDAR_YEAR_BUTTON));

        // TODO: click en un mes
        actor.attemptsTo(Click.on(CALENDAR_MONTH_BUTTON));

        // TODO: click en un dia
        actor.attemptsTo(Click.on(CALENDAR_DAY_BUTTON));

        // TODO: Click en simular
        actor.attemptsTo(Click.on(SIMULATE_BUTTON));
    }

    public static BancolombiaHomePage go() {
        return Tasks.instrumented(BancolombiaHomePage.class);
    }
}
