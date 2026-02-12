Feature: Abrir una URL

  Scenario: Levantar cualquier URL
    Given abro la url "https://www.python.com"
    When  click en Realizar una consulta
    Then la pagina debe cargar
    Then mostrar por consola el aviso
    Then validar aviso
#   Then debe esperar 5 segundos antes de cerrase
#   nuevo desde C:\Users\Usuario\IdeaProjects\Ernesto_20260210\UrlCualquiera_20260210\src\test\resources\features
