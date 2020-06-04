package co.com.reto2.automatizacionweb.questions;

import co.com.reto2.automatizacionweb.userinterface.PacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerPaciente  implements Question<Boolean> {

    private String question;

    public AnswerPaciente(String question) {
        this.question = question;
    }

    public static AnswerPaciente toThe(String question) {

        return new AnswerPaciente(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
     boolean result;
    String ingresoexitoso= Text.of(PacientePage.INGRESO_EXITOSO).viewedBy(actor).asString();
        if (question.equals(ingresoexitoso)) {
        result = true;
    }else {
        result = false;
    }
        return result;
}
}
