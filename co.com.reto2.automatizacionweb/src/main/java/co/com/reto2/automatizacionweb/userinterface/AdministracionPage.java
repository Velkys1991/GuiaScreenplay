package co.com.reto2.automatizacionweb.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdministracionPage extends PageObject {

    public static final Target BOTON_AGREGARDOCTOR =
            Target.the("Dar Click en el boton Agregar Doctor")
                    .located(By.xpath("//A[@href='addDoctor']"));

    public static final Target NOMBRE_ENTRADA =
            Target.the("Insertar el Nombre")
                    .located(By.id("name"));

    public static final Target APELLIDO_ENTRADA =
            Target.the("Insertar el Apellido")
                    .located(By.id("last_name"));

    public static final Target TELEFONO_ENTRADA =
            Target.the("Insertar el Telefono")
                    .located(By.id("telephone"));

    public static final Target TIPODOCUMENTO_SELECCIONAR =
            Target.the("Seleccionar el Tipo de Documento")
                    .located(By.id("identification_type"));

    public static final Target DOCUMENTOINDENTIFICACION_ENTRADA =
            Target.the("Insertar el Documento de Identidad")
                    .located(By.id("identification"));

    public static final Target BOTON_GUARDAR =
            Target.the("Dar Click en el boton Guardar")
                    .located(By.xpath("//A[@onclick='submitForm()'][text()='Guardar']"));

    public static final Target INGRESO_EXITOSO =
            Target.the("Verificar la creacion exitosa del registro")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[2]"));

}
