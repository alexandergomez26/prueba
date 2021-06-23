package userinterfaces;

public enum SeleccionarUrlPage {

    ASPEN("https://d3vgfwgx6foikl.cloudfront.net/inicio/"),
    ASPEN_DOBLE_ASESORIA("https://calculospensionalesfront.pruebas.proteccion.com.co:1007/inicio/doble-asesoria");

    private final String url;

    SeleccionarUrlPage(String url) {
        this.url = url;
    }

    public String url(){
        return url;
    }
}
