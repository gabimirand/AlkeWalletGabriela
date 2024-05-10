ALKEWALLET GABRIELA

Este proyecto llamado "AlkeWallet" contiene 4 package con sus respectivas clases.

  * AlkewalletApp: Contiene la clase "MainAlkeWallet" en la cual se operan los diferentes
    métodos creados en las clases cuentas y moneda. Muestra por consola opciones al usuario
    para poder ejecutar métodos de administración de fondos, envío y recepción de fondos,
    conversión de moneda. 
    
  * cuentas: Contiene las clases CuentaBancaria, CuentaCorriente y CuentaVista.
    - CuentaBancaria: Superclase que contiene los atributos (titular, numeroCuenta, saldo) y
    los constructores, los getter y los métodos depositar dinero, retirar dinero y transferir
    entre cuentas.
    - CuentaCorriente: Clase extendida  de CuentaBancaria donde se utiliza @Override para
    sobreescribir los métodos depositar dinero, retirar dinero y transferir dinero.
    - CuentaVista: Clase extendida  de CuentaBancaria donde se utiliza @Override para
    sobreescribir los métodos depositar dinero, retirar dinero y transferir dinero.
          
  * moneda: Contiene la clases Moneda, Euro y Dolar.
    - Moneda: Interface que contiene getSimbolo, getFactorConversion, convertirPesoCL
    y convertirMonedaExtranjera.  
    - Dolar: Clase implementada de la interface Moneda, donde se utiliza @Override para
    sobreescribir los métodos anteriomente señalados. 
    - Euro: Al igual que Dolar, esta clase implementa los métodos de la interface Moneda,
    también utiliza @Override para sobreescribir los métodos anteriomente señalados. 
      
  * TestAlkeWallet: Se realizó prueba JUnit 5 a las clases CuentaCorrienteTest, CuentaVistaTest,
    DolarTest y EuroTest, donde se probaron los métodos utilizados. 
    Todas las pruebas corrieron sin errores ni fallas.

    En este repositorio adjunto imágenes de las pruebas y la ejecución por consola del
    MainAlkeWallet. 



