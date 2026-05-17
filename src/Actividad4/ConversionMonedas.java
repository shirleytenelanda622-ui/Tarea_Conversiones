package Actividad4;

public class ConversionMonedas {
    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) throws MonedaNoSoportadaException{
        if((!monedaOrigen.equals("USD") && !monedaOrigen.equals("EUR")) || (!monedaDestino.equals("USD") && !monedaDestino.equals("EUR"))){
            //throw lanzar una excepcion para indicar el problema
            throw new MonedaNoSoportadaException("Moneda no soportada");
        }
        if(monedaOrigen.equals("EUR") && monedaDestino.equals("USD")){
            return cantidad * 1.09;
        }
        if(monedaOrigen.equals("USD") && monedaDestino.equals("EUR")){
            return cantidad * 0.92;
        }
        return cantidad;
    }
}
