package cl.cenco.qa.questions;

import cl.cenco.qa.ui.LoginView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class MessageErrorQuestions implements Question{

    @Override
    public String answeredBy(Actor actor) {
        return LoginView.errorLabel.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new MessageErrorQuestions();
    }
}
