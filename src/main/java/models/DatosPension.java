package models;

public class DatosPension {

    private String fechaNacimiento;
    private String semanasCotizadas;
    private String saldoCai;
    private String salarioBasico;
    private String fechaPrimeraSolicitud;
    private String genero;
    private String edad;
    private String valorPension;
    private String ibl;
    private String mesada;
    private String mesadaColpensiones;
    private String parentescoBeneficiario;
    private String fechaNacimientoBeneficiario;
    private String generoBeneficiario;
    private String mesadaModalidadDos;
    private String bono;
    private String fechaCuentaIndividual;
    private String fidelidadPersonalizada;
    private String fidelidadPropia;
    private String valorAportesRPMNoBono;

    public static class Builder{

        private String fechaNacimiento;
        private String semanasCotizadas;
        private String saldoCai;
        private String salarioBasico;
        private String fechaPrimeraSolicitud;
        private String genero;
        private String edad;
        private String valorPension;
        private String ibl;
        private String mesada;
        private String mesadaColpensiones;
        private String parentescoBeneficiario;
        private String fechaNacimientoBeneficiario;
        private String generoBeneficiario;
        private String mesadaModalidadDos;
        private String bono;
        private String fechaCuentaIndividual;
        private String fidelidadPersonalizada;
        private String fidelidadPropia;
        private String valorAportesRPMNoBono;

        public Builder(String fechaNacimiento){
            this.fechaNacimiento = fechaNacimiento;
        }

        public Builder conSemanasCotizadas(String semanasCotizadas){
            this.semanasCotizadas = semanasCotizadas;
            return this;
        }

        public Builder conSaldoCai(String saldoCai){
            this.saldoCai = saldoCai;
            return this;
        }

        public Builder conSalarioBasico(String salarioBasico){
            this.salarioBasico = salarioBasico;
            return this;
        }

        public Builder conFechaPrimeraSolicitud(String fechaPrimeraSolicitud){
            this.fechaPrimeraSolicitud = fechaPrimeraSolicitud;
            return this;
        }

        public Builder conGenero(String genero){
            this.genero = genero;
            return this;
        }

        public Builder conEdad(String edad){
            this.edad = edad;
            return this;
        }

        public Builder conValorPension(String valorPension){
            this.valorPension = valorPension;
            return this;
        }

        public Builder conIbl(String ibl){
            this.ibl = ibl;
            return this;
        }

        public Builder conMesada(String mesada){
            this.mesada = mesada;
            return this;
        }

        public Builder conMesadaColpensiones(String mesadaColpensiones){
            this.mesadaColpensiones = mesadaColpensiones;
            return this;
        }

        public Builder conParentescoBeneficiario(String parentescoBeneficiario){
            this.parentescoBeneficiario = parentescoBeneficiario;
            return this;
        }

        public Builder conFechaNacimientoBeneficiario(String fechaNacimientoBeneficiario){
            this.fechaNacimientoBeneficiario = fechaNacimientoBeneficiario;
            return this;
        }

        public Builder conGeneroBeneficiario(String generoBeneficiario){
            this.generoBeneficiario = generoBeneficiario;
            return this;
        }

        public Builder conMesadaModalidadDos(String mesadaModalidadDos){
            this.mesadaModalidadDos = mesadaModalidadDos;
            return this;
        }

        public Builder conBono(String bono){
            this.bono = bono;
            return this;
        }

        public Builder conFechaCuentaIndividual(String fechaCuentaIndividual){
            this.fechaCuentaIndividual = fechaCuentaIndividual;
            return this;
        }

        public Builder conFidelidadPersonalizada(String fidelidadPersonalizada){
            this.fidelidadPersonalizada = fidelidadPersonalizada;
            return this;
        }

        public Builder conFidelidadPropia(String fidelidadPropia){
            this.fidelidadPropia = fidelidadPropia;
            return this;
        }

        public Builder conValorAportesRPMNoBono(String valorAportesRPMNoBono){
            this.valorAportesRPMNoBono = valorAportesRPMNoBono;
            return this;
        }

