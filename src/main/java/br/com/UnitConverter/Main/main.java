package br.com.UnitConverter.Main;

import br.com.UnitConverter.Conversor.TemperatureConverter;
import br.com.UnitConverter.Functions.CreateParameter;
import br.com.UnitConverter.Functions.Style;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Style style = new Style();
        CreateParameter createParameter = new CreateParameter();


        while (true) {

            style.createMenuMain(50);
            int option = createParameter.createInt("Option: ");
            switch (option) {

                case 1:

                    MainWeight.main(null);
                    break;

                case 2:

                    MainLength.main(null);
                    break;

                case 3:
                    MainTemperatureConverter.main(null);
                    break;
                case 4:
                    System.out.println("Exit of the system bye. :)");
                    return;
            }


        }


    }
}
