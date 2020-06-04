package co.com.reto2.automatizacionweb.tasks;

import co.com.reto2.automatizacionweb.interactions.Seleccionar;
import co.com.reto2.automatizacionweb.model.RegistroDataModel;
import co.com.reto2.automatizacionweb.userinterface.AdministracionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

public class RegistroDoctor implements Task {

    private List<RegistroDataModel> registroDataModel;

    public RegistroDoctor(List<RegistroDataModel> registroDataModel) {
        this.registroDataModel = registroDataModel;
    }

    public static RegistroDoctor onthepage(List<RegistroDataModel> registroDataModel) {
        return Tasks.instrumented(RegistroDoctor.class,registroDataModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AdministracionPage.BOTON_AGREGARDOCTOR));
        actor.attemptsTo(
                Enter.theValue(registroDataModel.get(0).getNombre()).into(AdministracionPage.NOMBRE_ENTRADA),
                Enter.theValue(registroDataModel.get(0).getApellido()).into(AdministracionPage.APELLIDO_ENTRADA),
                Enter.theValue(registroDataModel.get(0).getTelefono()).into(AdministracionPage.TELEFONO_ENTRADA),
                Seleccionar.lalista(AdministracionPage.TIPODOCUMENTO_SELECCIONAR,registroDataModel.get(0).getTipoDocumento()),
                Enter.theValue(registroDataModel.get(0).getDocumentoIdentidad()).into(AdministracionPage.DOCUMENTOINDENTIFICACION_ENTRADA),
                Click.on(AdministracionPage.BOTON_GUARDAR)
        );

    }
}
