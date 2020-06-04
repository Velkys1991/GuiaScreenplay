package co.com.AutomatizacionWeb.reto1.interactions;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Select2 implements Interaction {

    private Target list;
    private String opcion;


    public Select2(Target list, String opcion) {
        this.list = list;
        this.opcion = opcion;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listObjeto = list.resolveFor(actor).findElements(By.tagName("option"));
        for(int i=0; i < listObjeto.size(); i++){
            if(listObjeto.get(i).getText().equals(opcion)) {
                listObjeto.get(i).click();
                break;
            }
        }
    }
    public static Select2 theList(Target list, String opcion) {
        return new Select2(list, opcion);

    }

}


