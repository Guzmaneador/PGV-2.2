package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author 2dama
 */
public class Hilo implements Runnable {
    Scanner Teclado = new Scanner(System.in);
    int numero;
    int resultado, siguiente;

    public Hilo(int numero) {
        this.numero = numero;
    }
    public void crearHilo(){

        
        
    }
    

    @Override
    public void run() {
        System.out.println("introduce los dos primeros numeros separados por espacio:");
        resultado = Teclado.nextInt();
        siguiente = Teclado.nextInt();
        for (int i = 0; i < numero; i++) {
           resultado = siguiente + resultado;
            
        }
    
    }
    
    
}
