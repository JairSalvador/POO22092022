package ico.fes.herencia;
//
public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String var1, int var2, String var4){ //Sobre carga (la firma del metodo no debe ser igual a otra
        System.out.println("Cualquier cosa");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    public void dormir() {
        System.out.println(this.nombre + " esta durmiendo...");
    }
}
