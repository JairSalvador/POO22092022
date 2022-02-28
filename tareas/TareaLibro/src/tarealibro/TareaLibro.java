package tarealibro;

public class TareaLibro {

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setColor("Morado");
        System.out.println("El color del libro es: " + libro.getColor());

        libro.setTema("Misterios");
        System.out.println("Tema: " + libro.getTema());

        libro.setTitulo("El jinete sin cabeza");
        System.out.println("Titulo: " + libro.getTitulo());

        libro.setGenero("Terror");
        System.out.println("Genero: " + libro.getGenero());

        libro.setTamano(20);
        System.out.println("Tamaño: " + libro.getTamano() + " cm");

        libro.setPrecio(300);
        System.out.println("Precio: $" + libro.getPrecio());
    }

}
