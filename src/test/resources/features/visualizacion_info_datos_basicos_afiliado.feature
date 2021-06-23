# language: es
Característica: Como asesor de Protección deseo visualizar los campos de los datos basicos de la cuenta

  @VisualizacionDatosBasicos
  Esquema del escenario: Visualizacion datos basicos del afiliado
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Entonces visualiza los siguientes campos Tipo documento , Número documento , Nombre , Fecha de nacimiento , Género

    Ejemplos:
      | testCase     |
      |1|

  @VisualizacionDatosBasicosBeneficiario1
   Esquema del escenario: Visualizacion datos basicos beneficiario 1 del afiliado
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Entonces Visualiza los campos del primer beneficiario

    Ejemplos:
      | testCase     |
      |1|

  @VisualizacionDatosBasicosBeneficiario2
  Esquema del escenario: Visualizacion datos basicos beneficiario 2 del afiliado
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Entonces Visualiza los campos del segundo beneficiario

    Ejemplos:
      | testCase     |
      |1|