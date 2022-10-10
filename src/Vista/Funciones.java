package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import Controlador.cClientes;
import  Modelo.Cuenta;
import Modelo.Cliente;

public class Funciones {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        cClientes cClientes = new cClientes(listaCuentas, listaClientes);

        int opcion;

        do {
            imprimirFunciones();
            opcion = entrada.nextInt();
            opcioneFunciones(opcion, cClientes, listaCuentas , listaClientes );
        }while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6) ;

    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  funcion que recibe como parametro la opcion que el usuario selecciono para luego ejecutar la accion que se desea.
     * @param opcion variable que luego almacena la opcion que el usuario selecciono.
     * @param cClientes el objeto de cuentas clientes para poder utilizar las funciones del controlador dentro de la funcion.
     * @param listaCuentas arrayList que luego que va a usar para almacenar las cuentas creadas.
     * @param listaClientes arrayList que luego que va a usar para almacenar los clientes creados.
     */

    public static void opcioneFunciones(int opcion, cClientes cClientes, ArrayList<Cuenta> listaCuentas , ArrayList<Cliente> listaClientes ) {

        String nombre;
        String identificacion;
        String fechaNacimiento;
        String direccion;
        int edad;

        switch (opcion) {

            case 1:

                String decision;

                System.out.println("Escriba el nombre del cliente: ");
                nombre = entrada.next();
                System.out.println("Escriba la identificación del cliente: ");
                identificacion = entrada.next();

                System.out.println("Escriba la fecha de nacimiento del cliente: ");
                fechaNacimiento = entrada.next();
                System.out.println("Escriba la edad del cliente: ");
                edad = entrada.nextInt();

                System.out.println("Escriba la dirección del cliente: ");
                direccion = entrada.next();

                Cliente cliente = cClientes.crearCliente(nombre, identificacion, fechaNacimiento, edad, direccion);

                cClientes.agregarCliente(cliente);


                break;

            case 2:

                System.out.println("Los clientes son los siguentes: \n");

                listaClientes = cClientes.getListaClientes();

                System.out.println(listaClientes.toString());

                break;

            case 3:

                System.out.println("NOTA: Las cuentas se crean a partir del número 1000000 siendo el número 10000001 el siguiente");

                listaCuentas = cClientes.getListaCuentas();

                Cuenta cuentas = cClientes.crearCuenta();
                cClientes.agregarCuenta(cuentas);

                System.out.println("Cuenta creada con exito");

                break;

            case 4:

                int numCuenta;
                double cantidadDeposito;


                System.out.println("Digite el número de cuenta al cual desea realizar un depósito");
                numCuenta = entrada.nextInt();
                System.out.println("Digite la cantidad que desea depositar");
                cantidadDeposito = entrada.nextDouble();

                int posicionCuenta = 0;

                for (int cont = 0; cont < listaCuentas.size(); cont++) {

                    if (numCuenta == listaCuentas.get(cont).getNumeroCuenta()) {

                        posicionCuenta = cont;
                        listaCuentas.get(posicionCuenta).depositarSaldo(cantidadDeposito, numCuenta);
                        System.out.println("Deposito relizado con exito");

                    } else if (posicionCuenta == 0) {
                        System.out.println("La cuenta con el número proporcionado no existe ");

                    }
                }

                break;

            case 5:

                int numCuentaRetiro;
                double cantidadRetiro;

                System.out.println("Digite el número de cuenta al cual desea realizar un retiro");
                numCuentaRetiro = entrada.nextInt();
                System.out.println("Digite la cantidad que desea retirar");
                cantidadRetiro = entrada.nextDouble();

                int posicionCuentaRetiro = 0;

                for (int cont = 0; cont < listaCuentas.size(); cont++) {

                    if (numCuentaRetiro == listaCuentas.get(cont).getNumeroCuenta()) {

                        posicionCuentaRetiro = cont;
                        listaCuentas.get(posicionCuentaRetiro).retirarSaldo(cantidadRetiro, numCuentaRetiro);
                        System.out.println("Retiro relizado con exito");


                    } else if (posicionCuentaRetiro == 0) {

                        System.out.println("La cuenta con el número proporcionado no existe ");

                    }
                }

                break;

            case 6:


                int numCuentaListar;


                System.out.println("Digite el número de cuenta al cual desea listar");
                numCuentaListar = entrada.nextInt();

                int posicionCuentaListar = 0;

                for (int cont = 0; cont < listaCuentas.size(); cont++) {

                    if (numCuentaListar == listaCuentas.get(cont).getNumeroCuenta()) {

                        posicionCuentaListar = cont;


                    } else if (posicionCuentaListar == 0) {

                        System.out.println("La cuenta con el número proporcionado no existe ");
                    }
                }

                System.out.println(listaCuentas.get(posicionCuentaListar).getSaldoTotal());

                break;

        }
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  Funcion que se encarga de imprimir el menu principal con sus respectivas opciones que se quieran realizar.
     *
     */

    public static void imprimirFunciones(){

        System.out.println("\t\t\t --BIENVENIDO AL BANCO LOS LAVADORES--");
        System.out.println("Por favor seleccione una de las siguientes opciones \n");

        System.out.println("1. Registrar un cliente:");
        System.out.println("2. Listar clientes registrados:");
        System.out.println("3. Crear una cuenta:");
        System.out.println("4. Realizar un depósito");
        System.out.println("5. Realizar un retiro");
        System.out.println("6. Mostrar el saldo de una cuenta");

    }

}//Fin programa
