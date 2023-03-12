import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static Scanner read = new Scanner(System.in);
    static ArrayList<String[]> playlistp = new ArrayList<String[]>();
    static String[][] playlist = new String[50][50];

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
            System.out.println("4. Mostrar playlist entero");
            System.out.println("5. Salir");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    anadirCancion(playlistp);
                    Menu();

                    break;
                case 2:
                    buscarCancion(playlistp);
                    break;
                case 3:
                    BuscarCancionArtista(playlist);
                    break;
                case 4:
                    mostrarArrayList(playlistp);
                    break;
                case 5:
                    break;
                    // el defaul hace que si pones una opcion no valida te dice que no existe y te vuelve a mostrar el menu
                default:
                    System.out.println("Opción no valida");
            }
            // para que si el usuario elige salir salga de la app
        } while(opcion != 5);
            System.out.println("Saliendo...");
    }


    // para poder guardar las respuestas automaticamente en la array
    private static String getString(String message) {
        String value;
        System.out.println(message);
        value = read.next();
        read.nextLine();
        return value;
    }

    // metodo para la utilidad de la opcion 1
    public static void anadirCancion(ArrayList<String[]> playlistp) {
        String artista = getString("Introduce el nombre del artista(usa _ en lugar de los espacios)");
        String cancion = getString("Introduce el nombre de la canción(usa _ en lugar de los espacios)");
        playlistp.add(new String[]{artista, cancion});
        System.out.println("Canción añadida con éxito");
    }



    // metodo para la utilidad de la opcion 2
    public static void buscarCancion(ArrayList<String[]> playlistp){
        String busca = getString("Introduce el nombre de la canción");
        boolean found = false;
        for (String[] row : playlistp) {
            if (row[1].equals(busca)) {
                System.out.println("Se ha encontrado la canción:");
                System.out.println(Arrays.toString(row));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se ha encontrado la canción");
        }
    }


    // metodo para la utilidad de la opcion 3
    public static String[][] BuscarCancionArtista(String[][] y){
        int respuesta= 0;
        String artistaCancion=getString("De que artista quieres buscar sus canciones?");
        if (artistaCancion.equals("")){
            return BuscarCancionArtista(playlist);
        }else{
            System.out.println("No se ha encontrado este artista desea añadir una cancion nueva? pulsa 0 para no y pulsa 1 para si");
            respuesta= read.nextInt();
            if (respuesta == 0){
                Menu();
            } else if (respuesta == 1) {
                anadirCancion(playlistp);
            }
        }
        return y;
    }


    // metodo para la utilidad de la opcion 4
    public static void mostrarArrayList(ArrayList<String[]> lista) {
        System.out.println("Contenido de la playlist:");
        for (String[] elemento : lista) {
            System.out.println(Arrays.toString(elemento));
        }
    }

}