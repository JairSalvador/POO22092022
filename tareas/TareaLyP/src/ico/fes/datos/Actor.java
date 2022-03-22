package ico.fes.datos;

public class Actor {

    private String nombre;
    private String fama;

    public Actor() {
    }

    public Actor(String nombre, String fama) {
        this.nombre = nombre;
        this.fama = fama;
    }

    public String getFama() {
        return fama;
    }

    public void setFama(String fama) {
        this.fama = fama;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", fama=" + fama + '}';
    }

    public void Trabajar() {
        System.out.println(this.nombre + "esta trabajando");
    }
}
