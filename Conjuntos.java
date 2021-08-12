/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author JuanB
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numero de elementos para el conjunto A: ");
        int cardinalidadA = sc.nextInt();

        HashSet<Integer> A = new HashSet<>();
        for (int i = 0; i < cardinalidadA; i++) {
            System.out.print("Digita un numero: ");
            int x = sc.nextInt();
            A.add(x);
        }
        System.out.print("A = " + A);

        System.out.println("Numero de elementos para el conjunto B: ");
        int cardinalidadB = sc.nextInt();

        HashSet<Integer> B = new HashSet<>();
        for (int i = 0; i < cardinalidadB; i++) {
            System.out.print("Digita un numero: ");
            int x = sc.nextInt();
            B.add(x);
        }
        System.out.println("B = " + B);
        
        System.out.println("Ingrese el tipo de operación: Union digite 1 \nInterseccion digite 2\nDiferencia digite 3 ");
        int op = sc.nextInt();
        switch(op){
            case 1:
        //Union
        HashSet<Integer> union = new HashSet<>();
        for (int elemento : A) {
            union.add(elemento);
        }
        for (int elemento : B) {
            union.add(elemento);
        }
        System.out.println("Union => " + union);
        System.out.println("Cardinalidad " + union.size());
        
        break;
        
            case 2:
        //Interseccion
        HashSet<Integer> interseccion = new HashSet<>();
        for (int elemento : A) {
            if (B.contains(elemento)) {
                interseccion.add(elemento);
            }
        }
        System.out.println("Interseccion => " + interseccion);
        System.out.println("Cardinalidad " + interseccion.size());
        break;
            case 3:
        //Diferencia 
        HashSet<Integer> diferencia = new HashSet<>();
        for (int elemento : A) {
            if(!B.contains(elemento)) {
                diferencia.add(elemento);
            }
        }   
        System.out.println("Diferencia => " + diferencia);
        System.out.println("Cardinalidad " + diferencia.size());
        break;

    }
}
    
}

        
        
    

