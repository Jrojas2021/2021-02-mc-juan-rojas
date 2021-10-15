/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller17;

/**
 *
 * @author B14
 */
public class Taller17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] x = {0.6,1.2,1.8,2.4,3,3.5};
        double[] y = {1.5,2,3,4,6,7.2};
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
            totaly+=Math.log(y[i]);
        }
        System.out.println("La sumatoria de ln(y) es: " +totaly);
        
        for ( int i = 0; i < x.length; i++){
            totalxy+=x[i]*Math.log(y[i]);
            
        }
        System.out.println("Total de xy: " + totalxy);
        

        for ( int i = 0; i < x.length; i++){
            totalx2+=x[i]*x[i];
        }
        //Math.exp eleva e al exponente que nosotros q
        System.out.println("La sumatoria de x al cuadrado es: " +totalx2);
        
        double a1 = (n*(totalxy)-(totalx*totaly))/(n*(totalx2)-(totalx*totalx));
        System.out.println("Resultado a1 " + a1);
        double mediaX = totalx/n;
        double mediaY = totaly/n;

        System.out.println("Media x: " + mediaX);
        
        System.out.println("Media y: " + mediaY);


        
        double a0 = mediaY - a1 * mediaX;
        System.out.println("a0 es: " + a0);
        double alfa = Math.exp(a0);
        double beta = a1;
        System.out.println("alfa es: " + alfa);
        System.out.println("beta es: " + beta);

        
        System.out.println("y = " + alfa + " * e ^ " + beta + "x");
    }
    
}
