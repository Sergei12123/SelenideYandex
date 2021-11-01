package at.Steps;

import at.Pages.Map.MapMainPage;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

import java.util.Map;

public class MapSteps {
    @Когда("строит маршрут")
    public void buildRoute(Map<String,String> route){
        MapMainPage mapMainPage=new MapMainPage();
        mapMainPage.clickBuildRoute();
        for(Map.Entry<String,String> entry: route.entrySet()){
            switch (entry.getKey()){
                case "Точка отправления":
                    mapMainPage.setBeginRoad(entry.getValue());
                    break;
                case "Точка назначения":
                    mapMainPage.setEndRoad(entry.getValue());
                    break;

            }
        }
    }

    @И("^выбирает транспорт (Пешком|Общественный транспорт)")
    public void chooseTransport(String transport) {
        String transportEn="";
        switch (transport){
            case "Пешком":
                transportEn="pedestrian";
                break;
        }
        MapMainPage mapMainPage=new MapMainPage();
        mapMainPage.chooseTransport(transportEn);
    }
}
