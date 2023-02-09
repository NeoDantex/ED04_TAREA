package cuentas;

/**
 * Clase `CCuenta` que representa una cuenta bancaria.
 *
 * @author Sebastián Gutiérrez Ortega
 */
public class CCuenta {

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param name Nombre del titular de la cuenta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible en la cuenta.
     *
     * @return Saldo disponible en la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo disponible en la cuenta.
     *
     * @param saldo Saldo disponible en la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene la tasa de interés de la cuenta.
     *
     * @return Tasa de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece la tasa de interés de la cuenta.
     *
     * @param tipoInteres Tasa de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    /** Nombre del titular de la cuenta */
    private String name;

    /** Número de cuenta */
    private String cuenta;

    /** Saldo disponible en la cuenta */
    private double saldo;

    /** Tasa de interés de la cuenta */
    private double tipoInteres;

    /**
     * Constructor sin parámetros. Inicializa todas las variables a sus valores por defecto.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros. Inicializa las variables `name`, `cuenta`, `saldo` y `tipoInterés`
     * con los valores especificados en los argumentos.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo disponible en la cuenta.
     * @param tipo Tasa de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        name =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Devuelve el saldo actual de la cuenta
     * 
     * @return Saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Ingresa una cantidad a la cuenta
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una cantidad de la cuenta
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad a retirar es negativa o mayor al saldo actual
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
