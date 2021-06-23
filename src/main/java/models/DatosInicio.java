package models;

public class DatosInicio {

    private  String correo;
    private  String contrasenia;
    private  String cedula;
    private  String edad;
    private  String salario;
    private  String nombre;
    private  String valorCuentaIndividual;

    public DatosInicio(String correo, String contrasenia, String cedula, String edad, String salario, String nombre, String valorCuentaIndividual) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.cedula = cedula;
        this.edad = edad;
        this.salario = salario;
        this.nombre = nombre;
        this.valorCuentaIndividual = valorCuentaIndividual;
    }

    public DatosInicio() {

    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValorCuentaIndividual() {
        return valorCuentaIndividual;
    }

    public void setValorCuentaIndividual(String valorCuentaIndividual) {
        this.valorCuentaIndividual = valorCuentaIndividual;
    }
}
