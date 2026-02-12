Feature: Abrir una URL

  Scenario: Levantar cualquier URL
    Given abro la url "https://www.python.com"
    When  click en Realizar una consulta
    And la pagina debe cargar
    And mostrar por consola el aviso
    Then validar aviso
#   Then debe esperar 5 segundos antes de cerrase
#   nuevo desde C:\Users\Usuario\IdeaProjects\Ernesto_20260210\UrlCualquiera_20260210\src\test\resources\features
#   Desde Git Hub a pc escritorio persomnal
#   nueva actualizacion desde mi notebook a github  22222
#   desde github a notebook
#   desde notebook a github
  # src/test/resource/feature
  # nuevo cambio 210