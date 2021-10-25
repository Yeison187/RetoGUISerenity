Feature: Como usuario quiero ingresar al modulo Mi Info
  para agregar un nuevo attachment.


  Scenario Outline: Ads Attachments
    Given  el usuario necesita agregar una nueva Attachments, inicia sesion el usuario Admin, la contraseña admin123
    When da clic en Add Attachmentsadjunto, adjunta el archivo <ruta>, diligencio el campo comment <comentario>
    Then se debe mostra el mensaje: Successfully Saved
    Examples:
      | ruta                                                | comentario          |
      | \\src\\test\\resources\\File\\Archivo_prueba_1.docx | Comentario prueba 1 |
