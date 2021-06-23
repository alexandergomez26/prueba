# language: es
Característica: Como asesor de Protección deseo ingresar a pensión invalidez y sobrevivencia,
  para ingresar a partir de una edad definida



  @IngresoApartirEdadDefinidaClActualMujer ##
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |2|



  @IngresoAPartirEdadDefinidaClActualHombre
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|


  @BonoModalidad2 ##  Error edad
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @BonoModalidad1  ## Error edad, no error fecha
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @RPMNoBono  ## Error fecha
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y ingresa a RPM no bono <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @IngresoEdadDefinidaClActualBeneficiario ## Error edad
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente actual exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @IngresoEdadDefinidaClPotencial  ##
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @IngresoAPartirEdadDefinidaClPotencialIngresoAntes ##
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @IngresoEdadDefinidaClPotencialBonoEmitido
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|


  @IngresoEdadDefinidaClPotencialBeneficiario
  Esquema del escenario: Ingresar a pension invalidez y luego a partir de una edad definida en cliente potencial exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y por cliente ingresa en pension invalidez a partir de la edad definida <testCase>
    Entonces puede visualizar el texto Resultados de pensión en retiro programado a una edad definida

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

    
