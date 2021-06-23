# language: es
Característica: Como asesor de Protección deseo ingresar una edad definida

  @IngresoEdadDefinidaClActualMujer
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de mujeres existentes en cliente actual <testCase>
    Y por cliente actual ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase                  |
      |2|



  @IngresoEdadDefinidaClActualHombre
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y por cliente actual ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase                |
      |20|


  @BonoModalidad2Mujer
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad definida <testCase>
    Y por cliente con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |10|

  @BonoModalidad2Hombre
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad definida <testCase>
    Y por cliente con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |20|


  @BonoModalidad1Mujer
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad definida <testCase>
    Y por cliente con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |1|

  @BonoModalidad1Hombre
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y por cliente actual ingresa en modalidad bono la edad definida <testCase>
    Y por cliente con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |20|


  @RPMNoBonoMujer
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y por cliente actual ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado
    Ejemplos:
      | testCase |
      |2|

  @RPMNoBonoHombre
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y por cliente actual ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado
    Ejemplos:
      | testCase |
      |20|


  @IngresoEdadDefinidaClActualBeneficiario
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y por cliente actual luego de ingresar beneficiario ingresa la edad definida <testCase>
    Y por cliente con beneficiario modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |10|


  @IngresoEdadDefinidaClPotencialIngresoDespues
  Esquema del escenario: Ingresar edad definida cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y por cliente potencial ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado
    Ejemplos:
      | testCase  |
      |19|


  @IngresoEdadDefinidaClPotencialIngresoAntes
  Esquema del escenario: Ingresar edad definida cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y por cliente potencial ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado
    Ejemplos:
      | testCase  |
      |19|


  @IngresoEdadDefinidaClPotencialBonoEmitido
  Esquema del escenario: Ingresar edad definida cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y por cliente potencial ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |20|



  @IngresoEdadDefinidaClPotencialBeneficiario
  Esquema del escenario: Ingresar edad definida cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y por cliente potencial luego de ingresar beneficiario ingresa la edad definida <testCase>
    Y por cliente con beneficiario modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |1|

#########################################

  @IngresoEdadDefinidaClActualbonoEmitido
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono emitido en cliente actual <testCase>
    Y por cliente actual ingresa en modalidad bono la edad definida <testCase>
    Y por cliente con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |12|


  @IngresoEdadDefinidaClActualbonoRedimido
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono redimido en cliente actual <testCase>
    Y por cliente actual ingresa en modalidad bono la edad definida <testCase>
    Y por cliente con bono modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |46|

  @IngresoEdadDefinidaClActualbonoEnCustodia
  Esquema del escenario: Ingresar edad definida cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono en custodia en cliente actual <testCase>
    Y por cliente actual ingresa la edad definida <testCase>
    Y por cliente modifica la fidelidad <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |6|



