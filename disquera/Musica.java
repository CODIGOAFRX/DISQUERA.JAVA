package disquera;

public class Musica {
    // colocamos los atributos necesarios. Todos los atributos serán privados

    private String nombre, artista, Genero;
    private int VisitasStreaming;
    private double Regalias;

    // metodos personalizadoss

    static double GananciaPorStream = 0.005;
    double GanaciaDelArtista;
    double GananciaPorStreaming;

    // definimos contructores por defecto

    public Musica() {
        // vamos a proceder a inicializar los valores por defecto. los string se ponene
        // con comillas vacias y los numero inicializados a 0
        nombre = "";
        artista = "";
        Genero = ""; // constructor por defect0o

        Regalias = 0;
        VisitasStreaming = 0;
        // si es booleano se pone true

    }// cierre public musica

    public Musica(String nombre, double Regalias, int VisitasStreaming, String artista, String Genero) { // se pone cada
                                                                                                         // parametro
                                                                                                         // dentro de
                                                                                                         // los
                                                                                                         // parentesis
                                                                                                         // de la clase.

        // usamos los punteros "this" para indicar el atributo de mi clase
        this.nombre = nombre;
        this.Regalias = Regalias;
        this.VisitasStreaming = VisitasStreaming;
        this.artista = artista;
        this.Genero = Genero;

    }

    // creamos los getters para poder imprimir y llamar a nuestro metodo privado.

    public String getNombre() {
        return nombre;
    }

    public double getRegalias() {
        return Regalias;
    }

    public int getVisitasStreaming() {
        return VisitasStreaming;
    }

    public String getGenero() {
        return Genero;
    }

    public String getArtista() {
        return artista;
    }

    // setter es lo mismo que con el getter pero sirve para asignarle un valor a un
    // metodo privado.

    public void setVisitasStreaming(int VisitasStreaming) {
        this.VisitasStreaming = VisitasStreaming;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setRegalias(double Regalias) {
        this.Regalias = Regalias;
    }

    // metodos personalizados aquí se llaman:

    public void Genera() {
        double GananciaPorStreaming = VisitasStreaming * GananciaPorStream;
        System.out.println("El artista ha generado: " + GananciaPorStreaming + " euros ");

    }

    public void Ingreso() {
        double Dinero = GananciaPorStream * Regalias * VisitasStreaming;
        System.out.println("El artista ha tenido unos ingresos netos de " + Dinero + " euros");
    }

    @Override

    // sirve para resumir e imprimir todos los metodos de una sola vez

    public String toString() {
        String mensaje = "Regalias: " + Regalias + "euros" + "\n"
                + "genero: " + Genero + "\n"
                + "nombre: " + nombre + "\n"
                + "artista: " + artista + "\n"
                + "VisitasStreaming: " + VisitasStreaming + "\n";
        return mensaje;
    }

}// cierre main