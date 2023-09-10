package br.com.UnitConverter.Main;

import br.com.UnitConverter.Conversor.TemperatureConverter;
import br.com.UnitConverter.Functions.CreateParameter;
import br.com.UnitConverter.Functions.Style;

import java.text.DecimalFormat;

public class MainTemperatureConverter {

    public static void main(String[] args) throws InterruptedException {
        double valueToConvert = 0.0;

        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        Style style = new Style();
        CreateParameter createParameter = new CreateParameter();
        TemperatureConverter temperatureConverter = new TemperatureConverter();


//        System.out.println(title("Temperature converter ", number));
//        System.out.println("[1]From celsius to fahrenheit ");
//        System.out.println("[2]From celsius to kelvin ");
//        System.out.println("[3]From fahrenheit to celsius");
//        System.out.println("[4]From fahrenheit to kelvin ");
//        System.out.println("[5]From kelvin to celsius ");
//        System.out.println("[6]From kelvin to fahrenheit ");
//        System.out.println("[7]Exit ");
//        System.out.println(line(number));

        while (true) {

            style.createMenuTemperatureConverter(50);
            int option = createParameter.createInt("Option: ");
            if (option >= 1 && option <= 6) {

                valueToConvert = createParameter.createDouble("Insert the value for convert: ");
            }

            switch (option) {
                case 1:

                    System.out.println(decimalFormat.format(temperatureConverter.fromCelsiusToFahrenheit(valueToConvert)) + " F");
                    Thread.sleep(1500);
                    break;

                case 2:

                    System.out.println(decimalFormat.format(temperatureConverter.fromCelsiusToKelvin(valueToConvert)) + " K");
                    Thread.sleep(1500);
                    break;

                case 3:

                    System.out.println(decimalFormat.format(temperatureConverter.fromFahrenheitToCelsius(valueToConvert)) + " C°");
                    Thread.sleep(1500);
                    break;

                case 4:

                    System.out.println(decimalFormat.format(temperatureConverter.fromFahrenheitToKelvin(valueToConvert)) + " K");
                    Thread.sleep(1500);
                    break;

                case 5:

                    System.out.println(decimalFormat.format(temperatureConverter.fromKelvinToCelsius(valueToConvert)) + " C°");
                    Thread.sleep(1500);
                    break;
                case 6:
                    System.out.println(decimalFormat.format(temperatureConverter.fromKelvinToFahrenheit(valueToConvert)) + " F");
                    Thread.sleep(1500);
                    break;
                case 7:
                    System.out.println("Return to menu");
                    return;

                default:
                    System.out.println("Invalid option ");
                    break;
            }

        }
    }
}
