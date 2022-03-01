/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Automovil;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author calav
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println(s1);
        System.out.println(s1.toString());

        Automovil miVocho = new Automovil();
        System.out.println(miVocho);
        miVocho.setMarca("VW");
        miVocho.setSubMarca("Sedan");
        miVocho.setModelo(1970);
        miVocho.setColor(Color.BLUE);
        System.out.println(miVocho);

        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.YELLOW);
        System.out.println(miMustang);

        Automovil miAkura = new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);
    }

}
