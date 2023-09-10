package br.com.UnitConverter.Conversor;

public class Weight {

    // Pounds
    public double fromPoundsToKilogram(double pounds){
        return pounds / 2.20462 ;
    }

    public double fromPoundsToGrams(double pounds){
        return pounds * 453.6 ;
    }

    // kilogram

    public double fromKilogramToPounds(double kilogram){
        return kilogram * 2.20462 ;
    }
    public double fromKilogramToGrams(double kilogram){
        return kilogram * 1000 ;
    }

    // grams

    public double fromGramsToPounds(double grams){
        return grams / 453.6 ;
    }

    public double fromGramsToKilograms(double grams){
        return grams / 1000 ;
    }










}
