package cl.cenco.qa.questions;

import cl.cenco.qa.ui.LoggedInAreaView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class LoggedInQuestions implements Question {

    @Step
    @Override
    public String answeredBy(Actor actor) {
        return LoggedInAreaView.yourFeedLabel.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new LoggedInQuestions();
    }
}
