/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplorepaso;

import java.awt.Color;

/**
 *
 * @author calav
 */
public class Cubrebocas {

    private Color color;
    private String material;
    private String modelo;

    public Cubrebocas() {
    }

    public Cubrebocas(Color color, String material, String modelo) {
        this.color = color;
        this.material = material;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cubrebocas (" + "color= " + color + ", material= " + material + ", modelo= " + modelo + ")";

    }

    public void filtrarAire() {
        System.out.println("Filtrando aire...");
    }

    public void ajustar() {
        System.out.println("Ajustando... cubrebocas" + this.modelo);
    }
}
