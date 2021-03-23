@all
Feature: Tests for yandex search

  Background:
    Given User open https://yandex.ru page

  @pictureSearch
  Scenario Outline: search picture
    When User open yandex link with Картинки
    And User user download picture with <picture>
    Then User see that <picName> is <state>

    Examples:
      | picture      | picName  | state   |
      | avtokran.jpg | автокран | present |
      | clock.jpeg   | часы     | present |
