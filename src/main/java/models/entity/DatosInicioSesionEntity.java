package models.entity;

import models.DatosInicioSesion;

public class DatosInicioSesionEntity {
    private static DatosInicioSesion datosInicioSesion;


    public static DatosInicioSesion getDatosInicioSesion() {
        return datosInicioSesion;
    }

    public static void setDatosInicioSesion(DatosInicioSesion datosInicioSesion) {
        DatosInicioSesionEntity.datosInicioSesion = datosInicioSesion;
    }
}
