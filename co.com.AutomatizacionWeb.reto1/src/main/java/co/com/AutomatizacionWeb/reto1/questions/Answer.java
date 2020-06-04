package co.com.AutomatizacionWeb.reto1.questions;

import co.com.AutomatizacionWeb.reto1.userinterface.AutomationWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
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
        String nameCheck= Text.of(AutomationWebPage.NAME_CHECK).viewedBy(actor).asString();
        if (question.equals(nameCheck)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
