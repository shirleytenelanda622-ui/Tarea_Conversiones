package Actividad1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class ExcepcionBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero entero: ");
            String num = sc.nextLine();
            int numero = Integer.parseInt(num);
            int total = 100 / numero;
            System.out.println("Resultado: " + total);
        } catch (ArithmeticException e){ //ArithmeticException detecta errores matematicas y muestra mensajes
            System.out.println("Error: No se puede dividir por cero");
        } catch (NumberFormatException e){ //NumberFormatException verifica que se ingresen solo numeros
            System.out.println("Error: No puede ser un texto");
        } finally {
            System.out.println("Programa finalizado correctamente");
            sc.close();
        }

    }
}