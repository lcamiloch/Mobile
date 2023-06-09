package cl.cenco.qa.task;

import cl.cenco.qa.ui.LoginView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class Login implements Task {

    private final String email;
    private final String password;

    public Login(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(email).into(LoginView.userInput),
                SendKeys.of(password).into(LoginView.passwordInput),
                Click.on(LoginView.signInButton));
    }
}