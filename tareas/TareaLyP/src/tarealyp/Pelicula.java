package tarealyp;

import ico.fes.datos.Actor;
import ico.fes.datos.Director;
import ico.fes.datos.Productora;

public class Pelicula {

    private String genero;
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
        director = new Director();
        productora = new Productora();
        actor = new Actor();

    }

    public Pelicula(String genero, Director director, Productora productora, Actor actor) {
        this.genero = genero;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula (" + "genero= " + genero + ", " + director + ". " + productora + ", " + actor + ")";
    }
}