        public DatosPension build(){
            DatosPension datosPension = new DatosPension();
            datosPension.fechaNacimiento = this.fechaNacimiento;
            datosPension.semanasCotizadas = this.semanasCotizadas;
            datosPension.saldoCai = this.saldoCai;
            datosPension.salarioBasico = this.salarioBasico;
            datosPension.fechaPrimeraSolicitud = this.fechaPrimeraSolicitud;
            datosPension.genero = this.genero;
            datosPension.edad = this.edad;
            datosPension.valorPension = this.valorPension;
            datosPension.ibl = this.ibl;
            datosPension.mesada = this.mesada;
            datosPension.mesadaColpensiones = this.mesadaColpensiones;
            datosPension.parentescoBeneficiario = this.parentescoBeneficiario;
            datosPension.fechaNacimientoBeneficiario = this.fechaNacimientoBeneficiario;
            datosPension.generoBeneficiario = this.generoBeneficiario;
            datosPension.mesadaModalidadDos = this.mesadaModalidadDos;
            datosPension.bono = this.bono;
            datosPension.fechaCuentaIndividual = this.fechaCuentaIndividual;
            datosPension.fidelidadPersonalizada = this.fidelidadPersonalizada;
            datosPension.fidelidadPropia = this.fidelidadPropia;
            datosPension.valorAportesRPMNoBono = this.valorAportesRPMNoBono;

            return datosPension;
        }
    }

    private DatosPension(){
    }





    /*
    public DatosPension(String valorPension, String mesada, String fidelidadPropia, int var) {
        this.valorPension = valorPension;
        this.mesada = mesada;
        this.fidelidadPropia = fidelidadPropia;
    }

    public DatosPension(String fechaNacimiento, String semanasCotizadas, String saldoCai, String salarioBasico, String fechaPrimeraSolicitud,
                        String genero, String edad, String valorPension, String mesadaModalidadDos, String bono, String fechaCuentaIndividual) {
        this.fechaNacimiento = fechaNacimiento;
        this.semanasCotizadas = semanasCotizadas;
        this.saldoCai = saldoCai;
        this.salarioBasico = salarioBasico;
        this.fechaPrimeraSolicitud = fechaPrimeraSolicitud;
        this.genero = genero;
        this.edad = edad;
        this.valorPension = valorPension;
        this.mesadaModalidadDos = mesadaModalidadDos;
        this.bono = bono;
        this.fechaCuentaIndividual = fechaCuentaIndividual;
    }

    public DatosPension(String fechaNacimiento, String semanasCotizadas, String saldoCai, String salarioBasico, String fechaPrimeraSolicitud,
                        String genero, String edad, String valorPension, String mesadaModalidadDos, String bono, String fechaCuentaIndividual, String valorAportesRPMNoBono) {
        this.fechaNacimiento = fechaNacimiento;
        this.semanasCotizadas = semanasCotizadas;
        this.saldoCai = saldoCai;
        this.salarioBasico = salarioBasico;
        this.fechaPrimeraSolicitud = fechaPrimeraSolicitud;
        this.genero = genero;
        this.edad = edad;
        this.valorPension = valorPension;
        this.mesadaModalidadDos = mesadaModalidadDos;
        this.bono = bono;
        this.fechaCuentaIndividual = fechaCuentaIndividual;
        this.valorAportesRPMNoBono = valorAportesRPMNoBono;
    }

    public DatosPension(String fechaNacimiento, String semanasCotizadas, String saldoCai, String salarioBasico, String fechaPrimeraSolicitud,
                        String genero, String edad, String valorPension, String mesada, String parentescoBeneficiario, String fechaNacimientoBeneficiario,
                        String generoBeneficiario, String fechaCuentaIndividual) {
        this.fechaNacimiento = fechaNacimiento;
        this.semanasCotizadas = semanasCotizadas;
        this.saldoCai = saldoCai;
        this.salarioBasico = salarioBasico;
        this.fechaPrimeraSolicitud = fechaPrimeraSolicitud;
        this.genero = genero;
        this.edad = edad;
        this.valorPension = valorPension;
        this.mesada = mesada;
        this.parentescoBeneficiario = parentescoBeneficiario;
        this.fechaNacimientoBeneficiario = fechaNacimientoBeneficiario;
        this.generoBeneficiario = generoBeneficiario;
        this.fechaCuentaIndividual = fechaCuentaIndividual;
    }

     */

