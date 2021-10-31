package stepdefinions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import expections.ManageException;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.Confirmation;
import tasks.RegisterTask;
import userinsterfaces.Register;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepdefinion {

    @Managed
    private WebDriver hisBrower;


    @Given("^user  was navigated for the web$")
    public void userWasNavigatedForTheWeb() {
        OnStage.setTheStage(Cast.ofStandardActors()); //Inicia el ecenario
        OnStage.theActorCalled("The User"); // Llama el actor con el nombre que quiera.
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrower)); // Inicializa el webdriver
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/")); // abre el navegador
    }


    @When("^create new user$")
    public void createNewUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.inthepage());
    }

    @Then("^successful user creation$")
    public void successfulUserCreation() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Confirmation.textfinish(),Matchers.is(Matchers.equalTo("Welcome to the world's largest community of freelance software testers!")))
                .orComplainWith(ManageException.class,"No se realizo el registro correctamente"));

    }
}
