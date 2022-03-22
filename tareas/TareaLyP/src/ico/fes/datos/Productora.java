package ico.fes.datos;

public class Productora {

    private String nombreP;
    private int tiempo;

    public Productora() {
    }

    public Productora(String nombreP, int tiempo) {
        this.nombreP = nombreP;
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombreP + ", tiempo=" + tiempo + '}';
    }

    public void Cerrar() {
        System.out.println(this.nombreP + "esta cerrada");
    }

}
