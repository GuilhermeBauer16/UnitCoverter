package br.com.UnitConverter.Main;

import br.com.UnitConverter.Conversor.LengthConverter;
import br.com.UnitConverter.Functions.CreateParameter;
import br.com.UnitConverter.Functions.Style;

import java.text.DecimalFormat;

public class MainLength {

    public static void main(String[] args) throws InterruptedException {

        double valueToConvert = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        Style style = new Style();
        CreateParameter createParameter = new CreateParameter();
        LengthConverter lengthConverter = new LengthConverter();

        while (true){

        style.createMenuLength(50);
        int option = createParameter.createInt("option: ");
            if (option >= 1 && option <= 6) {

                valueToConvert = createParameter.createDouble("Insert the value for convert: ");
            }

        switch (option){

            case 1:
                System.out.println(decimalFormat.format(lengthConverter.fromKilometerToMeter(valueToConvert))  +" M");
                Thread.sleep(1500);
                break;

            case 2:
                System.out.println(decimalFormat.format(lengthConverter.fromKilometerToCentimeter(valueToConvert )) +" CM");
                Thread.sleep(1500);
                break;

            case 3:
                System.out.println(decimalFormat.format(lengthConverter.fromMeterToKilometer(valueToConvert)) + " KM");
                Thread.sleep(1500);
                break;

            case 4:
                System.out.println(decimalFormat.format(lengthConverter.fromMeterToCentimeter(valueToConvert))+" CM");
                Thread.sleep(1500);
                break;

            case 5:
                System.out.println(decimalFormat.format(lengthConverter.fromCentimeterToKilometer(valueToConvert))+ " KM");
                Thread.sleep(1500);
                break;

            case 6:
                System.out.println(decimalFormat.format(lengthConverter.fromCentimeterToMeter(valueToConvert))+" M");
                Thread.sleep(1500);
                break;

            case 7:
                System.out.println("Return to menu");
                return;

            default:
                System.out.println("Invalid option");

        }
    }
}}
