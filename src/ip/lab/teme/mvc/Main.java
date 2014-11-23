package ip.lab.teme.mvc;

import ip.lab.teme.mvc.controllers.WeatherController;
import ip.lab.teme.mvc.models.WeatherModel;
import ip.lab.teme.mvc.views.WeatherView;

/**
 * Created by Andrei on 23.11.2014.
 *
 * This is the main class
 */
public class Main {
    /**
     * This is also the entry point
     * @param args is an array of arguments
     */
    public static void main(String[] args){
        WeatherView view = new WeatherView();
        WeatherModel model = new WeatherModel();
        WeatherController theController = new WeatherController(model,view);
        view.setVisible(true);
    }
}
