/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion3;

/**
 *
 * @author B14
 */
public class GaussJordan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] a = {{2,1,4,-4},
                        {5 , 5 ,3,-2},
                        {2,2,-2,0},
                        {0,5,-2,1}};
        double [] b = {-1,3,9, 11};
        
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
                       
                       double valorAux = b[i];
                       b[i] = b[m];
                       b[m] = valorAux;
                       
                       pivote = a[i][i];
                       break;
                   }
               }
           }
           if (pivote != 1) {
           // Dividir toda la fila por el valor del pivote
           for ( int j = 0; j <a[i].length; j++){
               a[i][j] = a[i][j]/pivote;
           }
            b[i] = b[i] / pivote;
            
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
                }
                System.out.println("Reduccion");
                imprimirSistema(a,b);
                   }

       } 
        
        
    }
    public static void imprimirSistema(double [][] a, double[] b){
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
            System.out.print(a[i][j] + "   ");
            }
            System.out.println("" + b[i]);

        }
    }
}
