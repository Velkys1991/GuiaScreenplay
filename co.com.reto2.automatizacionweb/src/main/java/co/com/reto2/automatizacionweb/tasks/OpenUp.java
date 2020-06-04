package co.com.reto2.automatizacionweb.tasks;

import co.com.reto2.automatizacionweb.userinterface.AdministracionHospitalesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private AdministracionHospitalesPage administracionHospitalesPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(administracionHospitalesPage)

        );

    }

}
