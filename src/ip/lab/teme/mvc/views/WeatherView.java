package ip.lab.teme.mvc.views;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Andrei on 23.11.2014.
 * This is the view class
 * This view displays the information
 */
public class WeatherView extends JFrame{
    /*Those are the elements of the view*/
    private JLabel temperatureLabel= new JLabel("Temperature");
    private JTextField temperatureNumber  = new JTextField("50");
    private JLabel temperatureValueLabel= new JLabel("Celsius grades");
    private JLabel windSpeedLabel = new JLabel("Wind speed");
    private JTextField windSpeedNumber = new JTextField("50");
    private JLabel windSpeedValueLabel = new JLabel("km/h");
    private JButton updateButton = new JButton("Update");


    /**
     * This is the constructor of the view
     */
    public WeatherView(){
        /*Create a new panel*/
        JPanel weatherPanel = new JPanel();
        weatherPanel.setLayout(null);
        /*Add the elements to the panel*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        /*Set the location*/
        windSpeedLabel.setBounds(40,20,100,20);
        windSpeedNumber.setBounds(140,20,20,20);
        windSpeedValueLabel.setBounds(170,20,150,20);
        //Add
        weatherPanel.add(windSpeedLabel);
        weatherPanel.add(windSpeedNumber);
        weatherPanel.add(windSpeedValueLabel);
        //Set the location
        temperatureLabel.setBounds(40,50,100,20);
        temperatureNumber.setBounds(140,50,20,20);
        temperatureValueLabel.setBounds(170,50,150,20);
        //Add
        weatherPanel.add(temperatureLabel);
        weatherPanel.add(temperatureNumber);
        weatherPanel.add(temperatureValueLabel);
        updateButton.setBounds(100,100,100,30);
        weatherPanel.add(updateButton);
        this.add(weatherPanel);
    }

    /**
     * This method sets the temperature
     * @param temperatureValue is the value of temperature
     */
    public void setTemperatureValue(int temperatureValue){
        temperatureNumber.setText(Integer.toString(temperatureValue));
    }

    /**
     * This method sets the speed of wind
     * @param windSpeedValue is the value of speed
     */
    public void setWindSpeedValue(int windSpeedValue){
        windSpeedNumber.setText(Integer.toString(windSpeedValue));
    }

    /**
     * This method call a method when the button is pressed
     * @param listener is the listener
     */
    public void addListener(ActionListener listener){
        updateButton.addActionListener(listener);
    }

    /**
     * This method displays an error message
     * @param errorMessage is the message
     */
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
