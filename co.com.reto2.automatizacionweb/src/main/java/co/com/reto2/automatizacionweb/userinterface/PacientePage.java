package co.com.reto2.automatizacionweb.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PacientePage extends PageObject {

    public static final Target BOTON_AGREGARPACIENTE =
            Target.the("Dar Click en el boton Agregar Paciente")
                    .located(By.xpath("//A[@href='addPatient']"));

    public static final Target NOMBRE_PACIENTE =
            Target.the("Ingresar el Nombre del Paciente")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[1]/input"));

    public static final Target APELLIDO_PACIENTE =
            Target.the("Ingresar apellido Paciente")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[2]/input"));

    public static final Target TELEFONO_PACIENTE =
            Target.the("Ingresar Telefono Paciente")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[3]/input"));

    public static final Target TIPOIDENTIFICACION_PACIENTE =
            Target.the("Seleccionar el Tipo de Identidad del Paciente")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/select"));

    public static final Target DOCUMENTOIDENTIFICACION_PACIENTE =
            Target.the("Ingresar el Numero del Documento de Indentidad")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[5]/input"));

    public static final Target SALUD_PREPAGADA =
            Target.the("Dar Click al Check")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[6]/label/input"));

    public static final Target GUARDAR_REGISTROPACIENTE =
            Target.the("Dar Click en el boton Guardar")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));

    public static final Target INGRESO_EXITOSO =
            Target.the("verificar el Ingreso Exitoso del Paciente")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[2]/p"));


}
