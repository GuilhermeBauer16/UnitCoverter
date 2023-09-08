package br.com.UnitConverter.Functions;

import java.util.Scanner;

public class CreateParameter {
    public String createString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }

    public int createInt(String message) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();
                break;

            } else {

                System.out.println("Please type a number!");
                scanner.next();
            }

        }

        return number;
    }

    public double createDouble(String message) {
        double number = 0.0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {

                number = scanner.nextDouble();
                break;

            } else {

                System.out.println("Please type a number!");
                scanner.next();
            }

        }

        return number;
    }


}
