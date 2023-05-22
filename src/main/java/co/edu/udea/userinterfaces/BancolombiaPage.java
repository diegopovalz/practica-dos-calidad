package co.edu.udea.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaPage extends PageObject {

    public static final Target CLOSE_DISCOVER_MORE_BUTTON = Target.the("Discover more button").locatedBy("//*[@id='closeModalBtn']");
    public static final Target KNOW_MORE_CREDIT_BUTTON = Target.the("Know more button").locatedBy("//*[@id='home-conoce-mas-productos']/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target SIMULATE_CREDIT_BUTTON = Target.the("Simulate credit button").locatedBy("//*[@id='creditos']/div/div[1]/div[11]/div/div[2]/div/a[1]/span/span");
    public static final Target CONTINUE_CREDIT_BUTTON = Target.the("Continue credit button").locatedBy("//*[@id='boton-seleccion-tarjeta']");
    public static final Target YES_RADIO = Target.the("Yes radio").locatedBy("//*[@id='opcion-si']");
    public static final Target AMOUNT_INPUT = Target.the("Amount input").locatedBy("//*[@id='valor-simulacion']");
    public static final Target MONTHS_INPUT = Target.the("Months input").locatedBy("//*[@id='valor-plazo']");
    public static final Target CALENDAR_INPUT = Target.the("Calendar input").locatedBy("//*[@id='campo-fecha']");
    public static final Target CALENDAR_YEAR_BUTTON = Target.the("Year button").locatedBy("//*[@id='mat-datepicker-0']/div/mat-multi-year-view/table/tbody/tr[1]/td[1]");
    public static final Target CALENDAR_MONTH_BUTTON = Target.the("Month button").locatedBy("//*[@id='mat-datepicker-0']/div/mat-year-view/table/tbody/tr[2]/td[3]");
    public static final Target CALENDAR_DAY_BUTTON = Target.the("Day button").locatedBy("//*[@id='mat-datepicker-0']/div/mat-month-view/table/tbody/tr[4]/td[5]");
    public static final Target SIMULATE_BUTTON = Target.the("Simulate button").locatedBy("//*[@id='boton-simular']");
    public static final Target RATES_AND_FEES_TEXT = Target.the("Rates and fees").locatedBy("//*[@id='mat-expansion-panel-header-1']/span[1]/mat-panel-title");
}
