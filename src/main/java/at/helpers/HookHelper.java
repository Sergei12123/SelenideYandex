package at.helpers;


import org.junit.Assert;

import java.io.File;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class HookHelper {
    private static Environment environment;
    /**
     * Инициализация переменных для заданного стенда
     * @return Environment - свойство в формате xml
     */
    public static Environment getEnvironment() {
        if (environment != null)
            return environment;
        File xml = new File("src/main/resources/environments.xml");
        environment = new Environment(xml);
        return environment;
    }

    /**
     * Запустить браузер
     *
     */
    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
    }
    /**
     * Закрыть браузер
     */
    public static void clearWebDriver() {
        try {
            closeWebDriver();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
