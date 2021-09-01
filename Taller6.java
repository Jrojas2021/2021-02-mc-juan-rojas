package taller6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taller6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Terminos: ");
        int no = Integer.parseInt(reader.readLine());
        
        System.out.println("Grados: ");
        int grados = Integer.parseInt(reader.readLine());
        
        double radianes = Math.toRadians(grados);
        int p = 0;
        double error = 0.0;
        double cos= 0.0;
        for(int i = 1;i <= no;i++)
        {
            double Termino = 0.0;
         
            if(i%2!=0)
            {
                Termino = Math.pow(radianes,p)/getFact(p);
            }
            else
            {
                Termino = Math.pow(radianes,p)/getFact(p);
            }
            cos = cos+Termino;
              p = p+2;
              error = (cos-Termino)/cos;
              System.out.println("Error: " + error);
        }
     
        System.out.println("Valor Estimado: " + cos);
        System.out.println("Numero Iteraciones: " + p);
    }
    static int getFact(int no)    
    {
        int fact = 1;
        for(int i = 1;i <= no;i++)
        {
            fact = fact*i;
        }
        return fact;

    }   
}
