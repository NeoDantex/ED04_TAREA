package cuentas;

/**
 * Clase Main, encargada de llamar a la función operativa_cuenta.
 */
public class Main {
    /**
     * Método main, que llama a la función operativa_cuenta.
     * @param args argumentos recibidos por línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(null);
    }
    /**
     * Método operativa_cuenta, que realiza una operativa básica en una cuenta.
     * @param cantidad cantidad a operar en la cuenta.
     */
    private static void operativa_cuenta(java.lang.Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
