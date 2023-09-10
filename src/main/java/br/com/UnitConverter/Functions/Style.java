package br.com.UnitConverter.Functions;

public class Style {

    public void createMenuMain(int number) {

        System.out.println(title("Unit converter ", number));
        System.out.println("[1]Weight ");
        System.out.println("[2]Length ");
        System.out.println("[3]Temperature ");
        System.out.println("[4]Exit ");
        System.out.println(line(number));

    }

    public void createMenuLength(int number) {

        System.out.println(title("Length converter ", number));
        System.out.println("[1]From kilometer to meter ");
        System.out.println("[2]From kilometer to centimeter ");
        System.out.println("[3]From meter to kilometer");
        System.out.println("[4]From meter to centimeter ");
        System.out.println("[5]From centimeter to kilometer ");
        System.out.println("[6]From centimeter to meter ");
        System.out.println("[7]Exit ");
        System.out.println(line(number));

    }

    public void createMenuWeight(int number){
        System.out.println(title("Weight converter ", number));
        System.out.println("[1]From pounds to kilogram ");
        System.out.println("[2]From pounds to grams ");
        System.out.println("[3]From kilogram to pounds");
        System.out.println("[4]From kilogram to grams ");
        System.out.println("[5]From grams to pounds ");
        System.out.println("[6]From grams to kilograms ");
        System.out.println("[7]Exit ");
        System.out.println(line(number));

    }

    public void createMenuTemperatureConverter(int number){
        System.out.println(title("Temperature converter ", number));
        System.out.println("[1]From celsius to fahrenheit ");
        System.out.println("[2]From celsius to kelvin ");
        System.out.println("[3]From fahrenheit to celsius");
        System.out.println("[4]From fahrenheit to kelvin ");
        System.out.println("[5]From kelvin to celsius ");
        System.out.println("[6]From kelvin to fahrenheit ");
        System.out.println("[7]Exit ");
        System.out.println(line(number));

    }

    public String title(String message, int number) {
        String line = "==".repeat(number);
        return line + "\n" + message + "\n" + line;
    }

    public String line(int number) {
        return "==".repeat(number);
    }
}

