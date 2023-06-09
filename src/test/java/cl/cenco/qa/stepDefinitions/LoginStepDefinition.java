package cl.cenco.qa.stepDefinitions;

import cl.cenco.qa.questions.LoggedInQuestions;
import cl.cenco.qa.questions.MessageErrorQuestions;
import cl.cenco.qa.task.Login;
import cl.cenco.qa.task.NavigateTo;
import cl.cenco.qa.utils.CommonProperties;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class LoginStepDefinition {

    @Managed(driver = "Appium")
    public WebDriver driver;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the customer is on the login page of the app")
    public void initialStep() {
        theActorCalled("Tester").attemptsTo(new NavigateTo());
    }

    @When("^he types user (.*) and password (.*)$")
    public void he_types_user_and_password(String email, String password) {
        theActorInTheSpotlight().attemptsTo(new Login(email, password));
    }

    @Then("he should see the home page of the app")
    public void he_should_see_the_home_page_of_the_app() {
        String expectedText = "Your feed";
        theActorInTheSpotlight().should(seeThat(
                "Your feed label",
                LoggedInQuestions.value(),
                equalTo(CommonProperties.getParameter("expectedTextSuccessful"))));
    }

    @Then("he should see a error")
    public void validationError(){
        theActorInTheSpotlight().should(seeThat(
                "Error message",
                MessageErrorQuestions.value(),
                containsString(CommonProperties.getParameter("expectedTextFailed"))));
    }
}
