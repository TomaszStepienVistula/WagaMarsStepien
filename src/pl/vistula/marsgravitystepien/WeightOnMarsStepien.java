package pl.vistula.marsgravitystepien;

public class WeightOnMarsStepien {

    public static void main(String[] args) {

        float WeightEarthStepien = 72.4F;
        float WeightMarsStepienFloat = 0;
        float GravityMarsStepien = 0.38F;
        double WeightMarsStepienDouble = 0;
        int WeightMarsStepienInt = 0;
        char WeightMarsStepienChar;

        WeightMarsStepienFloat = WeightEarthStepien * GravityMarsStepien;

        System.out.println("Waga na ziemi:" + WeightEarthStepien + "kg");
        System.out.println("Waga na Marsie: " + WeightMarsStepienFloat + "kg");

        WeightMarsStepienDouble = WeightEarthStepien * GravityMarsStepien;

        System.out.println("Waga na Marsie w formacie double: " + String.format("%.4f", WeightMarsStepienDouble) + "kg") ;

        WeightMarsStepienInt = (int)WeightMarsStepienDouble;

        System.out.println("Waga na Marsie po rzutowaniu double na int: " + (int)WeightMarsStepienDouble + "kg");
        System.out.println("Waga na Marsie po rzutowaniu int na char: " + (char)WeightMarsStepienInt + "kg");





    }





}
