package co.com.AutomatizacionWeb.reto1.interactions;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Select implements Interaction {
private Target lista;
private String opcion;


    public Select(Target lista, String opcion){
        this.lista = lista;
        this.opcion = opcion;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.tagName("li"));
        for(int i=0; i < listObjeto.size(); i++){
            if(listObjeto.get(i).getText().equals(opcion)) {
                listObjeto.get(i).click();
                break;
            }
            }
        }
    public static Select theList(Target lista, String opcion) {
        return new Select(lista, opcion);

    }

    }
