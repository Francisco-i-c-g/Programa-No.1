/*
27/Agosto/2019
INSTITUTO TECNOLOGICO DE TLAJOMULCO.
INGENIERIA EN SISTEMAS COMPUTACIONALES.
ESTRUCTURA DE DATOS 3RE SEMESTRE.
PROGRAMMER: FRANCISCO ISRAEL CASTILLO GUTIERREZ.
*/

package numero;

import javax.swing.JOptionPane;

public class Numero {

    public static void main(String[] args) {
        boolean sente = true;
        int cer = 0;
        int a = 1;
        float numero_0 = 0;
        boolean real_0 = false;
        
        while(sente == true) {
            try {
                String numero_1 = JOptionPane.showInputDialog(null, "Por favor, ingrese un numero(Entero o real.): ");
                sente = false;
                numero_0 = Float.parseFloat(numero_1);
            }
            catch(java.lang.NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, por favor intente de nuevo.");
                sente = true;
            }
            
            catch(java.lang.NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Error, por favor intente de nuevo.");
                sente = true;
                real_0 = true;
                break;
            }
            finally {
                
            }
 
        }
        
        
        
        /*
        Algoritmo para saber si es numero real o entero.
        */
        int numero_a = (int)numero_0;
        
        float numero_4 = numero_0 / 2;
        int numero_3 = (int) numero_4;
        float resul = numero_4 - numero_3;
        
        if (resul == 0.5 || resul == 0) {
            System.out.println("Es numero entero.");
        }
       
        else  {
            System.out.println("Es numero real.");
            real_0 = true;
        }
        
        
        
        /*
        Algoritmo para saber si es numero par o impar.
        */
        if (real_0 == false && numero_a % 2 == 0){
            System.out.println("El numero es par.");
        }
        else if (real_0 == false) {
            System.out.println("El numero es impar.");
        }
        
        
        
        /*
        Algoritmo para saber si es numero primo o no.
        */
        int i = 1;
        int n = 0;
        while (i <= numero_a){
            
            if (numero_a % i == 0){
                n+=1;
            }
            i+=1;
        }
        if (real_0 == false && n==2){
            System.out.println("El numero es primo.");
        }
        else if (real_0 == false && n!=2){
            System.out.println("El numero no es primo.");
        }
        
        
        
        /* Agoritmo para calcular factorial.
        */
        int num_a = 1;
        int num_b = 2;
        
        while(num_b <= numero_a){
            num_a = num_b * num_a;
            num_b+=1;
        }
        if(real_0 == false){
            System.out.println("El factorial de este numero es:"+num_a);
        }


    }
    
}
