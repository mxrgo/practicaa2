import java.util.Scanner;
public class Main {
    static Scanner read = new Scanner(System.in);
    static String[][] playlist = new String[50][2];
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        int opcion = 0;
        do {
            System.out.println("¡Bienvenidx a la aplicación! Elige que quieres hacer");
            System.out.println("1. Añadir nueva canción ");
            System.out.println("2. Buscar canción del playlist");
            System.out.println("3. Buscar todas las canciones del artista");
            System.out.println("4. Recomendación de la canción");
            System.out.println("5. Mostrar playlist entero");
            System.out.println("6. Salir");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    anadirCancion(playlist);
                    break;
                case 2:
                    break;
                case 3:
                    BuscarCancionArtista(playlist);
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
        String artista = getString("Escribe el nombre del artista");
        String cancion = getString("Escribe el nombre de la canción");
        return x;
    }

    public static String[][] buscarCancion(String[][] a){
        String busca = getString("Introduce el nombre de la canción");
        return a;
    }
    private static String getString(String message) {
        String value;
        System.out.println(message);
        value = read.next();
        read.nextLine();
        read.close();
        return value;
    }
    public static String[][] BuscarCancionArtista(String[][] y){
        int respuesta= 0;
        String artistaCancion=getString("De que artista quieres buscar sus canciones?");
        if (artistaCancion.equals("")){
            return y;
        }else{
            System.out.println("No se ha encontrado este artista desea añadir una cancion nueva? pulsa 0 para no y pulsa 1 para si");
            respuesta= read.nextInt();
            if (respuesta == 0){
                Menu();
            } else if (respuesta == 1) {
                anadirCancion(playlist);
            }
        }
        return y;
    }
}