package br.com.UnitConverter.Main;

import br.com.UnitConverter.Conversor.TemperatureConverter;
import br.com.UnitConverter.Functions.CreateParameter;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CreateParameter createParameter = new CreateParameter();
        TemperatureConverter temperatureConverter = new TemperatureConverter();

//        temperatureConverter.fromCelsiusToFahrenheit();
//        temperatureConverter.fromFahrenheitToCelsius();

        temperatureConverter.toConvert((value * 1.8) + 32 ,"the value in fahrenheit: ");
    }
}
