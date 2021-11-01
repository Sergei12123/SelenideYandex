package at.Steps;

import at.Context;
import at.Pages.Applications;
import at.helpers.HookHelper;
import io.cucumber.java.ru.Когда;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class UniversalSteps{
    @Когда("^заходит в приложение (Яндекс.Карты|Яндекс.Погода|Яндекс)")
    public void goTo(String application){

        switch (application) {
            case "Яндекс.Карты":
                Context.saveObject("Информация о приложении", Applications.MAP);
                break;
        }
        String fullUrl= HookHelper.getEnvironment().getMainUrl()+ HookHelper.getEnvironment().getAppUrl(application);
        open(fullUrl);
    }
}
