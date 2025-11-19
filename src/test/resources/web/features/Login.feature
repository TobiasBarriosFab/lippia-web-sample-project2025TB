@Login
Feature: Login
  Background:
    Given el usuario se encuentra en la pagina Saucedemo

    @LoginExitoso
    Scenario: Login exitoso
      When el usuario ingresa en el campo username standard_user
      And el usuario ingresa en el campo password secret_sauce
      And el usuario hace click en el boton Login
      Then el usuario se loguea exitosamente y visualiza los productos


    @LoginFallido
    Scenario: Login fallido usuario bloqueado
      When el usuario ingresa en el campo username locked_out_user
      And el usuario ingresa en el campo password secret_sauce
      And el usuario hace click en el boton Login
      Then el usuario visualiza la leyenda Epic sadface: Sorry, this user has been locked out.