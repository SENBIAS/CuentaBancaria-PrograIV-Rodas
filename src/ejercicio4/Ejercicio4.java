/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        long dni;
        int cantidadCuentas=0;
        int option;
        long saldoActual;
        int interesAnual;
        long numeroCuenta = 100000;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        option = 0;
        
        
        do{
            System.out.println("1. Agregar cuenta");
            System.out.println("2. Actualizar saldo");
            System.out.println("3. Buscar por apellido");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Imprimir todos los contactos");
            System.out.println("6. SALIR");
            option = teclado.nextInt();
            switch(option){
                case 1:
                    teclado.nextLine();
                    System.out.print("Ingrese el dni: ");
                    dni = teclado.nextLong();
                    System.out.println("");
                    System.out.print("Ingrese el saldo actual: ");
                    saldoActual = teclado.nextLong();
                    numeroCuenta+=1;
                    System.out.print("Ingrese el interes anual %: ");
                    interesAnual = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("");
                    listaCuentas.add(new Cuenta(dni,saldoActual,interesAnual));
                    listaCuentas.get(cantidadCuentas).setNumeroCuenta(numeroCuenta);
                    cantidadCuentas+=1;
                    break;
                  
                case 2:
                    break;
            }        
        }while(option<2);
    }
    
}
