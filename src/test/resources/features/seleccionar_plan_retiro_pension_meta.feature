# language: es
Característica: Como asesor de Proteccion deseo seleccionar la opcion tipo de calculo pension meta


  @metaMujeres
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de mujeres existentes en cliente actual <testCase>
    Y selecciona la opcion pension meta
    Y ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |7|

  @metaHombres
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y selecciona la opcion pension meta
    Y ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |28|

  @metaBonoModalidad2Mujer
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y selecciona la opcion pension meta
    Y despues de seleccionar la modalidad bono ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |13|

  @metaBonoModalidad2Hombre
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y selecciona la opcion pension meta
    Y despues de seleccionar la modalidad bono ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |28|


  @metaBonoModalidad1Mujer
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y selecciona la opcion pension meta
    Y despues de seleccionar la modalidad bono ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |13|

  @metaBonoModalidad1Hombre
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y selecciona la opcion pension meta
    Y despues de seleccionar la modalidad bono ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |20|


  @metaRPMNoBonoMujer
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y selecciona la opcion pension meta
    Y ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |7|

  @metaRPMNoBonoHombre
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y selecciona la opcion pension meta
    Y ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |20|



  @metaBeneficiario
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y selecciona la opcion pension meta
    Y despues de ingresar el beneficiario ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |1|

  @metaIngresoDespues
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y selecciona la opcion pension meta
    Y ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase  |
      |1|

  @metaCLPotencialIngresoAntes
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y selecciona la opcion pension meta
    Y ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase  |
      |1|


  @metaCLPotencialBonoEmitido ##Error en la pagina, se presentó un error
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y selecciona la opcion pension meta
    Y ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase  |
      |5|

  @metaCPBeneficiario
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y selecciona la opcion pension meta
    Y despues de ingresar el beneficiario ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase  |
      |1|


  @metaBonoEmitido2
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono emitido en cliente actual <testCase>
    Y selecciona la opcion pension meta
    Y despues de seleccionar la modalidad bono ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |8|

  @metaBonoRedimido
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono redimido en cliente actual <testCase>
    Y selecciona la opcion pension meta
    Y despues de seleccionar la modalidad bono ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |5|

  @metaBonoCustodia
  Esquema del escenario: Ingresar a pension meta exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono en custodia en cliente actual <testCase>
    Y selecciona la opcion pension meta
    Y despues de seleccionar la modalidad bono ingresa los datos en pension meta <testCase>
    Entonces puede visualizar la respuesta de pension meta

    Ejemplos:
      | testCase |
      |13|

