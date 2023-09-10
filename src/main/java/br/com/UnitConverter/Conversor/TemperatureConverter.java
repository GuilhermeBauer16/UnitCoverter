package br.com.UnitConverter.Conversor;

import br.com.UnitConverter.Functions.CreateParameter;

public class TemperatureConverter {

    private CreateParameter createParameter = new CreateParameter();

    // celsius
    public double fromCelsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public double fromCelsiusToKelvin(double celsius) {

        return celsius + 273.15;

    }

    // fahrenheit
    public double fromFahrenheitToCelsius(double fahrenheit) {

        return (fahrenheit - 32) / 1.8;

    }

    public  double fromFahrenheitToKelvin(double fahrenheit){

        return ((fahrenheit - 32 ) * 5/9) + 273.15;
    }

    // kelvin
    public double fromKelvinToCelsius(double kelvin) {

        return kelvin - 273.15;

    }

    public double fromKelvinToFahrenheit(double kelvin){
        return (kelvin - 273.15) * 1.8 + 32 ;
    }

}