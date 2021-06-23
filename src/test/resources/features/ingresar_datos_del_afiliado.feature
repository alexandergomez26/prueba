# language: es
Característica: Como asesor de Protección deseo ingresar los datos del afiliado

  @IngDatosAfiClienteActual
  Esquema del escenario: Ingresar datos del afiliado Cliente Actual de manera exitosa
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Entonces se visualiza el texto Datos básicos importantes para la proyección

    Ejemplos:
      | testCase |
      | 1        |
      | 2        |
      | 3        |
      | 4        |
      | 5        |
      | 6        |
      | 7        |
      | 8        |
      | 9        |
      | 10       |
      | 11       |
      | 12       |
      | 13       |
      | 14       |
      | 15       |
      | 16       |
      | 17       |
      | 18       |
      | 19       |
      | 20       |
      | 21       |
      | 22       |
      | 23       |
      | 24       |
      | 25       |
      | 26       |
      | 27       |
      | 28       |
      | 29       |
      | 30       |
      | 31       |
      | 32       |
      | 33       |
      | 34       |
      | 35       |
      | 36       |
      | 37       |
      | 38       |
      | 39       |
      | 40       |
      | 41       |
      | 42       |
      | 43       |
      | 44       |
      | 45       |
      | 46       |
      | 47       |
      | 48       |
      | 49       |
      | 50       |
      | 51       |
      | 52       |
      | 53       |
      | 54       |
      | 55       |
      | 56       |
      | 57       |
      | 58       |
      | 59       |
      | 60       |
      | 61       |
      | 62       |
      | 63       |
      | 64       |
      | 65       |
      | 66       |
      | 67       |
      | 68       |
      | 69       |
      | 70       |
      | 71       |
      | 72       |
      | 73       |

  @IngDatosAfiClientePotencial
  Esquema del escenario: Ingresar datos del afiliado Cliente Potencial de manera exitosa
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Entonces se visualiza el siguiente texto Datos básicos importantes para la proyección

    Ejemplos:
      | testCase |
      | 1        |
      | 2        |
      | 3        |
      | 4        |
      | 5        |
      | 6        |
      | 7        |
      | 8        |
      | 9        |
      | 10       |

  @IngDatosAfiNoExistenteClienteActual
  Escenario: Ingresar datos no existente del afiliado Cliente Potencial
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
      | correo                       | contrasenia    |
      | jenprgcxn1@proteccion.com.co | P97xr4Gw20.M43 |
    Cuando ingresa datos no existentes en cliente actual
      | numeroDocumento |
      | 7777777777      |
    Entonces visualiza la validacion Se presentó un error mientras se ejecutaba una operación. Usuario no encontrado en la base de datos, utilice la opción Cliente Potencial.

  @IngDatosAfiClActualCampoNumDocVacio
  Escenario: Ingresar datos del afiliado Cliente Actual de manera exitosa
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
      | correo                       | contrasenia    |
      | jenprgcxn1@proteccion.com.co | P97xr4Gw20.M43 |
    Cuando deja el campo numero de documento vacio
      | numeroDocumento |
      |                 |
    Entonces se visualiza el mensaje Ingresa un documento válido.

  @IngDatosAfiExistenteClientePotencial
  Escenario: Ingresar datos existente en Cliente Potencial
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
      | correo                       | contrasenia    |
      | jenprgcxn1@proteccion.com.co | P97xr4Gw20.M43 |
    Cuando ingresa datos existentes en cliente potencial
      | numeroDocumento |
      | 60314195        |
    Entonces se visualiza la validacion Se presentó un error mientras se ejecutaba una operación. Usuario encontrado en la base de datos, utilice la opción Cliente Actual.

  @IngDatosAfiClPotencialCampoNumDocVacio
  Escenario: Ingresar datos del afiliado Cliente Actual de manera exitosa
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
      | correo                       | contrasenia    |
      | jenprgcxn1@proteccion.com.co | P97xr4Gw20.M43 |
    Cuando deja el campo numero de documento vacio en cliente potencial
      | numeroDocumento |
      |                 |
    Entonces se visualiza el siguiente mensaje Ingresa un documento válido.

