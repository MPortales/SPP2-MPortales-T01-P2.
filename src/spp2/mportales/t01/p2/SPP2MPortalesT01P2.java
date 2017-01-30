/*Maythé Portales Barrios
A01411461
Ing. Industrial y de Sistemas
Problema 2
 */
package spp2.mportales.t01.p2;
import java.util.Scanner;
/**
 *
 * @author may37
 */
public class SPP2MPortalesT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calculadora de perímetro y superficie de un rectángulo");
        Scanner teclado= new Scanner(System.in);
        double base, altu, sup, per;
        System.out.println("Introduce la base");
        base =teclado.nextDouble();
        System.out.println("Introduce la altura");
        altu =teclado.nextDouble();
        per = (base + base + altu + altu);
        sup = (base * altu);
        System.out.println("El perimetro es " +per);
        System.out.println("La superficie es " +sup);
      
        
    }
    
}
