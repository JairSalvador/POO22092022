
package ico.fes.datos;


public class Editorial {

    private String nombreEditorial;
    private int telefono;

    public Editorial() {
    }

    public Editorial(String nombreEditorial, int telefono) {
        this.nombreEditorial = nombreEditorial;
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombreEditorial + ", telefono=" + telefono + '}';
    }

    public void Cerrar() {
        System.out.println(this.nombreEditorial + "esta cerrada");
    }
}
