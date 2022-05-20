package Caja;

public class PruebaCaja {
    
    public static void main(String[] args) {
        
        //Primer objeto con el constructor vacio
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;        
        
        Caja caja1 = new Caja();
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        
        int volumen = caja1.calcularVolumen();
        
        System.out.println("Resultado volumen de Caja 1: " + volumen);
        
        //Segundo objeto con el constructor con argumentos
        Caja caja2 = new Caja(2,2,2);
        System.out.println("Resultado volumen de Caja 2: " + caja2.calcularVolumen());
        
        
    }
   
    
}
