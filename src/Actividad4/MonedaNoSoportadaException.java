package Actividad4;
//Excepcion personalizada, con el extends Exception es para indicar que la clase es una excepcion
public class MonedaNoSoportadaException extends Exception{
    public MonedaNoSoportadaException(String mensaje){
        super(mensaje);
    }
}
