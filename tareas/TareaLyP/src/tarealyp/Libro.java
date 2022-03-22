package tarealyp;

import ico.fes.datos.Autor;
import ico.fes.datos.Editorial;

public class Libro {

    private String genero;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
        autor = new Autor();
        editorial = new Editorial();

    }

    public Libro(String genero, Autor autor, Editorial editorial) {
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro (" + "genero= " + genero + ", " + autor + ". " + editorial + ")";
    }
}
