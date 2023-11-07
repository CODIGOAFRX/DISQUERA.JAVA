package disquera;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, artista, Genero, localizacion;
        double PrecioEntradas, Recaudacion, Regalias;
        int VisitasYT, aforo, VisitasStreaming;
        Musica musica2 = new Musica();
        Videoclips videoclips2 = new Videoclips();
        Shows shows2 = new Shows();

        Musica musica1 = new Musica("Instante", 0.80, 500000, "Afro Px",
                "Electronica"); // Creamos un objeto de tipo Musica
        Shows show1 = new Shows("Inferno", 300000, 10000, "Afro Px", 30); // Creamos un objeto de tipo Shows

        Videoclips videoclips1 = new Videoclips("Instante", 0.60, 1000000, "Afro Px",
                "Electronica"); // Creamos un objeto de tipo Videoclips

        System.out.println(musica1);
        System.out.println(videoclips1);
        System.out.println(show1);

        // AQUI SE CREA EL OBJETO CREANDO EL CONSTRUCTOR POR DEFECTO DEFINIENDO EL
        // OBJETO PREVIAMENTE ARRIBA, MIRAR POR EJEMPLO EL DE Musica musica2 = new

        // Musica();

        System.out.println("introduce el nombre de la cancion ");
        nombre = entrada.nextLine();
        musica2.setNombre(nombre);

        System.out.println("introduce el artista de la cancion ");
        artista = entrada.nextLine();
        musica2.setArtista(artista);

        System.out.println("Introduce el género de la canción: ");
        Genero = entrada.nextLine();
        musica2.setGenero(Genero);

        System.out.println("Introduce el valor de las regalías: ");
        Regalias = entrada.nextDouble();
        entrada.nextLine(); // Consumir la nueva línea restante
        musica2.setRegalias(Regalias);

        System.out.println("Introduce el número de visitas en streaming: ");
        VisitasStreaming = entrada.nextInt();
        entrada.nextLine(); // Consumir la nueva línea restante
        musica2.setVisitasStreaming(VisitasStreaming);

        System.out.println(musica2);

        // Videoclips();

        System.out.println("Introduce el nombre del videoclip: ");
        nombre = entrada.nextLine();
        videoclips2.setNombre(nombre);

        System.out.println("Introduce el artista del videoclip: ");
        artista = entrada.nextLine();
        videoclips2.setArtista(artista);

        System.out.println("Introduce el género del videoclip: ");
        Genero = entrada.nextLine();
        videoclips2.setGenero(Genero);

        System.out.println("Introduce el valor de las regalías: ");
        Regalias = entrada.nextDouble();
        entrada.nextLine(); // Consumir la nueva línea restante
        videoclips2.setRegalias(Regalias);

        System.out.println("Introduce el número de visitas en YT: ");
        VisitasYT = entrada.nextInt();
        entrada.nextLine(); // Consumir la nueva línea restante
        videoclips2.setVisitasYT(VisitasYT);

        System.out.println(videoclips2);

        // Shows();

        System.out.println("Introduce la localizacion del show: ");
        localizacion = entrada.nextLine();
        shows2.setLocalizacion(localizacion);

        System.out.println("Introduce el artista del show: ");
        artista = entrada.nextLine();
        shows2.setArtista(artista);

        System.out.println("Introduce el aforo del show: ");
        aforo = entrada.nextInt();
        entrada.nextLine(); // Consumir la nueva línea restante
        shows2.setAforo(aforo);

        System.out.println("Introduce el precio de las entradas: ");
        PrecioEntradas = entrada.nextDouble();
        entrada.nextLine(); // Consumir la nueva línea restante
        shows2.setPrecioEntradas(PrecioEntradas);

        System.out.println("Introduce la recaudación: ");
        Recaudacion = entrada.nextDouble();
        entrada.nextLine(); // Consumir la nueva línea restante
        shows2.setRecaudacion(Recaudacion);

        System.out.println(shows2);

        // llamamos a las funciones personalizadas:

        // musica funcion
        musica2.Genera();
        musica2.Ingreso();
        // videoclips funcion
        videoclips2.GeneraYT();
        videoclips2.IngresosYT();
        // show funcion
        shows2.DineroGanado();
        shows2.DineroTaqilla();

    }// OTRO MAIN

}// class main
