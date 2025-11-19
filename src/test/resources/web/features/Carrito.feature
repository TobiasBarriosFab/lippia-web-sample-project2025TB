@Carrito
  Feature: Carrito
    Background:
      Given el usuario ingresa su usuario standard_user y su contraseña secret_sauce en la pagina Sausodemo
      And el usuario se loguea exitosamente y visualiza los productos

    @CarritoAgregarProducto
    Scenario: El usuario agrega un producto al carrito
      When el usuario agrega el producto Sauce Labs Backpack al carrito
      Then se verifica que el contador del carrito es 1

    @CarritoEliminarProducto
    Scenario: El usuario elimina el producto del carrito
      When el usuario agrega el producto Sauce Labs Backpack al carrito
      And el usuario hace click en el boton Remove del producto Sauce Labs Backpack
      Then se verifica que el contador del carrito no es visible