package userinterfaces;

public enum SeleccionarUrlPage {

    PLATAFORMA_INGRESO("https://d30vbcfgen7dgz.cloudfront.net/login");

    private final String url;

    SeleccionarUrlPage(String url){
        this.url = url;
    }

    public String url(){
        return url;
    }
}
