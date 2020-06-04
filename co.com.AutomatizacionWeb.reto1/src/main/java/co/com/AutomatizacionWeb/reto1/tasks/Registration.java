package co.com.AutomatizacionWeb.reto1.tasks;
import co.com.AutomatizacionWeb.reto1.interactions.Select;
import co.com.AutomatizacionWeb.reto1.interactions.Select2;
import co.com.AutomatizacionWeb.reto1.model.RegistrationDataModel;
import co.com.AutomatizacionWeb.reto1.userinterface.AutomationWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

public class Registration implements Task {

    private static RegistrationDataModel registrationDataModel;


    public static Registration inthesite(List<RegistrationDataModel> RegistrationDataModel) {

        registrationDataModel = RegistrationDataModel.get(0);
        return Tasks.instrumented(Registration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registrationDataModel.getFirstName()).into(AutomationWebPage.NAME_INPUT),
              Enter.theValue(registrationDataModel.getLastName()).into(AutomationWebPage.LASTNAME_INPUT),
              Enter.theValue(registrationDataModel.getAddress()).into(AutomationWebPage.ADDRRESS_INPUT),
              Enter.theValue(registrationDataModel.getEmailAddress()).into(AutomationWebPage.EMAIL_INPUT),
              Enter.theValue(registrationDataModel.getPhone()).into(AutomationWebPage.PHONE_INPUT),
              Click.on(AutomationWebPage.GENDER_SELECT),
              Click.on(AutomationWebPage.HOBBIES_SELECT),
              Click.on(AutomationWebPage.LANGUAGE_SELECT),
              Select.theList(AutomationWebPage.LANGUAGE_LIST, registrationDataModel.getLanguages()),
              Select2.theList(AutomationWebPage.SKILLS_LIST, registrationDataModel.getSkills()),
              Select2.theList(AutomationWebPage.COUNTRY_LIST, registrationDataModel.getCountry()),
              Select2.theList(AutomationWebPage.COUNTRY2_LIST, registrationDataModel.getSelectCountry()),
              Select2.theList(AutomationWebPage.YEAR_LIST, registrationDataModel.getYear()),
              Select2.theList(AutomationWebPage.MONTH_LIST, registrationDataModel.getMonth()),
              Select2.theList(AutomationWebPage.DAY_LIST, registrationDataModel.getDay()),
              Enter.theValue(registrationDataModel.getPassword()).into(AutomationWebPage.PASSWORD_INPUT),
              Enter.theValue(registrationDataModel.getConfirmPassword()).into(AutomationWebPage.PASSWORD2_INPUT),
              Click.on(AutomationWebPage.BUTTON_SUBMIT)


        );
    }
}
