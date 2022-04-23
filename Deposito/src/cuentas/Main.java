package cuentas;
/** 
 *Esta clase Main es la principal del programa, aqui creamos el objeto y hacemos 
 * las operaciones necesarias
 */
public class Main {
/**
 * Se utiliza para crear un objeto de la clase CCuenta introduciendo los datos
 * */
    public static void main(String[] args) {
       /**
        * clase principal que ejecuta el programa, no devuelve ningun valor
        */
        CCuenta cuenta1;
        double saldoActual;
        /*metodo refactorizado para operar con la cuenta*/
        operativa_cuenta(2300);
    }

    private static void operativa_cuenta(float cantidad) {
        /*metodo con parametro para operar con la cuenta*/
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
