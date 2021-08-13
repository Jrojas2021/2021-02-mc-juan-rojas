/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import java.util.HashSet;

/**
 *
 * @author B14
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<Integer> A = new HashSet<>();
        for (int i = 3 ; i <= 20; i++){
            A.add(i);
        }
        System.out.println("Conjunto A" + A);
        
        HashSet<Integer> B = new HashSet<>();
        for (int i = 1 ; i < 28; i++){
            if ( i % 2 == 0){
                B.add(i);
            }
        }
        System.out.println("Conjunto B" + B);
        
        HashSet<Integer> C = new HashSet<>();
        C.add(1);
        C.add(4);
        C.add(7);
        C.add(8);
        C.add(10);
        C.add(14);
        C.add(17);
        C.add(20);
        System.out.println("Conjunto C" + C);
        HashSet<Integer> D = new HashSet<>();
        D.add(2);
        D.add(3);
        D.add(5);
        D.add(7);
        D.add(11);
        D.add(13);
        D.add(17);
        D.add(19);
        D.add(23);
        D.add(29);
        D.add(31);
        D.add(41);
        D.add(43);
        System.out.println("Conjunto D" + D);

        
        
        //Se realiza la primera operacion
        HashSet<Integer> O1 = diferencia_simetrica(interseccion(A,C), B);
        System.out.println("Operación 1: " + O1);
        
        HashSet<Integer> O2 = diferencia(union(C,A), D);
        System.out.println("Operación 2: " + O2);
        
        HashSet<Integer> O3 = union(A,diferencia_simetrica(B,C));
        System.out.println("Operación 3: " + O3);
        
        HashSet<Integer> O4 = diferencia(interseccion(A,D), diferencia_simetrica(B,C));
        System.out.println("Operación 4: " + O4);
    }
    
    public static HashSet<Integer> union(HashSet<Integer> c1, HashSet<Integer> c2){
    HashSet<Integer> union = new HashSet<>();
        for (int elemento : c1) {
            union.add(elemento);
        }
        for (int elemento : c2) {
            union.add(elemento);
        }
        return union;
    }
    
    public static HashSet<Integer> interseccion(HashSet<Integer> c1, HashSet<Integer> c2){
   HashSet<Integer> interseccion = new HashSet<>();
        for (int elemento : c1) {
            if (c2.contains(elemento)) {
                interseccion.add(elemento);
            }
        }
        return interseccion;
    }
    public static HashSet<Integer> diferencia(HashSet<Integer> c1, HashSet<Integer> c2){
    HashSet<Integer> diferencia = new HashSet<>();
        for (int elemento : c1) {
            if(!c2.contains(elemento)) {
                diferencia.add(elemento);
            }
        }   
        return diferencia;
    }
    
    public static HashSet<Integer> diferencia_simetrica(HashSet<Integer> c1, HashSet<Integer> c2){
    
    return diferencia(union(c1, c2), interseccion(c1,c2));
    }
    
    } 
    

