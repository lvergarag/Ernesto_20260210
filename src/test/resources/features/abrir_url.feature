Feature: Abrir una URL

  Scenario: Levantar cualquier URL
    Given abro la url "https://www.python.com"
    When  click en Realizar una consulta
    And la pagina debe cargar
    And mostrar por consola el aviso
    Then validar aviso

##  Then debe esperar 5 segundos antes de cerrase
