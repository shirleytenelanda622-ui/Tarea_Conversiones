package Actividad3;

public class ParteD {
    public static void main(String[] args){
        Perro miPerro = new Perro();
        Animal animal = miPerro;
        System.out.println("Upcasting realizado correctamente");
        //instanceof sirve para verificar que el objeto pertenece a la clase antes de hacer un casting
        if(animal instanceof Perro){
            Perro perroConvertido = (Perro) animal;
            System.out.println("Dowcasting realizado correctamente");
            perroConvertido.ladrar();
        } else {
            System.out.println("El objeto no es un Perro");
        }
    }
}
