Feature: Búsqueda de Hoteles en Airbnb

  @test3
  Scenario: Búsqueda de hoteles en Vichayito
    Given que estoy en la aplicación de Airbnb y cierro cualquier ventana emergente
    When realizo una búsqueda de "Hoteles en Vichayito"
    And selecciono "SKIP" en el formulario de "When's your trip?"
    And hago clic en Search
    Then debería ver resultados con más de 1 estancia y el mensaje "Over 1,000 stays"
