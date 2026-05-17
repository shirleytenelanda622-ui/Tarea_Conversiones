package Actividad3;

public class ParteB {
    public static void main(String[] args){
       double valor = 45.89;
       float decimal = (float) valor;
       int entero = (int) decimal;
       short num1 = (short) entero;
       byte num2 = (byte) num1;

        System.out.println("Valor original: " + valor);
        System.out.println("Convertido a float: " + decimal);
        System.out.println("Convertido a int: " + entero);
        System.out.println("Convertido a short: " + num1);
        System.out.println("Convertido a byte: " + num2);
    }
}
