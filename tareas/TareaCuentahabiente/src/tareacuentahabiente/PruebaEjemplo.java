package tareacuentahabiente;


public class PruebaEjemplo {

    public static void main(String[] args) {
        System.out.println("----CUENTAHABIENTES----");
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0]=new Cuentahabiente("99609","PABLO",100000.92f);
        lista[1]=new Cuentahabiente("86954","JAVIER",50000.00f);
        lista[2]=new Cuentahabiente("98623","OSCAR",16000.02f);
        lista[3]=new Cuentahabiente("77777","JUAN",26509.96f);
        lista[4]=new Cuentahabiente("60681","PEDRO",50000.40f);
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarNivelCliente());    
        }
    }
    
}