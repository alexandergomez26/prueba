# language: es
Característica: Como asesor de Proteccion deseo seleccionar la opcion Proyecta tu pension en regimen de Prima Media

  @RPMClActualMujer
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
  Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
  Cuando ingresa datos de mujeres existentes en cliente actual <testCase>
  Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
  Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |2|



  @RPMClActualHombre
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |21|


  @RPMClActualBonoModalidad2Mujer
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |2|

  @RPMClActualBonoModalidad2Hombre
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |21|


  @RPMClActualBonoModalidad1Mujer
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |5|

  @RPMClActualBonoModalidad1Hombre
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |21|


  @RPMClActualRPMNoBonoMujer
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |7|

  @RPMClActualRPMNoBonoHombre
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres en cliente actual <testCase>
    Y ingresa a RPM no bono <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |21|


  @RPMClActualBeneficiario
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y ingresa un beneficiario selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente con beneficiario actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |5|


  @RPMClPotencial
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente potencial
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |1|


  @RPMClPotencialIngresoAntes
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente potencial
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |10|


  @RPMClPotencialBonoEmitido
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente potencial
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |1|


  @RPMClPotencialBeneficiario
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente potencial
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y ingresa un beneficiario selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente con beneficiario actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |10|


  @RPMClActualBonoEmitido
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono emitido en cliente actual <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |1|

  @RPMClActualBonoRedimido
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono redimido en cliente actual <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |1|

  @RPMClActualBonoCustodia
  Esquema del escenario: Seleccion tipo de proyeccion de pension en el Regimen de Prima Media en cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de afiliados con bono en custodia en cliente actual <testCase>
    Y selecciona la opcion pension en el Regimen de Prima Media <testCase>
    Y por cliente actualiza su fidelidad en Colpensiones <testCase>
    Entonces puede ver su resultado en regimen de prima media

    Ejemplos:
      | testCase |
      |1|





