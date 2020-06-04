package co.com.reto2.automatizacionweb.questions;

import co.com.reto2.automatizacionweb.userinterface.CitaMedicaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerCita implements Question<Boolean> {
    private String question;

    public AnswerCita(String question) {
        this.question = question;
    }

    public static AnswerCita toThe(String question) {
        return new AnswerCita(question);
    }



    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String ingresoexitoso= Text.of(CitaMedicaPage.INGRESO_EXITOSO).viewedBy(actor).asString();
        if (question.equals(ingresoexitoso)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
