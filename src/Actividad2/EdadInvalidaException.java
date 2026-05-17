package Actividad2;
//Clase tipo excepcion
public class EdadInvalidaException extends Exception{
    private int edadIngresada;

    public EdadInvalidaException(int edadIngresada) {
        System.out.println("Error: la edad ingresada " + edadIngresada + " no es valida");
        this.edadIngresada = edadIngresada;
    }
}
