package co.com.reto2.automatizacionweb.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Seleccionar implements Interaction {
    private Target lista;
    private String opcion;

    public Seleccionar(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement>listOjeto = lista.resolveFor(actor).findElements(By.tagName("option"));
        for(int i=0;i<listOjeto.size();i++){
            if(listOjeto.get(i).getText().equals(opcion)) {
                listOjeto.get(i).click();
                break;
            }
            }
        }

        public static Seleccionar lalista(Target lista,String opcion){
        return new Seleccionar(lista, opcion);

    }
}
