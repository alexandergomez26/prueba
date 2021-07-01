package models;

public class ConsumoDatos {

    private float inflacion;
    private float tasaInteresTecnico;
    private float factorSeguridad;
    private float factorGasto;
    private float deslizamiento;
    private float factorComision;

    public float getInflacion() {
        return inflacion;
    }

    public void setInflacion(float inflacion) {
        this.inflacion = inflacion;
    }

    public float getTasaInteresTecnico() {
        return tasaInteresTecnico;
    }

    public void setTasaInteresTecnico(float tasaInteresTecnico) {
        this.tasaInteresTecnico = tasaInteresTecnico;
    }

    public float getFactorSeguridad() {
        return factorSeguridad;
    }

    public void setFactorSeguridad(float factorSeguridad) {
        this.factorSeguridad = factorSeguridad;
    }

    public float getFactorGasto() {
        return factorGasto;
    }

    public void setFactorGasto(float factorGasto) {
        this.factorGasto = factorGasto;
    }

    public float getDeslizamiento() {
        return deslizamiento;
    }

    public void setDeslizamiento(float deslizamiento) {
        this.deslizamiento = deslizamiento;
    }

    public float getFactorComision() {
        return factorComision;
    }

    public void setFactorComision(float factorComision) {
        this.factorComision = factorComision;
    }
}
