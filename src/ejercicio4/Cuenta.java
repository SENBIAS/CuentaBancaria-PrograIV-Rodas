/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Cuenta {
    private long numeroCuenta;
    private long dni;
    private double saldoActual;
    private int interesAnual;

    public Cuenta() {
    }

    public Cuenta(long dni, long saldoActual, int interesAnual) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(int interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    public void actualizarSaldo(){
        double nuevoSaldo;
        System.out.print("Ingrese el nuevo saldo: ");
        Scanner teclado = new Scanner(System.in);
        nuevoSaldo = teclado.nextDouble();
        System.out.println("");
        setSaldoActual(nuevoSaldo); 
    }
    
    private void actualizarSaldo(double retiro){
        double nuevoSaldo;
        nuevoSaldo = getSaldoActual() - retiro;
        setSaldoActual(nuevoSaldo);
        System.out.println("Su nuevo saldo es: "+getSaldoActual());      
    }
    
    public void ingresar(double ingreso){
        double nuevoSaldo;
        nuevoSaldo = getSaldoActual() + ingreso;
        setSaldoActual(nuevoSaldo);
        System.out.println("Su nuevo saldo es: "+getSaldoActual());      
    }
    
    public void retirar(double retiro){
        if(getSaldoActual()==0){
            System.out.println("No hay saldo disponible.");
        }else if(retiro > getSaldoActual()){
            System.out.println("No posee la cantidad de dinero suficiente.");
        }else if(retiro <= getSaldoActual()){
            actualizarSaldo(retiro);
        }
    }
    
    public void datosCuenta(){
        System.out.println("Numero cuenta: "+getNumeroCuenta());
        System.out.println("DNI: "+getDni());
        System.out.println("Saldo actual: "+getSaldoActual());
        System.out.println("Interes: "+getInteresAnual());
    }
}
