package ico.fes.datos;

public class Director {

    private String nombre;
    private int edad;

    public Director() {
    }

    public Director(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
        return "Director{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    public void Filmar() {
        System.out.println(this.nombre + " esta filmando");
    }
}
