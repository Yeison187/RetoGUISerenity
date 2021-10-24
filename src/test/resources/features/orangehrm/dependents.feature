
Feature: Como usuario quiero ingresar al modulo Mi Info
  para agregar una nueva dependencia y un adjuntar un archivo.




  Background:nueva dependencia y adjuntar un archivo
    Then se debe mostra el mensaje: Successfully Saved


  Scenario Outline: Agregar nueva dependencia
    Given el usuario necesita agregar una nueva dependencia, inicia sesion el usuario Admin, la contraseña admin123
    When  da clic el boton add del area Assigned Dependents
    And diligencia los campos <name>,<relationship>,<birth>

    Examples:
      | name   | relationship | birth      |
      | Maria  | Child      | 2021-10-29 |
      | Tomas  | Child      | 2021-11-09 |


  Scenario Outline: Adjuntar archivo
    Given necesita agregar un nuevo archivo, da clic en el boton add del area Assigned Attachments
    When adjunto el archivo <ruta>, diligencio el campo comment <comentario>

    Examples:
      | ruta                                                                                                                           | comentario          |
      | \\src\\test\\resources\\File\\Archivo_prueba_1.docx | Comentario prueba 1 |
      | \\src\\test\\resources\\File\\Archivo_prueba_2.docx | Comentario prueba 2 |