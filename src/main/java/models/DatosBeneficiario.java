package models;

public class DatosBeneficiario {

    private String fechaNacimientoBeneficiario;
    private String parentescoBeneficiario;
    private String generoBeneficiario;

    public DatosBeneficiario(String fechaNacimientoBeneficiario, String parentescoBeneficiario, String generoBeneficiario) {
        this.fechaNacimientoBeneficiario = fechaNacimientoBeneficiario;
        this.parentescoBeneficiario = parentescoBeneficiario;
        this.generoBeneficiario = generoBeneficiario;
    }

    public String getGeneroBeneficiario() {
        return generoBeneficiario;
    }

    public void setGeneroBeneficiario(String generoBeneficiario) {
        this.generoBeneficiario = generoBeneficiario;
    }

    public String getFechaNacimientoBeneficiario() {
        return fechaNacimientoBeneficiario;
    }

    public void setFechaNacimientoBeneficiario(String fechaNacimientoBeneficiario) {
        this.fechaNacimientoBeneficiario = fechaNacimientoBeneficiario;
    }

    public String getParentescoBeneficiario() {
        return parentescoBeneficiario;
    }

    public void setParentescoBeneficiario(String parentescoBeneficiario) {
        this.parentescoBeneficiario = parentescoBeneficiario;
    }
}
