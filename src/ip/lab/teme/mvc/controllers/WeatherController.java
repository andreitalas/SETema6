package ip.lab.teme.mvc.controllers;

import ip.lab.teme.mvc.models.WeatherModel;
import ip.lab.teme.mvc.views.WeatherView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Andrei on 23.11.2014.
 *
 * This class is the controller
 * This controller coordinates interactions between the view and model
 */
public class WeatherController {
    private WeatherModel model;
    private WeatherView view;

    /**
     * This method is the constructor of the controller
     * @param model is the model
     * @param view is the view
     */
    public WeatherController(WeatherModel model,WeatherView view){
        this.model=model;
        this.view=view;
        this.view.addListener(new WeatherListener());
    }

    class WeatherListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try{
                model.addRandomValues();
                view.setTemperatureValue(model.getRandomTemperature());
                view.setWindSpeedValue(model.getRandomWindSpeed());
            }
            catch(Exception exception){
                System.out.println(exception);
                view.displayErrorMessage("Error");
            }

        }
    }
}
