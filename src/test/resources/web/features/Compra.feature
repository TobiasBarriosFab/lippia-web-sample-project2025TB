@CompraCompleta
  Feature: Compra completa
    Background:
      Given el usuario ingresa su usuario standard_user y su contraseña secret_sauce en la pagina Sausodemo
      And el usuario se loguea exitosamente y visualiza los productos

      @CompraAgregarProductoCarrito
      Scenario: el usario agrega dos productos al carrito y va al carrito
        And el usuario agrega el producto Sauce Labs Backpack al carrito
        And el usuario agrega el producto Sauce Labs Bolt T-Shirt al carrito
        Then se verifica que el contador del carrito es 2

    @CompraVerificarCarrito
      Scenario: el usario agrega dos productos al carrito y va al carrito
        And el usuario agrega el producto Sauce Labs Backpack al carrito
        And el usuario agrega el producto Sauce Labs Bolt T-Shirt al carrito
        And se verifica que el contador del carrito es 2
        When el usuario hace click en el carrito
        Then el usuario esta en la pagina del carrito

      @CompraCheckout
      Scenario: El usuario inicia el checkout
        And el usuario agrega el producto Sauce Labs Backpack al carrito
        And el usuario agrega el producto Sauce Labs Bolt T-Shirt al carrito
        And el usuario hace click en el carrito
        And el usuario esta en la pagina del carrito
        When el usuario hace click en el boton de Checkout
        Then el usuario se encuentra el la pagina de Chekout

         @CompraCheckoutCompletarCampos
      Scenario: El usuario completa sus datos en la pagina del Checkout
        And el usuario agrega el producto Sauce Labs Backpack al carrito
        And el usuario agrega el producto Sauce Labs Bolt T-Shirt al carrito
        And el usuario hace click en el carrito
        And el usuario esta en la pagina del carrito
        And el usuario hace click en el boton de Checkout
        And el usuario se encuentra el la pagina de Chekout
        When el usurio completa el campo First Name con su nombre Tobias
        And el usuario completa el campo Last Name con su apellido Barrios
        And el usuario completa el campo Zip/Postal Code con su codigo postal 5000
        And el usuario hace click en el boton continuar
        Then el usuario se encuentra el la pagina de Overview

      @CompraValidarProductosOverview
      Scenario: el usuario valida los precios y nombres de los productos en la pagina overview
        And el usuario agrega el producto Sauce Labs Backpack al carrito
        And el usuario agrega el producto Sauce Labs Bolt T-Shirt al carrito
        And el usuario hace click en el carrito
        And el usuario esta en la pagina del carrito
        And el usuario hace click en el boton de Checkout
        And el usuario se encuentra el la pagina de Chekout
        And el usurio completa el campo First Name con su nombre Tobias
        And el usuario completa el campo Last Name con su apellido Barrios
        And el usuario completa el campo Zip/Postal Code con su codigo postal 5000
        And el usuario hace click en el boton continuar
        And el usuario se encuentra en la pagina de Overview
        Then el usuario verifica que el producto Sauce Labs Backpack se muestra en la pagina de Overview
        And el usuario verifica que el producto Sauce Labs Bolt T-Shirt se muestra en la pagina de Overview
        And el usuario verifica que el precio del producto Sauce Labs Backpack es correcto
        And el usuario verifica que el precio del producto Sauce Labs Bolt T-Shirt es correcto
        @CompraFinalizarCompra
      Scenario: el usuario finaliza la compra
        And el usuario agrega el producto Sauce Labs Backpack al carrito
        And el usuario agrega el producto Sauce Labs Bolt T-Shirt al carrito
        And el usuario hace click en el carrito
        And el usuario esta en la pagina del carrito
        And el usuario hace click en el boton de Checkout
        And el usuario se encuentra el la pagina de Chekout
        And el usurio completa el campo First Name con su nombre Tobias
        And el usuario completa el campo Last Name con su apellido Barrios
        And el usuario completa el campo Zip/Postal Code con su codigo postal 5000
        And el usuario hace click en el boton continuar
        And el usuario se encuentra en la pagina de Overview
        And el usuario verifica que el producto Sauce Labs Backpack se muestra en la pagina de Overview
        And el usuario verifica que el producto Sauce Labs Bolt T-Shirt se muestra en la pagina de Overview
        And el usuario verifica que el precio del producto Sauce Labs Backpack es correcto
        And el usuario verifica que el precio del producto Sauce Labs Bolt T-Shirt es correcto
        When el usuario hace click en el boton Finish
        And el usuario visualiza la epica Thank you for your order!