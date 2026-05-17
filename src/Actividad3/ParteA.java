package Actividad3;

import org.w3c.dom.ls.LSOutput;

public class ParteA {
    public static void main(String[] args){
        byte valorByte = 15;
        short valorShort = valorByte;
        int valorInt = valorShort;
        long valorLong = valorInt;
        float valorFloat = valorLong;
        double valorDouble = valorFloat;
        System.out.println("Byte: " + valorByte);
        System.out.println("Short: " + valorShort);
        System.out.println("Int: " + valorInt);
        System.out.println("Long: " + valorLong);
        System.out.println("Float: " + valorFloat);
        System.out.println("Double: " + valorDouble);
    }
}
