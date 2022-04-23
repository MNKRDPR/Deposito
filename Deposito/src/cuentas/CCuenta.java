package cuentas;

/** 
 *Esta clase CCuentas crea el objeto cuenta que incluye nombre del titular, 
 * numero de cuenta y saldo 
 * las operaciones necesarias
 */
public class CCuenta {

    /**
     * metodo getter para nombre
     * @return el nombre del titular de la cuenta
     */
    private String getNombre() {
          return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        /*metodo setter para nombre*/
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    private String getCuenta() {
        /*metodo getter para cuenta*/
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    private void setCuenta(String cuenta) {
        /*metodo setter para cuenta*/
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    private double getSaldo() {
        /*metodo getter para saldo*/
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    private void setSaldo(double saldo) {
        /*metodo setter para saldo*/
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    private double getTipoInterés() {
        /*metodo getter para tipo de interes*/
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    private void setTipoInterés(double tipoInterés) {
        /*metodo setter para tipo de interes*/
        this.tipoInterés = tipoInterés;
    }

/*declaracion de atributos del objeto*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        /**
	 * Constructor que inicializa los parametros de clase cuenta 
	 * @param nom nombre del titular de la cuenta
         * @param cue numero de cuenta del titular
         * @param sal saldo actual de la cuenta
         */
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        /*metodo getter para informar saldo*/
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        /*metodo para comprobar si la cantidad indicada para ingresar es correcta*/
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        /*metodo para comprobar si la cantidad a retirar es posible depeendiendo del saldo*/
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
