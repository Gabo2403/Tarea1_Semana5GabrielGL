package Modelo;

public class Cuenta {

    private int numeroCuenta;
    public static int numero = 1000000;
    private double saldoTotal;

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     * Crea una cuenta que recibe el saldo todal como parametro.
     *
     *  la variable numero sirve para asignar un numero mas cada vez que se crea una cuenta (ej: 1000000 - 1000001- 1000002).
     *
     * @param saldoTotal la cantidad de saldo acumulado dentro de la cuenta.
     */

    public Cuenta(double saldoTotal) {

        numeroCuenta = numero;
        this.saldoTotal = saldoTotal;
        numero++;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {

        if (this.numeroCuenta <= 9999999 && this.numeroCuenta >= 1000000){

            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     *
     *  @author Gabriel José Guzmán Leiva
     *   funcion retirar saldo que recibe como parametros el monto a retirar y el numero de cuenta que se deesea retirar
     *
     *   Si el saldo que se desea retirar es mayor al saldo acumulado no se retira nada de la cuenta.
     *
     * @param Retirar variable que indica la cantidad de saldo que se va a retirar.
     * @param numeroCuenta variable que idnica cual es el numero de cuenta al cual se desea retirar el saldo.
     */

    public void retirarSaldo(double Retirar, int numeroCuenta){

        if (this.saldoTotal - Retirar< 0) {
            Retirar = 0;
        }else {
            this.saldoTotal = this.saldoTotal - Retirar;
        }
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  Funcion que recibe como parametro  la cantidad que se va a a depositar y el numero de cuenta a cual se le va a de depositar esa cantidad.
     *
     *
     * @param Depositar variable que almacena el monto que se va a depositar.
     * @param numeroCuneta variable que almacena el numero de cuenta al cual se le va a depositar.
     */

    public void depositarSaldo(double Depositar, int numeroCuneta){
        if (Depositar > 0) {

            this.saldoTotal += Depositar;
        }
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  Metodo toString que se encarga de pasar a Stirng los atributos de la clase para luego ser mostrados
     *
     * @return los atributos de la clase en String.
     */

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldoTotal=" + saldoTotal +
                '}';
    }

}//Fin programa
