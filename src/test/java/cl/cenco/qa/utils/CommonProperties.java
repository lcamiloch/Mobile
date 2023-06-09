package cl.cenco.qa.utils;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @autor: Camilo Chaparro
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class CommonProperties {

    static Properties prop;
    static FileInputStream file;

    public static String getParameter(String variable){
        prop = new Properties();
        try{
            file = new FileInputStream(
                    "src/test/resources/config.properties");
            prop.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(variable);
    }
}
