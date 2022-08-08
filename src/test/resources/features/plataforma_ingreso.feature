# language: es
Característica: Como candidato a Pragma deseo ingresar a la plataforma de Ingreso

  @hackerrank
  Esquema del escenario: Ingresar a la Etapa Hackerrank
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa a la etapa Hackerrank <testCase>
    Entonces puede ver el mensaje ¡Finalizado!
    Ejemplos:
      | testCase |
      |1|

  @testPsicometrico
  Esquema del escenario: Ingresar a la Etapa test psicometrico
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa a la etapa test psicometrico <testCase>
    Entonces puede ver el mensaje ¡Finalizado!
    Ejemplos:
      | testCase |
      |1|

  @testGrit
  Esquema del escenario: Ingresar a la Etapa Test Grit
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa a la etapa Test Grit <testCase>
    Entonces puede ver el mensaje ¡Finalizado!
    Ejemplos:
      | testCase |
      |1|

  @notificaciones
  Esquema del escenario: Ingresar al Modulo Notificaciones
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa al modulo notificaciones <testCase>
    Entonces se podra ver el mensaje en la pantalla Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @ayuda
  Esquema del escenario: Ingresar al Modulo Ayuda
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa al modulo de ayuda <testCase>
    Entonces se podra ver la modal Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @perfil
  Esquema del escenario: Ingresar al Modulo Perfil
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa al modulo perfil <testCase>
    Entonces se podra ver el mensaje de creacion Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @ensayo
  Esquema del escenario: Ingresar a la Etapa Ensayo
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa a la etapa ensayo <testCase>
    Entonces se visualizara la modal Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @desarrolladorFullStack
  Esquema del escenario: Ingresar al perfil Desarrollador FullStack
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando desee visualizar el perfil de desarrollador fullstack <testCase>
    Entonces se vera el resultado del filtro con el nombre Desarrollador FullStack Java

    Ejemplos:
      | testCase |
      |1|

  @entrevistaPsicologica
  Esquema del escenario: Ingresar a la Etapa Entrevista Psicologica
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa a la etapa entrevista psicologica <testCase>
    Entonces se podra ver el mensaje en la pantalla Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @esperarPropuesta
  Esquema del escenario: Ingresar a la Etapa Esperar Propuesta
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa a la etapa esperar propuesta <testCase>
    Entonces se podra ver el mensaje en la pantalla Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @visitaDomiciliaria
  Esquema del escenario: Ingresar a la Etapa Visita Domiciliaria
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando ingresa a la etapa visita domiciliaria <testCase>
    Entonces se podra ver el mensaje en la pantalla Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @cerrarSesion
  Esquema del escenario: Cerrar sesion exitosamente
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando el candidato cierre la sesion en la plataforma <testCase>
    Entonces se podra ver el mensaje en la pantalla Somos pilotos

    Ejemplos:
      | testCase |
      |1|

  @informacionPostulacion
  Esquema del escenario: Ingresar al perfil Desarrollador FullStack
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando desee consultar la información relacionada con la postulación <testCase>
    Entonces  vera la información relacionada con la postulacion Estás en camino a ser nuestro Desarrollador FullStack Java

    Ejemplos:
      | testCase |
      |1|

  @listarEtapasCandidato
  Esquema del escenario: Listar las etapas del candidato
    Dado que el candidato se encuentre logueado en la plataforma de ingreso <testCase>
    Cuando desee visualizar todas las etapas de la postulacion <testCase>
    Entonces vera todas las etapas de la postulacion Hackerrank, Test Psicométrico, Test Grit, Ensayo, Entrevista Psicológica, Entrevista Técnica

    Ejemplos:
      | testCase |
      |1|
