package at.Pages.Map;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

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
        $(byAttribute("placeholder","Откуда")).setValue(value).pressEnter();
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
