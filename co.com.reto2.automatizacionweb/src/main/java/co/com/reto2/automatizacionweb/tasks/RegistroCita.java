package co.com.reto2.automatizacionweb.tasks;

import co.com.reto2.automatizacionweb.model.RegistroDataC;
import co.com.reto2.automatizacionweb.userinterface.AdministracionPage;
import co.com.reto2.automatizacionweb.userinterface.CitaMedicaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegistroCita implements Task {
    private List<RegistroDataC> registroDataC;

    public RegistroCita(List<RegistroDataC> registroDataC) {
        this.registroDataC = registroDataC;
    }

    public static RegistroCita onthepage(List<RegistroDataC> registroDataC) {
        return Tasks.instrumented(RegistroCita.class,registroDataC);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CitaMedicaPage.BOTON_AGENDARCITA));
        actor.attemptsTo(
                Enter.theValue(registroDataC.get(0).getDiaCita()).into(CitaMedicaPage.DIA_CITA),
                Enter.theValue(registroDataC.get(0).getDocumentoIdentidadPaciente()).into(CitaMedicaPage.IDENTIDAD_PACIENTE),
                Enter.theValue(registroDataC.get(0).getDocumentoIdentidadDoctor()).into(CitaMedicaPage.IDENTIDAD_DOCTOR),
                Enter.theValue(registroDataC.get(0).getObservaciones()).into(CitaMedicaPage.OBSERVACION),
                Click.on(CitaMedicaPage.BOTON_GUARDARCITA)
        );
    }
}
