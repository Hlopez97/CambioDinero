/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiodinero;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class CambioDinero {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("este programa te divide el dinero en monedas dominicanas");
        System.out.println("inserte el dinero que se desea");
        int numero = sc.nextInt();
        Cambio(numero);
    }
    public static int[] Cambio(int numero)
        {

            int[] resultado = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            resultado[0] = 5;

            if (numero >= 2000)
            {
                System.out.println("son " + numero / 2000 + " de 2000");
                resultado[0] = numero / 2000;
                numero = numero % 2000;
            }
            if (numero >= 1000)
            {
                System.out.println("son " + numero / 1000 + " de 1000");
                resultado[1] = numero / 1000;
                numero = numero % 1000;
            }
            if (numero >= 500)
            {
               System.out.println("son " + numero / 500 + " de 500");
                resultado[2] = numero / 500;
                numero = numero % 500;
            }
            if (numero >= 200)
            {
                System.out.println("son " + numero / 200 + " de 200");
                resultado[3] = numero / 200;
                numero = numero % 200;
            }
            if (numero >= 100)
            {
                System.out.println("son " + numero / 100 + " de 100");
                resultado[4] = numero / 100;
                numero = numero % 100;
            }
            if (numero >= 50)
            {
                System.out.println("son " + numero / 50 + " de 50");
                resultado[5] = numero / 50;
                numero = numero % 50;
            }
            if (numero >= 25)
            {
                System.out.println("son " + numero / 25 + " de 25");
                resultado[6] = numero / 25;
                numero = numero % 25;
            }
            if (numero >= 10)
            {
                System.out.println("son " + numero / 10 + " de 10");
                resultado[7] = numero / 10;
                numero = numero % 10;
            }
            if (numero >= 5)
            {
                System.out.println("son " + numero / 5 + " de 5");
                resultado[8] = numero / 5;
                numero = numero % 5;
            }
            if (numero >= 1)
            {
                System.out.println("son " + numero / 1 + " de 1");
                resultado[9] = numero / 1;
                
            }
            return resultado;
        }
    
}