    public String getMedasaModalidadDos() {
        return mesadaModalidadDos;
    }

    public String getMesadaModalidadDosNumero () {
        mesadaModalidadDos = mesadaModalidadDos.replace("$", "").replace(".", "").split(",")[0];
        return mesadaModalidadDos;
    }

    public void setMedasaModalidadDos(String medasaModalidadDos) {
        this.mesadaModalidadDos = medasaModalidadDos;
    }

    public String getBono() {
        return bono;
    }

    public void setBono(String bono) {
        this.bono = bono;
    }

    public String getParentescoBeneficiario() {
        parentescoBeneficiario = parentescoBeneficiario.replace("HIJO(A)", "Hijo");
        return parentescoBeneficiario;
    }

    public void setParentescoBeneficiario(String parentescoBeneficiario) {
        this.parentescoBeneficiario = parentescoBeneficiario;
    }

    public String getFechaNacimientoBeneficiario() {
        return fechaNacimientoBeneficiario;
    }

    public void setFechaNacimientoBeneficiario(String fechaNacimientoBeneficiario) {
        this.fechaNacimientoBeneficiario = fechaNacimientoBeneficiario;
    }

    public String getGeneroBeneficiario() {
        generoBeneficiario = generoBeneficiario.replace("EMENINO", "").replace("ASCULINO", "");
        return generoBeneficiario;
    }

    public void setGeneroBeneficiario(String generoBeneficiario) {
        this.generoBeneficiario = generoBeneficiario;
    }

    public String getMesada2() {
        mesada = mesada.replace("$", "").replace(".", "").replace("(", "").replace(")", "")
                .replace("N/A", "#N/A").split(",")[0].split(" ")[1];
        return mesada;
    }

    public String getMesada() {
        mesada = mesada.replace("$", "").replace(".", "").replace("(", "").replace(")", "")
                .replace("N/A", "#N/A");
        return mesada;
    }

    public String getMesada3() {
        if (mesada.indexOf("GPM") > 0){
            return "GPM";
        }
        return mesada.replace("$", "").replace(".", "").replace("(", "").replace(")", "")
                .replace("N/A", "#N/A");
    }

    public void setMesada(String mesada) {
        this.mesada = mesada;
    }

    public String getMesadaColpensiones() {
        mesadaColpensiones = mesadaColpensiones.replace("$", "").replace(".", "").split(",")[0];
        return mesadaColpensiones;
    }

    public void setMesadaColpensiones(String mesadaColpensiones) {
        this.mesadaColpensiones = mesadaColpensiones;
    }

    public Double getMesadaColpensionesNumero() {
        mesadaColpensiones = mesadaColpensiones.replace("$", "").replace(".", "").replace(",", "");
        return Double.parseDouble(mesadaColpensiones);
    }

    public String getValorPension() {
        return valorPension;
    }

    public Double getValorPensionNumero() {
        valorPension = valorPension.replace("$", "").replace(".", "");
        return Double.parseDouble(valorPension);
    }

    public Double getBonoNumero () {
        bono = bono.replace("$", "").replace(".", "").split(",")[0];
        return Double.parseDouble(bono);
    }

    public void setValorPension(String valorPension) {
        this.valorPension = valorPension;
    }

        public void setIbl (String ibl){
            this.ibl = ibl;
        }

        public String getEdad () {
            return edad;
        }

        public void setEdad (String edad){
            this.edad = edad;
        }


        public String getFechaNacimiento () {
            return fechaNacimiento;
        }

