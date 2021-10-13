/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimoscuadrados;

/**
 *
 * @author B14
 */
public class MinimosCuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] x = {1,2,4,6,7,9,10,13};
        double[] y = {7,5,6,3,4,2.5,2,0.5};
        double totalx = 0;
        double totaly = 0;
        double totalxy = 0;
        double totalx2 = 0;
        double n = x.length;

        
        for (int i = 0; i < x.length; i++){
            totalx+=x[i];
        }
        System.out.println("La sumatoria de x es: " +totalx);

        for ( int i = 0; i < y.length; i++){
            totaly+=y[i];
        }
        System.out.println("La sumatoria de y es: " +totaly);
        
        for ( int i = 0; i < x.length; i++){
            totalxy+=x[i]*y[i];
            
        }
        System.out.println("Total de xy: " + totalxy);
        

        for ( int i = 0; i < x.length; i++){
            totalx2+=x[i]*x[i];
        }
        
        System.out.println("La sumatoria de x al cuadrado es: " +totalx2);
        
        double a1 = (n*(totalxy)-(totalx*totaly))/(n*(totalx2)-(totalx*totalx));
        System.out.println("Resultado a1 " + a1);
        double mediaX = totalx/n;
        double mediaY = totaly/n;

        System.out.println("Media x: " + mediaX);
        
        System.out.println("Media y: " + mediaY);


        
        double a0 = mediaY - a1 * mediaX;
        System.out.println("a0 es: " + a0);
        
        System.out.println("y = " + a0 + " + " + a1 + "x");
        
        

    }
    
}
