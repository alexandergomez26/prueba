# language: es
Característica: Como asesor de Proteccion deseo ingresar a partir de una edad definida

  @IngresoAPartirEdadDefinidaClActualMujer
  Esquema del escenario: Ingresar a partir de una edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de mujeres existentes en cliente actual <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |7|

  @IngresoAPartirEdadDefinidaClActualHombre
  Esquema del escenario: Ingresar A partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |20|

  @BonoModalidad2Mujer
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad a partir de edad definida <testCase>
    #Y por cliente actual con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |10|

  @BonoModalidad2Hombre
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad a partir de edad definida <testCase>
    #Y por cliente actual con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |20|


  @BonoModalidad1Mujer
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad a partir de edad definida <testCase>
    #Y por cliente actual con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |10|

  @BonoModalidad1Hombre
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad a partir de edad definida <testCase>
   # Y por cliente actual con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |20|


  @RPMNoBonoMujer
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado
    Ejemplos:
      | testCase |
      |2|

  @RPMNoBonoHombre
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado
    Ejemplos:
      | testCase |
      |20|

  @IngresoEdadDefinidaClActualBeneficiario
  Esquema del escenario: Ingresar A partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y por cliente actual despues de ingresar beneficiario ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |2|

  @IngresoAPartirEdadDefinidaClPotencialDespues
  Esquema del escenario: Ingresar A partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |3|

  @IngresoAPartirEdadDefinidaClPotencialIngresoAntes
  Esquema del escenario: Ingresar A partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |9|

  @IngresoAPartirEdadDefinidaClPotencialBonoEmitido
  Esquema del escenario: Ingresar A partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |14|


  @IngresoAPartirEdadDefinidaClPotencialBeneficiario
  Esquema del escenario: Ingresar A partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y por cliente actual despues de ingresar beneficiario ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |3|


  @IngresoAPartirEdadDefinidaClActualBonoEmitido
  Esquema del escenario: Ingresar a partir de una edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono emitido en cliente actual <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |38|


  @IngresoAPartirEdadDefinidaClActualBonoRedimido
  Esquema del escenario: Ingresar a partir de una edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono redimido en cliente actual <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |5|


  @IngresoAPartirEdadDefinidaClActualBonoEnCustodia
  Esquema del escenario: Ingresar a partir de una edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono en custodia en cliente actual <testCase>
    Y por cliente actual ingresa la edad a partir de edad definida <testCase>
    #Y por cliente actual con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |69|