        public void setFechaNacimiento (String fechaNacimiento){
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getSemanasCotizadas () {
            return semanasCotizadas;
        }

        public void setSemanasCotizadas (String semanasCotizadas){
            this.semanasCotizadas = semanasCotizadas;
        }

        public String getSaldoCai () {
            return saldoCai;
        }

        public Double getSaldoCaiNumero () {
            saldoCai = saldoCai.replace("$", "").replace(".", "");
            return Double.parseDouble(saldoCai);
        }


        public String getIbl () {
            return ibl;
        }

        public Double getIblNumero () {
            ibl = ibl.replace("$", "").replace(".", "").split(",")[0];
            return Double.parseDouble(ibl);
        }

        public Double getSemanasCotizadasNumero () {
            return Double.parseDouble(semanasCotizadas);
        }

        public Double getSalarioBasicoNumero () {
            salarioBasico = salarioBasico.replace("$", "").replace(".", "");
            return Double.parseDouble(salarioBasico);
        }

        public int getEdadNumero () {
            return Integer.parseInt(edad);
        }


        public void setSaldoCai (String saldoCai){
            this.saldoCai = saldoCai;
        }

        public String getSalarioBasico () {
            return salarioBasico;
        }

        public void setSalarioBasico (String salarioBasico){
            this.salarioBasico = salarioBasico;
        }

        public String getFechaPrimeraSolicitud () {
            return fechaPrimeraSolicitud;
        }

        public void setFechaPrimeraSolicitud (String fechaPrimeraSolicitud){
            this.fechaPrimeraSolicitud = fechaPrimeraSolicitud;
        }

        public String getGenero () {
            genero = genero.replace("emenino", "").replace("asculino", "");
            return genero;
        }

        public void setGenero (String genero){
            this.genero = genero;
        }

    public String getMesadaModalidadDos() {
        return mesadaModalidadDos;
    }

    public void setMesadaModalidadDos(String mesadaModalidadDos) {
        this.mesadaModalidadDos = mesadaModalidadDos;
    }

    public String getFechaCuentaIndividual() {
        return fechaCuentaIndividual;
    }

    public void setFechaCuentaIndividual(String fechaCuentaIndividual) {
        this.fechaCuentaIndividual = fechaCuentaIndividual;
    }

    public String getFidelidadPersonalizada() {
        fidelidadPersonalizada = fidelidadPersonalizada.replace(".", "," ).replace("%", "" ).split("")[0];
        return fidelidadPersonalizada + "%";

    }

    public String getFidelidadPersonalizada2() {
        fidelidadPersonalizada = fidelidadPersonalizada.replace(".", "," ).replace("%", "" );
        return fidelidadPersonalizada + "%";

    }

    public String getFidelidadPersonalizadaColpensiones() {
        fidelidadPersonalizada = fidelidadPersonalizada.replace(".", "," );
        return fidelidadPersonalizada + "%";

    }

    public void setFidelidadPersonalizada(String fidelidadPersonalizada) {
        this.fidelidadPersonalizada = fidelidadPersonalizada;
    }

    public String getFidelidadPropia() {
        fidelidadPropia = fidelidadPropia.replace(".", "," ).split(" ")[4];
        return fidelidadPropia;
    }

    public String getFidelidadPropia2() {
        fidelidadPropia = fidelidadPropia.replace(".", "," ).split(" ")[5];
        return fidelidadPropia;
    }

    public String getValorAportesRPMNoBono() {
        return valorAportesRPMNoBono;
    }

    public void setValorAportesRPMNoBono(String valorAportesRPMNoBono) {
        this.valorAportesRPMNoBono = valorAportesRPMNoBono;
    }

    public String getValorAportesRPMNoBonoNumero () {
        valorAportesRPMNoBono = valorAportesRPMNoBono.replace("$", "").replace(".", "").split(",")[0];
        return valorAportesRPMNoBono;
    }

    public void setFidelidadPropia(String fidelidadPropia) {
        this.fidelidadPropia = fidelidadPropia;
    }
}
