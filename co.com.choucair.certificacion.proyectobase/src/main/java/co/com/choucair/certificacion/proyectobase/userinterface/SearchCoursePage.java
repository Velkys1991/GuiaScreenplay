package co.com.choucair.certificacion.proyectobase.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("select choucair university")
            .located(By.xpath("(//DIV[@class='card-header'])[1]"));
    public static final Target INPUT_COURSE = Target.the("Find the course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click to search the course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Click to select the course")
            .located(By.xpath("//H4[text()='Automatización de Pruebas']"));
    public static final Target NAME_COURSE = Target.the("Check course title")
            .located(By.xpath("//H1[text()='Automatización de Pruebas']"));
}
