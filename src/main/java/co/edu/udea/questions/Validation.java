package co.edu.udea.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.userinterfaces.BancolombiaPage.RATES_AND_FEES_TEXT;

public class Validation implements Question<Boolean> {

    private static final String EXPECTED_CHARACTER = "Te ofrecemos";

    @Override
    public Boolean answeredBy(Actor actor) {
        String validationText = actor.asksFor(Text.of(RATES_AND_FEES_TEXT).asString());
        System.out.println(String.format("Result: %s", validationText));
        return validationText.contains(EXPECTED_CHARACTER);
    }

    public static Validation theSimulationPage() {
        return new Validation();
    }
}
