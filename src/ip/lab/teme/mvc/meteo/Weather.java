package ip.lab.teme.mvc.meteo;

/**
 * Created by Andrei on 23.11.2014.
 * This is the weather class
 */
public class Weather {
    private int temperature;
    private int windSpeed;

    /**
     * This method gets the temperature
     * @return the value of temperature
     */
    public int getTemperature(){
        return temperature;
    }

    /**
     * This method sets the temperature
     * @param temperature is the value of temperature
     */
    public void setTemperature(int temperature){
        this.temperature=temperature;
    }

    /**
     * This method gets the speed of wind
     * @return the value of speed
     */
    public int getWindSpeed(){
        return windSpeed;
    }

    /**
     * This method sets the speed of wind
     * @param windSpeed is the value of speed
     */
    public void setWindSpeed(int windSpeed){
        this.windSpeed=windSpeed;
    }
}
