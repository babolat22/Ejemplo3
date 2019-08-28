/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author juanj
 */
public class P1ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1, n1=0, n2, n3;
        System.out.println("Ingrese 3 numeros:");
        i = JOptionPane.showConfirmDialog(null,"¿Realmente Desea Salir de Hola Swing?","Confirmar Salida",JOptionPane.YES_NO_OPTION);
        if(i==0){
            System.exit(0);
         }
        n1= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese: "));  // con dialogo
        Scanner sc = new Scanner(System.in);     // por consola
       // n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1<n2 && n3<n2) {
            System.out.println("El matyor es: "+ n2);
           
        }else
            if(n2<n1 && n3<n1)
                System.out.println("El matyor es: "+ n1);
            else
                System.out.println("El mayor es: "+ n3);
        System.out.println("JAJA GANE ");
        
    }
    
}
