# language: es
Característica: Como asesor de Protección deseo seleccionar la opcion tipo de calculo asesoria general

  @SeleccionAsesoriaGeneralClActualMujer
  Esquema del escenario: Seleccion tipo de calculo Asesoria Pensional
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de mujeres existentes en cliente actual <testCase>
    Y selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |2|

  @SeleccionAsesoriaGeneralClActualHombre
  Esquema del escenario: Seleccion tipo de calculo Asesoria Pensional
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |20|


  @SeleccionAsesoriaGeneralClActualBonoModalidad2Mujer
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Cuando selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y selecciona con modalidad bono la opcion asesoria pensional  <testCase>
    Y por cliente con bono modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |2|

  @SeleccionAsesoriaGeneralClActualBonoModalidad2Hombre
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Cuando selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y selecciona con modalidad bono la opcion asesoria pensional  <testCase>
    Y por cliente con bono modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |3|

  @SeleccionAsesoriaGeneralClActualBonoModalidad1Mujer
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Cuando selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y selecciona con modalidad bono la opcion asesoria pensional  <testCase>
    Y por cliente con bono modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |7|

  @SeleccionAsesoriaGeneralClActualBonoModalidad1Hombre
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Cuando selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y selecciona con modalidad bono la opcion asesoria pensional  <testCase>
    Y por cliente con bono modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |3|


  @SeleccionAsesoriaGeneralClActualRPMNoBonoMujer
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Cuando ingresa a RPM no bono <testCase>
    Y selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |5|

  @SeleccionAsesoriaGeneralClActualRPMNoBonoHombre
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Cuando ingresa a RPM no bono <testCase>
    Y selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |3|


  @SeleccionAsesoriaGeneralClActualBeneficiario
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y despues de ingresar beneficiario selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |1|


  @SeleccionAsesoriaGeneralClPotencialIngresoDespues  ## Error
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y cliente potencial selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |10|


  @SeleccionAsesoriaGeneralClPotencialIngresoAntes
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y cliente potencial selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |1|


  @SeleccionAsesoriaGeneralClPotencialBonoEmitido
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y cliente potencial selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |1|


  @SeleccionAsesoriaGeneralClPotencialBeneficiario
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y despues de ingresar beneficiario selecciona la opcion asesoria pensional <testCase>
    Y por cliente modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |10|
 ###################################################################################

  @SeleccionAsesoriaGeneralClActualBonoEmitido
  Esquema del escenario: Seleccion tipo de calculo Asesoria Pensional
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono emitido en cliente actual <testCase>
    Y selecciona con modalidad bonos la opcion asesoria pensional  <testCase>
    Y por cliente con bonos modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |12|


  @SeleccionAsesoriaGeneralClActualBonoRedimido ## ERROR EN CEDULAS (Servicio)
  Esquema del escenario: Seleccion tipo de calculo Asesoria Pensional
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono redimido en cliente actual <testCase>
    Y selecciona con modalidad bonos la opcion asesoria pensional  <testCase>
    Y por cliente con bonos modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |2|

  @SeleccionAsesoriaGeneralClActualBonoEnCustodia ## Falla mesada al 100%
  Esquema del escenario: Seleccion tipo de calculo Asesoria Pensional
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono en custodia en cliente actual <testCase>
    Y selecciona con modalidad bonos la opcion asesoria pensional  <testCase>
    Y por cliente con bonos modifica su fidelidad <testCase>
    Entonces puede ver su resultado en asesoria pensional

    Ejemplos:
      | testCase |
      |6|
