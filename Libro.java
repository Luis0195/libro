
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int numeroVecesPrestado;
    private boolean esLibroDeTexto;
    private String esDeTextoCastellano;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int totalPaginasLibro, boolean esDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = totalPaginasLibro;
        numeroReferencia = "";
        numeroVecesPrestado = 0;
        esLibroDeTexto = esDeTexto;
        if (esLibroDeTexto == true) {
            esDeTextoCastellano = "Si";
        }
        else {
            esDeTextoCastellano = "No";
        }
    }
    
    /**
     * Establecer num referencia
     */
    public void setNumReferencia(String nuevoNumReferencia) {
        if (nuevoNumReferencia.length() <= 2) {
            System.out.println("El numero de referencia es muy corte, debe de tener al menos 3 caracteres");
            numeroReferencia = "";
        }
        else {
            numeroReferencia = nuevoNumReferencia;
        }
    }
    
    /**
     * Devuelve el nombre del autor
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Es libro de texto?
     */
    public String gettipoLibro() {
        return esDeTextoCastellano + " es un libro de texto.";
    }
    /**
     * Devuelve el título del libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Devuelve el numero de paginas que tiene el libro
     */
    public int getPaginas() {
        return numeroPaginas;
        
    }
    
    /**
     * Devuelve num referencia
     */
    public String getNumReferencia() {
        return numeroReferencia;
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetallesLibro() {
        String detalles;
        if (numeroReferencia == "") {
            detalles = "Título: " + titulo +", Autor: " + autor +", Páginas: " + numeroPaginas + ", Num Referencia: ZZZ Veces prestado, " + numeroVecesPrestado + ", Es un libro de texto?: " + esDeTextoCastellano;
        }
        else {
            detalles = "Título: " + titulo +", Autor: " + autor +", Páginas: " + numeroPaginas + ", Num Referencia: " + numeroReferencia + ", Veces prestado, " + numeroVecesPrestado + ", Es un libro de texto?: " + esDeTextoCastellano;
        }
        return detalles;
    }
    
    /**
     * Imprimir autor
     */
    public void imprimirAutor() {
        System.out.println("El autor es " + autor);
    }
    
    /**
     * Imprimir titulo
     */
    public void imprimirTitulo() {
        System.out.println("El titulo del libro es " + titulo);
    }
    
    /**
     * imprimir detalles 
     */
    public void imprimirDetalles() {
        if (numeroReferencia == "") {
           System.out.println("Título: " + titulo +", Autor: " + autor +", Páginas: " + numeroPaginas + ", Num Referencia: ZZZ, Veces prestado, " + numeroVecesPrestado + ", Es un libro de texto?: " + esDeTextoCastellano);
        }
        else {
           System.out.println("Título: " + titulo +", Autor: " + autor +", Páginas: " + numeroPaginas + ", Num Referencia: " + numeroReferencia + "Veces prestado, " + numeroVecesPrestado + ", Es un libro de texto?: " + esDeTextoCastellano);
        }
    }
    
    /**
     * Prestar libro
     */
    public void vecesPrestado () {
        numeroVecesPrestado += 1;
    }
}
