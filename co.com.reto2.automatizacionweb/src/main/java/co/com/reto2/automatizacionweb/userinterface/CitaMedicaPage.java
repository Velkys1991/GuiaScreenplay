package co.com.reto2.automatizacionweb.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CitaMedicaPage extends PageObject {

    public static final Target BOTON_AGENDARCITA =
            Target.the("Dar Click en el boton Agendar Cita")
                    .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[6]"));

    public static final Target DIA_CITA =
            Target.the("Dar Click en el boton Agendar Cita")
                    .located(By.id("datepicker"));

    public static final Target IDENTIDAD_PACIENTE =
            Target.the("Ingresar Documento de Identidad del Paciente")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[2]/input"));

    public static final Target IDENTIDAD_DOCTOR =
            Target.the("Ingresar Documento de Identidad del Doctor")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[3]/input"));

    public static final Target OBSERVACION =
            Target.the("Agregar Observacion")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea"));

    public static final Target BOTON_GUARDARCITA =
            Target.the("Dar Click en el boton Agregar Paciente")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));

    public static final Target INGRESO_EXITOSO =
            Target.the("Verificar el Ingreso Exitoso de la Cita")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[2]/p"));


}
