import java.util.Scanner;
public class Main {
    static Scanner read = new Scanner(System.in);
    static String[][] playlist = new String[50][2];
    public static void main(String[] args) {

    }

    public static void Menu(){
        int opcion = 0;
        read.nextInt();
        do {
            System.out.println("¡Bienvenidx a la aplicación! Elige que quieres hacer");
            System.out.println("1. Añadir nueva canción ");
            System.out.println("2. Buscar canción del playlist");
            System.out.println("3. Buscar todas las canciones del artista");
            System.out.println("4. Recomendación de la canción");
            System.out.println("5. Mostrar playlist entero");
            System.out.println("6. Salir");
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while(opcion != 6);
            System.out.println("Saliendo...");
    }
    public static String[][] anadirCancion(String[][] x){

    }
    private static String getString(String message) {
        String value;
        System.out.println(message);
        value = read.next();
        read.nextLine();
        read.close();
        return value;
    }
}