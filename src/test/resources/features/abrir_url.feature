Feature: Abrir una URL

  Scenario: Levantar cualquier URL
    Given abro la url "https://www.python.com"
    When  click en Realizar una consulta
    And la pagina debe cargar
    And mostrar por consola el aviso
    Then validar aviso
#   Then debe esperar 5 segundos antes de cerrase
#   Desde Git Hub a pc escritorio persomnal
#   nueva actualizacion desde mi notebook a github
  # src/test/resource/feature/abrir_urlFeature  45
