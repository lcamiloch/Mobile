package cl.cenco.qa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class HomeView{

    public static Target loginLink = Target.the(
            "Login Link").located(By.xpath(
                    "//android.widget.Button[@content-desc=\"Login, tab, 2 of 2\"]/android.widget.ImageView"));
}
