package cl.cenco.qa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class LoginView {

    public static Target userInput = Target.the(
            "User Input").located(By.xpath("(//android.widget.EditText)[1]"));
    public static Target passwordInput = Target.the(
            "Password Input").located(By.xpath("(//android.widget.EditText)[2]"));
    public static Target signInButton = Target.the(
            "Sign in Button").located(By.xpath("(//android.widget.TextView)[3]"));
    public static Target errorLabel= Target.the(
            "Error Label").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));
}
