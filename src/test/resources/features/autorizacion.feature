# language: es
Característica: Como asesor de Protección deseo visualizar los módulos de Proyecciones Pensionales
                y Cálculos Pensionales

  @Autorizacion
  Esquema del escenario: Autorizacion exitosa
    Dado que el usuario se encuentre logueado en la pagina de ASPEN <testCase>
    Cuando selecciona la opcion Transacciones
    Entonces visualiza los siguientes textos Proyecciones Pensionales , Cliente Actual , Cliente Potencial , Cálculos Masivos , Administrador del sistema

    Ejemplos:
      | testCase |
      |1|
      |2|
      |3|
