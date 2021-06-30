package userinterfaces;

public enum SeleccionarUrlPage {

    ASPEN("https://calculospensionalesfront.pruebas.proteccion.com.co:1007/");

    private final String url;

    SeleccionarUrlPage(String url){
        this.url = url;
    }

    public String url(){
        return url;
    }
}
