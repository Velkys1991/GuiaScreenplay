package co.com.choucair.certificacion.proyectobase.stepdefinitions;
import co.com.choucair.certificacion.proyectobase.questions.Answer;
import co.com.choucair.certificacion.proyectobase.tasks.Login;
import co.com.choucair.certificacion.proyectobase.tasks.OpenUp;
import co.com.choucair.certificacion.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Velkys wants to learn automation at the Choucair Academy$")
    public void thanVelkysWantsToLearnAutomationAtTheChoucairAcademy()  {
          OnStage.theActorCalled("Velkys").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }


    @When("^he search for the course (.*) on the Choucair Academy platform$")
    public void heSearchForTheCourseAutomatizaciondePruebasOnTheChoucairAcademyPlatform(String course)  {
           OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledAutomatizacionDePruebas(String question)   {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
