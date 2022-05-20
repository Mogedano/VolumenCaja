package Caja;

public class Caja {
    
    //Atributos
    int ancho;
    int alto;
    int profundo;
    
    //Constructor vacio
    public Caja(){
        System.out.println("Ejecutando constructor vacío");
    }
        
    //Constructor con 3 argumentos
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con argumentos");    
    }
    
    //Metodo que calcula el volumen de la caja    
    public int calcularVolumen(){        
        return this.ancho * this.alto * this.profundo;            
    }
    
}