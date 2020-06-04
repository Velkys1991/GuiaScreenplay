package co.com.reto2.automatizacionweb.stepdefinitions;

import co.com.reto2.automatizacionweb.model.RegistroData;
import co.com.reto2.automatizacionweb.model.RegistroDataC;
import co.com.reto2.automatizacionweb.model.RegistroDataModel;
import co.com.reto2.automatizacionweb.questions.Answer;
import co.com.reto2.automatizacionweb.questions.AnswerCita;
import co.com.reto2.automatizacionweb.questions.AnswerPaciente;
import co.com.reto2.automatizacionweb.tasks.OpenUp;
import co.com.reto2.automatizacionweb.tasks.RegistroCita;
import co.com.reto2.automatizacionweb.tasks.RegistroDoctor;
import co.com.reto2.automatizacionweb.tasks.RegistroPaciente;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SistemaAdministracionStepDefinitions {

// Carga Registro Doctor
        @Before
        public void setStage() { OnStage.setTheStage(new OnlineCast()); }

        @Given("^que Carlos necesita registrar un nuevo doctor$")
        public void queCarlosNecesitaRegistrarUnNuevoDoctor() {
            OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
        }

        @When("^el realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
        public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministraciónDeHospitales(List<RegistroDataModel> registroDataModel)  {
            OnStage.theActorInTheSpotlight().attemptsTo(RegistroDoctor.onthepage(registroDataModel));
        }

        @Then("^el verifica que se presente en pantalla el mensaje (.*)$")
        public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String question)  {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

        }

        // Carga Registro Paciente

        @Given("^que Carlos necesita registrar un nuevo paciente$")
        public void queCarlosNecesitaRegistrarUnNuevoPaciente(){
            OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());

        }
    @When("^el realiza el registro del mismo en el aplicativo de Administración del Hospital$")
    public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministraciónDelHospital(List<RegistroData>registroData)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroPaciente.onthepage(registroData));

    }


    @Then("^el verifica que se presente en la pantalla el mensaje (.*)$")
    public void elVerificaQueSePresenteEnLaPantallaElMensajeDatosGuardadosCorrectamente(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPaciente.toThe(question)));
    }

// Carga Resgistro Cita Médica

    @Given("^que Carlos necesita asistir al medico$")
    public void queCarlosNecesitaAsistirAlMedico()  {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }


    @When("^el realiza el agendamiento de una Cita$")
    public void elRealizaElAgendamientoDeUnaCita(List<RegistroDataC>registroDataC)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroCita.onthepage(registroDataC));
    }

    @Then("^el verifica se presente en pantalla el mensaje (.*)$")
    public void elVerificaSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCita.toThe(question)));
    }


    }


