package br.com.UnitConverter.Main;

import br.com.UnitConverter.Conversor.LengthConverter;
import br.com.UnitConverter.Functions.CreateParameter;
import br.com.UnitConverter.Functions.Style;

public class MainLength {
//    System.out.println(title("Length converter ", number));
//        System.out.println("[1]From kilometer to meter ");
//        System.out.println("[2]From kilometer to centimeter ");
//        System.out.println("[3]From meter to kilometer");
//        System.out.println("[4]From meter to centimeter ");
//        System.out.println("[5]From centimeter to kilometer ");
//        System.out.println("[6]From centimeter to meter ");
//        System.out.println("[7]Exit ");
    public static void main(String[] args) {

        Style style = new Style();
        CreateParameter createParameter = new CreateParameter();
        LengthConverter lengthConverter = new LengthConverter();

        style.createMenuLength(50);
        int option = createParameter.createInt("option: ");
        double valueToConvert = createParameter.createDouble("Value to convert: ");
        switch (option){

            case 1:
                System.out.println(lengthConverter.fromKilometerToMeter(valueToConvert));
                break;

            case 2:
                System.out.println(lengthConverter.fromKilometerToCentimeter(valueToConvert));
                break;

            case 3:
                System.out.println(lengthConverter.fromMeterToKilometer(valueToConvert));
                break;

            case 4:
                System.out.println(lengthConverter.fromMeterToCentimeter(valueToConvert));
                break;

            case 5:
                System.out.println(lengthConverter.fromCentimeterToKilometer(valueToConvert));
                break;

            case 6:
                System.out.println(lengthConverter.fromCentimeterToMeter(valueToConvert));
                break;

            case 7:
                System.out.println("Return to menu");
                break;

            default:
                System.out.println("Invalid option");

        }
    }
}
