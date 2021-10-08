/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizinversa;

/**
 *
 * @author B14
 */
public class GaussJordan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] a = {{3,1,1},
                        {1 , 0 ,-3},
                        {5,2,-5}};
        
        double [][] b = crearIdentidad(a.length);
        
       for ( int i = 0; i < a.length; i++){
           double pivote = a[i][i];
           if (pivote == 0){
               // se va a hacer el cambio del renglon
               for(int m = i +1; m < a.length; m++){
                   if(a[m][i] != 0){
                       // se hace el cambio de renglon
                       double[] renglonAux = a[i];
                       a[i] = a[m];
                       a[m] = renglonAux;
                       
                       double [] valorAux = b[i];
                       b[i] = b[m];
                       b[m] = valorAux;
                       
                       pivote = a[i][i];
                       break;
                   }
               }
               System.out.println("Cambio");
               imprimirSistema(a,b);
               
           }
           if (pivote != 1) {
           // Dividir toda la fila por el valor del pivote
           for ( int j = 0; j <a[i].length; j++){
               a[i][j] = a[i][j]/pivote;
           }
           for ( int j = 0; j <a[i].length; j++){
               b[i][j] = b[i][j]/pivote;
           
           }            
            System.out.println("Pivoteo");
           imprimirSistema(a,b);
           
           }else{
              System.out.println("No requiere pivoteo");
                   }
           //Reduccion

           for (int l = 0; l < a.length; l++){
                if(i != l){
                   double multiplicador = a[l][i];
                   for (int j = 0 ; j < a[l].length; j++){
                        a[l][j] = a [l][j] - multiplicador * a[i][j];
                    }
                   
                   for (int j = 0 ; j < a[l].length; j++){
                        b[l][j] = b [l][j] - multiplicador * b[i][j];
                    }
                
                }
              
                   }
           System.out.println("Reduccion");
                imprimirSistema(a,b);

       } 
        
        
    }
    public static void imprimirSistema(double [][] a, double[][] b){
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "   ");
            }
            System.out.print("|  ");
            for(int j = 0; j < a[i].length; j++){
                System.out.print(b[i][j] + "   ");
            }
            System.out.println();
        }
    }
    
    public static double[][] crearIdentidad(int tamano) {
        double[][] rta = new double [tamano][tamano];
        for(int i = 0; i < tamano; i++){
            rta[i][i] = 1;
            }
        return rta;
    }
            }
