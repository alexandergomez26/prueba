# language: es
Característica: Como asesor de Protección deseo seleccionar la opción tipo de cálculo pensión anticipada

  @SeleccionPensionVejezClActual
  Esquema del escenario: Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos existentes en cliente actual <testCase>
    Y selecciona la opcion pension vejez <testCase>
    Entonces visualiza el texto Resultados de pensión en retiro programado a una edad definida


    Ejemplos:
      | testCase |
      |1|


  @SeleccionPensionVejezClPotencial
  Esquema del escenario: : Seleccion tipo de calculo pension anticipada cliente actual
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando ingresa datos no existentes en cliente potencial <testCase>
    Y ingresa los datos de cliente potencial <testCase>
    Y cliente potencial selecciona la opcion pension vejez
    Entonces cliente potencial visualiza el texto Cálculo de Pensión Anticipada

    Ejemplos:
      | testCase |
      |3|

