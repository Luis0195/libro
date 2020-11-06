
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int totalPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = totalPaginasLibro;
    }
    
    /**
     * Devuelve el nombre del autor
     */
    public String getAutor() {
        return autor;
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
     * Devuelve los detalles del libro
     */
    public String getDetallesLibro() {
        return "Título: " + titulo +", Autor: " + autor +", Páginas: " + numeroPaginas;
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
        System.out.println("Título: " + titulo +", Autor: " + autor +", Páginas: " + numeroPaginas);
    }
}
