package br.com.UnitConverter.Conversor;

public class LengthConverter {


    //Kilometer

    public double fromKilometerToMeter(double kilometer) {
        return kilometer * 1000;
    }
    public double fromKilometerToCentimeter(double kilometer) {
        return kilometer * 100000;
    }

    //Meter

    public double fromMeterToKilometer(double meters) {
        return meters / 1000;
    }
    public double fromMeterToCentimeter(double meters) {
        return meters * 100;
    }

    // Centimeter

    public double fromCentimeterToKilometer(double centimeters) {
        return centimeters / 100000;
    }
    public double fromCentimeterToMeter(double centimeters) {
        return centimeters / 100;
    }



}
