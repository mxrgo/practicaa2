import java.util.Scanner;
public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static void Menu(){
        int opcion = 0;
        read.nextInt();
        do {
            System.out.println("¡Bienvenidx a la aplicación! Elige que quieres hacer");
            System.out.println("1. Añadir nueva canción");
            System.out.println("2. Añadir nueva canción");
        } while(opcion != 6){
            System.out.println("Saliendo...");
        }
    }
}