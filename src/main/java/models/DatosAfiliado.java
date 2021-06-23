package models;

public class DatosAfiliado {

    private String valorCuentaIndividual;
    private String numeroDocumento;
    private String edadDefinida;
    private String nombre;
    private String salarioActual ;
    private String numeroAsesoria ;
    private String semanas ;
    private String semanasBono ;
    private String SemanasNBono ;
    private String Bono ;
    private String resultadoSimulador ;
    private String resultadoFinalSimulador ;
    private String datos;
    private String mesada;
    private String mesadaColpensiones;

    public String getMesada() {
        return mesada;
    }

    public void setMesada(String mesada) {
        this.mesada = mesada;
    }

    public String getMesadaColpensiones() {
        return mesadaColpensiones;
    }

    public void setMesadaColpensiones(String mesadaColpensiones) {
        this.mesadaColpensiones = mesadaColpensiones;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getResultadoFinalSimulador() {
        return resultadoFinalSimulador;
    }

    public void setResultadoFinalSimulador(String resultadoFinalSimulador) {
        this.resultadoFinalSimulador = resultadoFinalSimulador;
    }

    public String getResultadoSimulador() {
        return resultadoSimulador;
    }

    public void setResultadoSimulador(String resultadoSimulador) {
        this.resultadoSimulador = resultadoSimulador;
    }

    public String getBono() {
        return Bono;
    }

    public void setBono(String bono) {
        Bono = bono;
    }

    public String getSemanas() {
        return semanas;
    }

    public void setSemanas(String semanas) {
        this.semanas = semanas;
    }

    public String getSemanasBono() {
        return semanasBono;
    }

    public void setSemanasBono(String semanasBono) {
        this.semanasBono = semanasBono;
    }

    public String getSemanasNBono() {
        return SemanasNBono;
    }

    public void setSemanasNBono(String semanasNBono) {
        SemanasNBono = semanasNBono;
    }

    public String getNumeroAsesoria() {
        return numeroAsesoria;
    }

    public void setNumeroAsesoria(String numeroAsesoria) {
        this.numeroAsesoria = numeroAsesoria;
    }

    public String getValorCuentaIndividual() { return valorCuentaIndividual; }

    public void setValorCuentaIndividual(String valorCuentaIndividual) { this.valorCuentaIndividual = valorCuentaIndividual; }

    public String getSalarioActual() { return salarioActual; }

    public void setSalarioActual(String salarioActual) { this.salarioActual = salarioActual; }

    public String getNombre() { return nombre;  }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEdadDefinida()
    { return edadDefinida; }

    public void setEdadDefinida(String edadDefinida) {
        this.edadDefinida = edadDefinida; }

    public String getNumeroDocumento() { return numeroDocumento; }

    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }
}
