package models.entity;

import models.DatosAfiliado;

public class DatosAfiliadoEntity {
    private static DatosAfiliado datosAfiliado;

    public static DatosAfiliado getDatosAfiliado() {
        return datosAfiliado;
    }

    public static void setDatosAfiliado(DatosAfiliado datosAfiliado) {
        DatosAfiliadoEntity.datosAfiliado = datosAfiliado;
    }
}
