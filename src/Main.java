// Importa la clase Scanner, que sirve para leer datos del teclado
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crea el objeto Scanner conectado a la entrada estándar (el teclado).
        Scanner scanner = new Scanner(System.in);

        // Imprime la pregunta en pantalla.
        System.out.println("¿Cómo te llamas?");

        // Lee lo que el usuario escribió y lo guarda en la variable nombre.
        String nombre = scanner.nextLine();

        // Une "Hola " con el valor de nombre usando +
        System.out.println("Hola " + nombre);

        //Cierra el scanner para liberar recurso
        scanner.close();
    }
}

