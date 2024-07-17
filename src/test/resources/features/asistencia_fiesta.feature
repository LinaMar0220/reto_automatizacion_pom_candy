Feature: Seleccionar tipo de integrante para una Halloween party

  Scenario Outline: Seleccionar como Anfitrion de fiesta de forma exitosa
    Given el usuario esta en la pagina
    And ingrese a la opcion deseada para la fiesta
    And selecciona el tipo de fiesta como anfitrion
    When seleccione la tematica "Zombies"
    And diligencie la informacion requerida
      | numeroAcompanante   | email   |
      | <numeroAcompanante> | <email> |
    Then vizualiza el siguiente mensaje "Your Halloween Party is almost here!"
    Examples:
      | numeroAcompanante | email            |
      | 1                 | prueba@gmail.com |

  Scenario Outline: Seleccionar  como Invitado de fiesta de forma exitosa
    Given el usuario esta en la pagina
    And ingrese a la opcion deseada para la fiesta
    And selecciona el tipo de fiesta como invitado
    When seleccione la tematica "Zombieton"
    And diligencie la informacion requerida
      | numeroAcompanante   | email   |
      | <numeroAcompanante> | <email> |
    Then vizualiza el siguiente mensaje "Your Halloween Party is almost here!"
    Examples:
      | numeroAcompanante | email            |
      | 1                 | prueba@gmail.com |