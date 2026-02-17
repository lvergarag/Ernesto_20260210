Feature: Abrir una URL

  Scenario: Levantar cualquier URL
    Given abro la url "https://www.python.com"
    When  click en Realizar una consulta
    And la pagina debe cargar
    And mostrar aviso Ready to Make Your Move
    Then validar aviso

  Scenario: Levantar cualquier URL
    Given abro la url "https://www.python.com"
    When  click en Mas Informacion
    And la pagina debe cargar
    And mostrar aviso Why Python.com
    Then validar aviso 2