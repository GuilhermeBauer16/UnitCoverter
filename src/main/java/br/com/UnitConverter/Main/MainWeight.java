package br.com.UnitConverter.Main;

import br.com.UnitConverter.Conversor.WeightConverter;
import br.com.UnitConverter.Functions.CreateParameter;
import br.com.UnitConverter.Functions.Style;

import java.text.DecimalFormat;

public class MainWeight {

    public static void main(String[] args) throws InterruptedException {

        double valueToConvert = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        Style style = new Style();
        CreateParameter createParameter = new CreateParameter();
        WeightConverter weight = new WeightConverter();

        while (true) {

            style.createMenuWeight(50);
            int option = createParameter.createInt("Option: ");
            if (option >= 1 && option <= 6) {

                valueToConvert = createParameter.createDouble("Insert the value for convert: ");
            }


            switch (option) {

                case 1:

                    System.out.println(decimalFormat.format(weight.fromPoundsToKilogram(valueToConvert)) + " KG");
                    Thread.sleep(1500);
                    break;

                case 2:

                    System.out.println(decimalFormat.format(weight.fromPoundsToGrams(valueToConvert)) + " G");
                    Thread.sleep(1500);
                    break;

                case 3:

                    System.out.println(decimalFormat.format(weight.fromKilogramToPounds(valueToConvert)) + " LB");
                    Thread.sleep(1500);
                    break;

                case 4:

                    System.out.println(decimalFormat.format(weight.fromKilogramToGrams(valueToConvert)) + " G");
                    Thread.sleep(1500);
                    break;

                case 5:

                    System.out.println(decimalFormat.format(weight.fromGramsToPounds(valueToConvert)) + " LB");
                    Thread.sleep(1500);
                    break;

                case 6:

                    System.out.println(decimalFormat.format(weight.fromGramsToKilograms(valueToConvert)) + " KG");
                    Thread.sleep(1500);
                    break;

                case 7:

                    System.out.println("Return to menu");
                    return;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
