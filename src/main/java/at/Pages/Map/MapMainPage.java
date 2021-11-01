package at.Pages.Map;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class MapMainPage{
    public void clickBuildRoute(){
        try {
            $(byClassName("route-control__inner")).click();
        }catch (Exception|Error e){
            $(byXpath("//*[@id='Y-A-290757-1']/div[1]/a")).click();
            $(byClassName("route-control__inner")).click();
        }
    }

    public void setBeginRoad(String value) {
        $(by("placeholder","Откуда")).setValue(value).pressEnter();
    }
    public void setEndRoad(String value) {
        $(byAttribute("placeholder","Куда")).setValue(value).pressEnter();
    }
    public void chooseTransport(String transport){
        try{
            $(byCssSelector("[class$= \""+transport+"\"]")).should(Condition.enabled).click();
        }catch (Exception|Error ignored){
            $(byCssSelector("[class$= \""+transport+" _checked"+"\"]")).click();
        }
    }
}
