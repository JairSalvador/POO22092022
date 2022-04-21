package reutilizacioncodigo2209;

import Asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.polimorfismo.Animal;
import ico.fes.polimorfismo.Perro;
import javax.swing.JFrame;

public class ReutilizacionCodigo2209 {

    public static void main(String[] args) {

        String nombre = new String("José José"); //Constructor por defecto
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase()); //para poner en mayusculas

        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
         */
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", (float) 2.6));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio: Establecer un mouse marca Logitech tipo óptico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);

        Computadora compu2 = new Computadora("Apple", "MacBook Pro",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "Optico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));

        System.out.println(compu2);
        compu2.setRaton(new Mouse("apple", "Touch"));

//        compu2.getRaton().setMarca("Apple"); ambas estan bien
//        compu2.getRaton().setTipo("Touch");
        System.out.println(compu2);

        System.out.println("----------------------------------------------------------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);

        Alumno alu2 = new Alumno("123456789", "ICO", "Jóse Perez", 19);
        System.out.println(alu2);

        alu1.setNumeroCuenta("6526526556256");//Otorgar nuevos valores
        alu1.setEdad(19);
        System.out.println(alu1);

        System.out.println("---------Composicion y herencia en la misma clase-------------------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech");
        System.out.println(server);

        System.out.println("---------------Ejemplo polimorfismo-------------");
        Perro dog = new Perro("Bull dog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();

        //((Animal)a).emititSonido();
        //dog.emitirSonido();
        //((Animal) dog).emitirSonido();
        //Animal animal = (Animal)dog;
        //System.out.println(animal.getClass());
    }

}
