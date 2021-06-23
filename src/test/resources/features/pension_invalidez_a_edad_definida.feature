# language: es
Característica: Como asesor de Protección deseo ingresar a pensión invalidez y sobrevivencia,
                para ingresar una edad definida

  @IngresoEdadDefinidaClActualMujer ##
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |2|



  @IngresoEdadDefinidaClActualHombre ##
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |2|


  @BonoModalidad2 ##
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |2|

  @BonoModalidad1  ## Error
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |2|

  @RPMNoBono ## Error
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y ingresa a RPM no bono <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |2|

  @IngresoEdadDefinidaClActualBeneficiario ##
  Esquema del escenario: IIngresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |2|

  @IngresoEdadDefinidaClPotencial  ##
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |2|

  @IngresoEdadDefinidaClPotencialIngresoAntes  ##
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |2|

  @IngresoEdadDefinidaClPotencialBonoEmitido ##
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |2|


  @IngresoEdadDefinidaClPotencialBeneficiario ##
  Esquema del escenario: Ingresar a pensión invalidez y luego a edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y por cliente ingresa en pensionn invalidez la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |2|





