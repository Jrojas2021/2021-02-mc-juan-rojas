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
public class ModeloExp {
    
    public static void main(String[] args) {
        // TODO code application logic here
        double[] x = {1,3,5,7,9,11,13,15};
        double[] y = {4.1,6.5,7.5,7.9,8.3,8.8,9.1,9.3};
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
