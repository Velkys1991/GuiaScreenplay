package co.com.reto2.automatizacionweb.questions;

import co.com.reto2.automatizacionweb.userinterface.AdministracionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer  implements Question<Boolean>  {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String ingresoexitoso= Text.of(AdministracionPage.INGRESO_EXITOSO).viewedBy(actor).asString();
        if (question.equals(ingresoexitoso)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
