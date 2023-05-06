package co.edu.udea.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.userinterfaces.BancolombiaPage.CREDIT_INFORMATION_AMOUNT_TEXT;

public class Validation implements Question<Boolean> {

    private final String EXPECTED_CHARACTER = "$";

    @Override
    public Boolean answeredBy(Actor actor) {
        String validationText = Text.of(CREDIT_INFORMATION_AMOUNT_TEXT).viewedBy(actor).asString();
        return validationText.contains(EXPECTED_CHARACTER);
    }

    public static Validation theSimulationPage() {
        return new Validation();
    }
}
