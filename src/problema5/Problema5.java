/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,o;
        n=solicitarNumero();
        o=operacion(n);
        
    }
    public static int solicitarNumero(){
    int n;
    System.out.print("Introduce un numero para saber si es primo: ");
    Scanner teclado= new Scanner(System.in);
    n=teclado.nextInt();
    return n;
    }
    
    public static int operacion(int n){
       int i,divisores=0;
    for (i= 1; i<=n; i++){
        if(n%i==0){
            divisores++;
        }
    }
    if (divisores !=2){ System.out.println("El numero no es primo");
    }
    else{
        System.out.println("El numero es primo");
    }
    return n;
    }
}