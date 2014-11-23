package ip.lab.teme.mvc.models;

import java.util.Random;

/**
 * Created by Andrei on 23.11.2014.
 *
 * This class is the model
 * This model does all the calculation needed
 */
public class WeatherModel {
    private int randomTemperature;
    private int randomWindSpeed;

    /**
     * This method sets random values to temperature and wind speed
     */
    public void addRandomValues(){
        Random randomGenerator=new Random();
        randomTemperature=randomGenerator.nextInt(50);
        randomWindSpeed=randomGenerator.nextInt(100);
    }

    /**
     * This method gets the temperature
     * @return the value of temperature
     */
     public int getRandomTemperature(){
         return this.randomTemperature;
     }

    /**
     * This method gets the speed of wind
     * @return the value of speed
     */
    public int getRandomWindSpeed(){
        return this.randomWindSpeed;
    }
}
