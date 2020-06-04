package co.com.AutomatizacionWeb.reto1.tasks;

import co.com.AutomatizacionWeb.reto1.userinterface.AutomationWebPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Access implements Task {
    private AutomationWebPage automationWebPage;
    public static Access thePage() {
        return Tasks.instrumented(Access.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationWebPage));

    }
}
