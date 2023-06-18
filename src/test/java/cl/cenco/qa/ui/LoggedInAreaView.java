package cl.cenco.qa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class LoggedInAreaView {

    public static Target yourFeedLabel = Target.the(
            "Your feed label").located(By.xpath("(//android.widget.extView)[1]"));
}
