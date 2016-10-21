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
        n=solicitarNumero();   //solicitamos numero
        o=operacion(n);  //operacion
        mensajeSalida();
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
    for (i= 1; i<=n; i++){    //se dividiran entre todos los numeros posibles si mod es cero...
        if(n%i==0){           //se sumara un divisor
            divisores++;
        }
    }
    if (divisores ==2){ System.out.println("El numero es primo");   //si solo hay dos divisores es primo
    }
    else{
        System.out.println("El numero no es primo");
    }
    return n;
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
    }          
}