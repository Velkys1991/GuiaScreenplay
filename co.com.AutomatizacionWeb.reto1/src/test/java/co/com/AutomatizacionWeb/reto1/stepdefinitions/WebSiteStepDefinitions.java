package co.com.AutomatizacionWeb.reto1.stepdefinitions;

import co.com.AutomatizacionWeb.reto1.model.RegistrationDataModel;
import co.com.AutomatizacionWeb.reto1.questions.Answer;
import co.com.AutomatizacionWeb.reto1.tasks.Access;
import co.com.AutomatizacionWeb.reto1.tasks.Registration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class WebSiteStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast()); }

    @Given("^Carlos wants to access the Web Automation Demo Site$")
    public void carlosWantsToAccessTheWebAutomationDemoSite()  {
        OnStage.theActorCalled("Carlos").wasAbleTo(Access.thePage());
    }


    @When("^He performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<RegistrationDataModel> RegistrationDataModel)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Registration.inthesite(RegistrationDataModel));
    }

    @Then("^He verifies that the screen loads with text (.*)$")
    public void heVerifiesThatTheScreenLoadsWithTextDoubleClickOnEditIconToEDITTheTableRow(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}
