package Controlador;

import java.util.ArrayList;

    import Modelo.Cuenta;
    import Modelo.Cliente;

public class cClientes {
    private ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        private ArrayList<Cliente> listaClientes = new ArrayList<>();

        public ArrayList<Cuenta> getListaCuentas() {
            return listaCuentas;
        }

        public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
            this.listaCuentas = listaCuentas;
        }

        public ArrayList<Cliente> getListaClientes() {
            return listaClientes;
        }

        public void setListaClientes(ArrayList<Cliente> listaClientes) {
            this.listaClientes = listaClientes;
        }

    /**
     *  @author Gabriel José Guzmán Leiva
     *  Crea un objeto utilizano el arrayList listaCuentas y listaClientes
     *
     * @param listaCuentas  parametro de los arrays de la donde estan los clientes
     * @param listaClientes parametro del arrayList de de donde estan las cuentas.
     */

    public cClientes(ArrayList<Cuenta> listaCuentas, ArrayList<Cliente> listaClientes) {
        this.listaCuentas = listaCuentas;
        this.listaClientes = listaClientes;
    }

    public Cuenta crearCuenta(){

        return new Cuenta(50000);
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  funcion que recibe como parametro una cuenta de tipo cuenta y la agrega al arraylist de las cuentas.
     *
     * @param cuenta toma el valor de la cuenta que se desea agregar al arayList.
     */

    public void agregarCuenta(Cuenta cuenta){

        this.listaCuentas.add(cuenta);
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  funcion que recibe como parametro un cliente de tipo cliente  y lo agrega al arrayList de clientes.
     *      * @param cliente parametro que toma el valor del cliente que se desea agregar al arraylist.
     */

    public void agregarCliente(Cliente cliente){

        this.listaClientes.add(cliente);
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *   Crea un "Cliente" recibiendo como parametros el nombre, identificacion, edad y direccion.
     *
     * @param nombre  nombre del usuario
     * @param identificacion identificacion de usuario
     * @param fechaNacimiento fecha de nacimiento del usuario  (dd/mm/aa)
     * @param edad  edad del usuario
     * @param direccion direccion donde vive el usuario
     */

    public Cliente crearCliente(String nombre, String identificacion, String fechaNacimiento, int edad, String direccion ){

        return new Cliente(nombre, identificacion, fechaNacimiento, edad, direccion );
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  método to string que muestra los atributos del cliente.
     *
     * @return devuelve los strings de los atributos de la clase.
     */

    @Override
    public String toString() {
        return "CuentasClientes{" +
                "listaCuentas=" + listaCuentas +
                ", listaClientes=" + listaClientes +
                '}'+ "\n";
    }

}//Fin programa
