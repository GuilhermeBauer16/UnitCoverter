package br.com.UnitConverter.Conversor;

import br.com.UnitConverter.Functions.CreateParameter;

public class TemperatureConverter {

    private CreateParameter createParameter = new CreateParameter();


    public void fromCelsiusToFahrenheit() {

        double celsius = createParameter.createDouble("Type the value in celsius(C°) to convert for Fahrenheit(F): ");
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("the value in fahrenheit: " + fahrenheit + " C°");


    }

    public void fromFahrenheitToCelsius() {

        double fahrenheit = createParameter.createDouble("Type the value in Fahrenheit(F) to convert for celsius(C°): ");
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("the value in celsius: " + celsius + " F");

    }

    public void fromCelsiusToKelvin() {
        double celsius = createParameter.createDouble("Type the value in celsius(C°) to convert for Kelvin(K) : ");
        double kelvin = celsius + 273.15;
        System.out.println("the value in Kelvin: " + kelvin + " F");
    }

    public void fromKelvinToCelsius() {
        double kelvin = createParameter.createDouble("Type the value in Kelvin(K) to convert for celsius(C°) : ");
        double celsius = kelvin - 273.15;
        System.out.println("the value in Kelvin: " + celsius + " F");
    }

}