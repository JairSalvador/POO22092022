/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplorepaso;

import java.awt.Color;

/**
 *
 * @author calav
 */
public class EjemploRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubrebocas cubre1 = new Cubrebocas();
        cubre1.setColor(Color.BLUE);
        System.out.println(cubre1.getColor());
        System.out.println(cubre1);

        Cubrebocas cubreDeAnahi = new Cubrebocas(Color.BLACK, "Tela", "KN-Home");
        System.out.println(cubreDeAnahi);
        cubreDeAnahi = new Cubrebocas(Color.WHITE, "Tela", "KN95");
        System.out.println(cubreDeAnahi);

    }

}
