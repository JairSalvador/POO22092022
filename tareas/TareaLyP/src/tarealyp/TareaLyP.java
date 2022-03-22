package tarealyp;

import ico.fes.datos.Actor;
import ico.fes.datos.Autor;
import ico.fes.datos.Director;
import ico.fes.datos.Editorial;
import ico.fes.datos.Productora;


public class TareaLyP {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Terror", new Autor("Guillermo", 35), new Editorial("Porrua", 12315165));
        System.out.println(libro1);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        Pelicula peli1 = new Pelicula("Documental falso", new Director("Tarantino", 58), new Productora("A Band Apart", 15), new Actor("Brad Pitt", "Muy famoso"));
        System.out.println(peli1);

    }

}
