package Actividad3;

public class ParteC {
    public static void main(String[] args){
        String num = "2024";
        String decimal = "98.6";
        String booleano = "false";
        int num2 = Integer.parseInt(num);
        double decimal2 = Double.parseDouble(decimal);
        boolean booleano2 = Boolean.parseBoolean(booleano);
        System.out.println("Int: " + num2);
        System.out.println("Double: " + decimal2);
        System.out.println("Boolean: " + booleano2);

        String enteroString = String.valueOf(num2);
        String decimalString = Double.toString(decimal2);
        String booleanString = booleano2 + "";

        System.out.println("----------------------------");
        System.out.println("Entero a String: " + enteroString);
        System.out.println("Decimal a String: " + decimalString);
        System.out.println("Booleano a String: " + booleanString);
    }
}
