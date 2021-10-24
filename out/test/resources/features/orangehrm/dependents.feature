
Feature: Como usuario quiero ingresar al modulo Mi Info
  para agregar una nueva dependencia y un adjuntar un archivo.




  Background:nueva dependencia y un adjuntar un archivo
    Then se debe mostra el mensaje: Successfully Saved

  Scenario: Inicio sesion valido
    Given el usuario necesito ingresar al sistema OrangHRM
    When ingresa el usuario Admin, la contraseña admin123
    Then al dar click en el boton Login, debe ingresar al sistema


  Scenario Outline: Agregar nueva dependencia
    Given necesito agregar una nueva dependencia
    When doy clic en el boton add del area Assigned Dependents,diligencio todos los campos <name>,<dependents>,<birth>
    And doy clic sobre el boton save

    Examples:
      | name   | dependents | birth      |
      | Maria  | Child      | 2021-10-29 |
      | Tomas  | Child      | 2021-11-09 |


  Scenario Outline: Adjuntar archivo
    Given necesito agregar un nuevo archivo
    When doy clic en el boton add del area Assigned Attachments,adjunto el archivo <ruta>
    And diligencio el campo comment <comentario>, doy clic sobre el boton save

    Examples:
      | ruta                                                                                                                           | comentario          |
      | \\src\\test\\resources\\File\\Archivo_prueba_1.docx | Comentario prueba 1 |
      | \\src\\test\\resources\\File\\Archivo_prueba_2.docx | Comentario prueba 2 |