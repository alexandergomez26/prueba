# language: es
Característica: Como asesor de Protección deseo seleccionar la opcion tipo de calculo pension meta y plan de ahorro


  @metaB
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|



  @meta2b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos de hombres existentes en cliente actual <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|


  @meta3b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y selecciona ingreso a la vida laboral antes de junio 30/92 <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @meta4b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y selecciona ingreso a la vida laboral despues de junio 30/92 <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @meta5b  ## Error fecha
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Y ingresa a RPM no bono <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @meta6b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando registra un beneficiario <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @meta7b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @meta8b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|

  @meta9b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa datos de cliente potencial con bono emitido <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|


  @meta10b
  Esquema del escenario: Ingresar a pension meta y plan de ahorro exitosamente
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos del cliente potencial con beneficiario <testCase>
    Y selecciona la opcion pension meta y plan de ahorro
    Y ingresa los datos en plan retiro <testCase>
    Entonces puede visualizar su resultado

    Ejemplos:
      | testCase  |
      |1|
      |2|
      |5|
      |7|
      |8|
      |9|
      |10|


