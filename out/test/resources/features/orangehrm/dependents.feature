
Feature: Como usuario quiero ingresar al modulo Mi Info
  para agregar una nueva dependencia.


  Scenario Outline: Agregar nueva dependencia
    Given el usuario necesita agregar una nueva dependencia, inicia sesion el usuario Admin, la contraseña admin123
    When  da clic el boton add del area Assigned Dependents
    And diligencia los campos <name>,<relationship>,<birth>

    Then debe mostra el mensaje: Successfully Saved
    Examples:
      | name   | relationship | birth      |
      | Maria  | Child      | 2021-10-29 |


