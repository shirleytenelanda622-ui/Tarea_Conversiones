package Actividad4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ConversionMonedas conversor = new ConversionMonedas();
        try{
            System.out.print("Moneda origen (USD/EUR): ");
            String origen = sc.nextLine();
            System.out.print("Moneda destino (USD/EUR): ");
            String destino = sc.nextLine();
            System.out.print("Ingrese la cantidad: ");
            String textoCantidad = sc.nextLine();
            double cantidad = Double.parseDouble(textoCantidad);
            double resultado = conversor.convertir(origen, destino, cantidad);
            System.out.println("Resultado: " + String.format("%.2f", resultado));
        } catch (MonedaNoSoportadaException e){
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Debe ingresar una cantidad numerica valida");
        } finally {
            System.out.println("Programa finalizado");
            sc.close();
        }

    }
}
