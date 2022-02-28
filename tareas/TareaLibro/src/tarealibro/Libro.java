
package tarealibro;

public class Libro {


    private String color;
    private String tema;
    private String titulo;
    private String genero;
    private int tamano;
    private int precio;

    public Libro() {
    }

    public Libro(String color, String tema, String titulo, String genero, int tamano, int precio) {
        this.color = color;
        this.tema = tema;
        this.titulo = titulo;
        this.genero = genero;
        this.tamano = tamano;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }


}
    

