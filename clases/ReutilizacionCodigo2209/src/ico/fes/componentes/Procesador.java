/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author calav
 */
public class Procesador {

    private String marca;
    private float frecuenciaEnGhz;

    public Procesador() {
    }

    public Procesador(String marca, float fecuanciaEnGhz) {
        this.marca = marca;
        this.frecuenciaEnGhz = fecuanciaEnGhz;
    }

    public float getFecuanciaEnGhz() {
        return frecuenciaEnGhz;
    }

    public void setFecuanciaEnGhz(float fecuanciaEnGhz) {
        this.frecuenciaEnGhz = fecuanciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuenciaEnGhz=" + frecuenciaEnGhz + '}';
    }

}
