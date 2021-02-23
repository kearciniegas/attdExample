# new feature
# Tags: optional

Feature: creación de secuencia fibonacci
  se debe realizar la generacion de la secuencia de fibonacci
  hasta una longitud que no se menor de 8 numeros y su resultado
  no sea mayor a 50.

  Scenario: secuencia en posición 1 donde retorne un valor de 1
    Given quiero conocer una secuencia de posiciones
    When enviando la posicion 1
    Then espero un 1

  Scenario: secuencia en posición 3 donde retorne un valor de 2
    Given quiero conocer una secuencia de posiciones
    When enviando la posicion 3
    Then espero un 2

  Scenario: secuencia en posición 9 donde retorne un valor de 34
    Given quiero conocer una secuencia de posiciones
    When enviando la posicion 9
    Then espero un 34