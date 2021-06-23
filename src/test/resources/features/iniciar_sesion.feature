# language: es
Característica: Como asesor de Protección deseo iniciar sesión en el aplicativo

  @LoginExitoso
  Escenario: Iniciar sesion exitoso
    Dado que el usuario se encuentre en la pagina de ASPEN
    Cuando ingrese sus credenciales
      | casoDePrueba |
      | 1            |
    Entonces visualiza el texto de Bienvenidos

  @LoginCorreoErrado
  Escenario: Iniciar sesion con correo errado
    Dado que el usuario se encuentre en la pagina de ASPEN
    Cuando ingrese el correo de forma errada
      | casoDePrueba |
      | 2            |
    Entonces visualiza un mensaje de Escriba una dirección de correo electrónico, un número de teléfono o un nombre Skype válidos.


  @ContraseniaErrada
  Escenario: Iniciar sesion con contrasenia errada
    Dado que el usuario se encuentre en la pagina de ASPEN
    Cuando ingrese la contrasenia de forma errada
      | casoDePrueba |
      | 3            |
    Entonces visualiza el mensaje Su cuenta o contraseña no es correcta. Si no recuerda su contraseña, puede restablecerla ahora.

  @LoginCorreoVacio
  Escenario: Iniciar sesion con compo correo vacio
    Dado que el usuario se encuentre en la pagina de ASPEN
    Cuando Deje el campo correo vacio
      | casoDePrueba |
      | 4            |
    Entonces visualiza el siguiente mensaje Escriba una dirección de correo electrónico, un número de teléfono o un nombre Skype válidos.

  @LoginContraseniaVacia
  Escenario: Iniciar sesion con campo contrasenia vacio
    Dado que el usuario se encuentre en la pagina de ASPEN
    Cuando Deje el campo contrasenia vacio
      | casoDePrueba |
      | 5            |
    Entonces visualiza el siguiente texto Escriba su contraseña.

