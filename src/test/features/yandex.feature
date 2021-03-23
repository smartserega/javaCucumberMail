@all
Feature: Tests for yandex search

  Background:
    Given User open https://yandex.ru page

  @pictureSearch
  Scenario: search picture
    When User open yandex link with Картинки
    And User user download picture with avtokran.jpg
    Then User see that автокран is present
