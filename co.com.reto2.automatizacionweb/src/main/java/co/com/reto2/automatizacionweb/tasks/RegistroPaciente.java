package co.com.reto2.automatizacionweb.tasks;

import co.com.reto2.automatizacionweb.interactions.Seleccionar;
import co.com.reto2.automatizacionweb.model.RegistroData;
import co.com.reto2.automatizacionweb.userinterface.AdministracionPage;
import co.com.reto2.automatizacionweb.userinterface.PacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegistroPaciente implements Task {
    private List<RegistroData> registroData;

    public RegistroPaciente(List<RegistroData> registroData) {
        this.registroData = registroData;
    }

    public static RegistroPaciente onthepage(List<RegistroData> registroData) {
        return Tasks.instrumented(RegistroPaciente.class,registroData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PacientePage.BOTON_AGREGARPACIENTE));
        actor.attemptsTo(Enter.theValue(registroData.get(0).getNombre()).into(PacientePage.NOMBRE_PACIENTE),
                Enter.theValue(registroData.get(0).getApellido()).into(PacientePage.APELLIDO_PACIENTE),
                Enter.theValue(registroData.get(0).getTelefono()).into(PacientePage.TELEFONO_PACIENTE),
                Seleccionar.lalista(PacientePage.TIPOIDENTIFICACION_PACIENTE,registroData.get(0).getTipoDocumento()),
                Enter.theValue(registroData.get(0).getDocumentoIdentidad()).into(PacientePage.DOCUMENTOIDENTIFICACION_PACIENTE),
                Click.on(PacientePage.SALUD_PREPAGADA),
                Click.on(PacientePage.GUARDAR_REGISTROPACIENTE)
        );

    }
}
