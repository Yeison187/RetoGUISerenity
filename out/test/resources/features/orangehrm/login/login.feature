Feature: Yo como administrativo puedo iniciar sesion en el aplicativo

  Background:
    Given necesito ingresar al sistema OrangHRM

  Scenario Outline: Inicio sesion invalido
    When ingreso un usuario <users>, una contraseña <pass>
    Then al dar click en el boton Login <mensaje>

    Examples:
      | users  | pass     | mensaje             |
      | Admin | admin124 | Invalid credentials |
      | admi  | admin123 | Invalid credentials |


  Scenario: Inicio sesion campos vacios
    When el usuario no ingresa un usuario, ni una contraseña
    Then al dar click en el boton Login Username cannot be empty


  @validSesion
  Scenario: Inicio sesion valido
    When ingreso un usuario Admin, una contraseña admin123
    Then al dar click en el boton Login, debe ingresar al sistema
