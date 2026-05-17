package Actividad2;

public class PrincipalMain {
    public static void main(String[] args){
        try {
            Estudiante e1 = new Estudiante("Ana", 15, 9.5);
            e1.mostrarDatos();
            Estudiante e2 = new Estudiante("Jose", 16, 8.7);
            e2.mostrarDatos();
            Estudiante e3 = new Estudiante("Luis", -5, 7.0);
            e3.mostrarDatos();
        } catch (EdadInvalidaException e){
            System.out.println("Se produjo un excepcion personalizada");
            System.out.println(e.getMessage());
        }
    }
}
