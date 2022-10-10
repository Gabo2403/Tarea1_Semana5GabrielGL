package Modelo;

import java.util.ArrayList;


public class Cliente {

    private String nombre;
    private String identificacion;
    private String fechaNacimiento;
    private int edad;
    private String direccion;
    private ArrayList <Cuenta> cuentasUsuario;

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  Crea un "Cliente" recibiendo como parametros el nombre, identificacion, edad, direccion y un arraylist para las cuentas.
     *
     * @param nombre nombre del usuario
     * @param identificacion identificacion de usuario
     * @param fechaNacimiento fecha de nacimiento del usuario (dd/mm/aa)
     * @param edad edad del usuario
     * @param direccion ireccion donde vive el usuario
     * @param cuentasUsuario  un arrayList donde se van a guardar las cuentas del respectivo usuario
     */

    public Cliente(String nombre, String identificacion, String fechaNacimiento, int edad, String direccion, ArrayList<Cuenta> cuentasUsuario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.direccion = direccion;
        this.cuentasUsuario = cuentasUsuario;
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

    public Cliente(String nombre, String identificacion, String fechaNacimiento, int edad, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.direccion = direccion;
        this.cuentasUsuario = new ArrayList<Cuenta>();
    }

    public ArrayList<Cuenta> getCuentasUsuario() {
        return cuentasUsuario;
    }

    public void setCuentasUsuario(ArrayList<Cuenta> cuentasUsuario) {
        this.cuentasUsuario = cuentasUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *  @author Gabriel José Guzmán Leiva
     *
     *  metodo to string que muestra los atributos del cliente.
     *
     * @return devuelve los strings de los atributos de la clase.
     */

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}' + "\n";
    }

}//Fin programa
