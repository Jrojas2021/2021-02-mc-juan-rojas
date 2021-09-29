/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author B14
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /** Arrays.deepToString(m));*/
        Scanner entrada = new Scanner(System.in);
        
        int productoEscalar = 0,n;
        
        System.out.println("Ingrese el valor de n");
        n = entrada.nextInt();
        
        int [] a = new int [n];
        int [] b = new int [n];
                
        for(int i = 0; i < n; i++){
            a[i] = (int) ( Math.random() * 11);
            b[i] = (int) ( Math.random() * 11);
        }

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + "\t");
          
        }
        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.print(b[i] + "\t");
        }
        
        for(int i = 0; i < n; i++){
            productoEscalar = productoEscalar + a[i] * b[i];
           
        }
        System.out.println();
        System.out.println("El producto escalar entre los dos vectores es: " + productoEscalar);
    }
    
}
