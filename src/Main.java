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
            System.out.println("4. Recomendación de la canción");
            System.out.println("5. Mostrar playlist entero");
            System.out.println("6. Salir");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    anadirCancion(playlistp);
                    Menu();

                    break;
                case 2:
                    buscarCancion(playlist, getString(""));
                    break;
                case 3:
                    BuscarCancionArtista(playlist);
                    break;
                case 4:
                    Recomendacion(playlist);
                    break;
                case 5:
                    mostrarArrayList(playlistp);
                    break;
                case 6:
                    break;
                    // el defaul hace que si pones una opcion no valida te dice que no existe y te vuelve a mostrar el menu
                default:
                    System.out.println("Opción no valida");
            }
            // para que si el usuario elige salir salga de la app
        } while(opcion != 6);
            System.out.println("Saliendo...");
    }

    // canciones por defecto para tener contenido recomendado en la playlist
    public static String [][] CancionesPorDefecto(String[][] j){

        return j;
    }

    public static ArrayList<String> playlistCanciones(ArrayList <String> songs){

        playlistp.add(0, "BTS");
        playlistp.add(1, "Euphoria");
        playlistp.add(0, "Stray Kids");
        playlistp.add(1, "Case 143");
        playlistp.add(0, "ITZY");
        playlistp.add(1, "Wannabe");
        playlistp.add(0, "Twice");
        playlistp.add(1, "ICON");

        return songs;
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
    public static ArrayList<String[]> anadirCancion(ArrayList<String[]> addSong) {
        String artista = getString("Introduce el nombre del artista");
        String cancion = getString("Introduce el nombre de la cancion, si requiere espacios coloque _ en vez de espacios");
        addSong.add(new String[]{artista, cancion});
        return addSong;
    }


    // metodo para la utilidad de la opcion 2
    public static void buscarCancion(){

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
    public static String[][] Recomendacion(String[][] r){
        System.out.println("Estas son las canciones que te recomendamos...");
        for (int i = 0; i < playlist.length; i++) {
            for (int j = 0; j < playlist.length; j++) {
                System.out.println(""+playlist[i][j]);
            }
        }
        return r;
    }

    // metodo para la utilidad de la opcion 5
    public static void mostrarArrayList(ArrayList<String[]> lista) {
        System.out.println("Contenido de la playlist:");
        for (String[] elemento : lista) {
            System.out.println(Arrays.toString(elemento));
        }
    }

}