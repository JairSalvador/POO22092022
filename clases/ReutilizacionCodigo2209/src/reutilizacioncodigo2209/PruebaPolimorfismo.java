package reutilizacioncodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

/**
 * @author Jair
 */
public class PruebaPolimorfismo {
    
    public static void main(String[] args) {
        System.out.println("Hola polimorfismo");
        Persona per1 = new Persona();
        per1.setNombre("José");
        per1.dormir();
        
        Alumno al1 = new Alumno();
        al1.setNombre("Jose");
        al1.dormir();
        al1.dormir(4);
        
    }
}
