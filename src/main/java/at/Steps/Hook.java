package at.Steps;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.log4j.Log4j2;
import at.helpers.HookHelper;

/**
 * Класс содержит действия для каждого сценария или шага
 */
@Log4j2
public class Hook {

    /**
     * Запуск браузера
     */
    @Before(value = "not @NoBrowser", order = 4)
    public void initializeWD() {
        HookHelper.initWebDriver();
    }

//    /**
//     * Вывод контекста и приложить скриншот в случае ошибки
//     *
//     * @param scenario тест
//     */
//    @After(order = 2)
//    public void addInformation(Scenario scenario) {
//        HookHelper.printContext();
//        if (scenario.isFailed()) {
//            HookHelper.makeScreenshot(true);
//        }
//    }

//    /**
//     * Очистить контекст
//     */
//    @After(order = 1)
//    public void clearContext() {
//        AllureHelper.execIgnoreException("Очистка", () ->
//        {
//            Context.clearLocalStorage();
//            return null;
//        });
//    }

    /**
     * Закрыть браузер и закрыть подключение к БД
     */
    @After(order = 0)
    public void clear() {
        HookHelper.clearWebDriver();
    }
}
