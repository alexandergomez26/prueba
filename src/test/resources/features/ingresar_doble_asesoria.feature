# language: es
Característica: Como asesor de Protección deseo ingresar una edad definida

  @IngresoClActualDA
  Esquema del escenario: Ingresar en doble asesoria exitosamente
    Dado que el usuario este logueado en la pagina de ASPEN doble asesoria <testCase>
    Cuando ingresa datos existentes en doble asesoria cliente actual <testCase>
    Entonces puede visualizar su resultado en doble asesoria
    Ejemplos:

      | testCase |
      |1|


  @ClActualBeneficiarioDA
  Esquema del escenario: Ingresar cliente actual un beneficiario en doble asesoria exitosamente
    Dado que el usuario este logueado en la pagina de ASPEN doble asesoria <testCase>
    Cuando registra en doble asesoria un beneficiario <testCase>
    Entonces puede visualizar su resultado en doble asesoria

    Ejemplos:
      | testCase |
      |1|


  @ClPotencialDespuesDA
  Esquema del escenario: Ingresar Historia laboral antes de junio 30 en doble asesoria exitosamente
    Dado que el usuario este logueado en la pagina de ASPEN doble asesoria <testCase>
    Cuando ingresa en doble asesoria los datos basicos de cliente potencial <testCase>
    Entonces puede visualizar su resultado en doble asesoria
    Ejemplos:
      | testCase  |
      |1|


  @ClPotencialIngresoAntesDA
  Esquema del escenario: Ingresar Historia laboral despues de junio 30 en doble asesoria exitosamente
    Dado que el usuario este logueado en la pagina de ASPEN doble asesoria <testCase>
    Cuando ingresa en doble asesoria datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Entonces puede visualizar su resultado en doble asesoria
    Ejemplos:
      | testCase  |
      |1|


  @IngresoEdadDefinidaClPotencialBonoEmitido
  Esquema del escenario: Ingresar Historia laboral con bono emitido en doble asesoria exitosamente
    Dado que el usuario este logueado en la pagina de ASPEN doble asesoria <testCase>
    Cuando ingresa datos en doble asesoria del cliente potencial con bono emitido <testCase>
    Entonces puede visualizar su resultado en doble asesoria
    Ejemplos:
      | testCase  |
      |1|


  @IngresoEdadDefinidaClPotencialBeneficiario 
  Esquema del escenario: Ingresar cliente potencial un beneficiario en doble asesoria exitosamente
    Dado que el usuario este logueado en la pagina de ASPEN doble asesoria <testCase>
    Cuando ingresa en doble asesoria los datos del cliente potencial con beneficiario <testCase>
    Entonces puede visualizar su resultado en doble asesoria

    Ejemplos:
      | testCase  |
      |1|

