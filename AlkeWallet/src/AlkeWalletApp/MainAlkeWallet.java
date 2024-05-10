package AlkeWalletApp;

import java.util.Scanner;

//Se importan clases a utilizar 
import cuentas.CuentaCorriente;
import cuentas.CuentaVista;
import moneda.Dolar;
import moneda.Euro;

public class MainAlkeWallet {
	

    public static void main(String[] args) {
    	
    	// Se llaman clases a utilizar
    	CuentaCorriente cuentaCorriente = new CuentaCorriente("Gabriela Miranda", 23234, 1000);
        CuentaVista cuentaVista = new CuentaVista("Gabriela Miranda", 13200, 5000); 
        Euro euro = new Euro(); 
        Dolar dolar = new Dolar();
        
       //Se llama scanner a utilizar
        Scanner scanner = new Scanner(System.in);
        
        
        //MENSAJE DE BIENVENIDA A LA BILLETERA
    	System.out.println("");
		System.out.println("                       ALKEWALLET GABRIELA                         ");
    	System.out.println("");
		System.out.println("¡Bienvenida al sistema de Administración de Fondos de tu billetera!");
    	System.out.println("");
    	System.out.println("");

        
        while (true) {
        	//SE MOSTRARÁ POR CONSOLA AL USUARIO LAS OPCIONES DISPONIBLES EN SU BILLETERA VIRTUAL
            System.out.println("------------------ Menú Principal ------------------ ");
        	System.out.println(""); //OPERACIONES CUENTA CORRIENTE
            System.out.println("> CUENTA CORRIENTE ");
            System.out.println("1. Consulta de saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Girar dinero");
            System.out.println("4. Transferir dinero a Cuenta Vista");
        	System.out.println(""); //OPERACIONES CUENTA VISTA
            System.out.println("> CUENTA VISTA ");
            System.out.println("5. Consulta de saldo");
            System.out.println("6. Depositar dinero");
            System.out.println("7. Girar dinero");
            System.out.println("8. Transferir dinero a Cuenta Corriente");
        	System.out.println(""); //OPCIÓN PARA CONVERSIÓN DE MONEDAS
            System.out.println("> CONVERSIÓN DE MONEDAS: ");
            System.out.println("9. Convertir Peso Chileno a Dólar");
            System.out.println("10. Convertir Dólar a Peso Chileno");
            System.out.println("11. Convertir Peso Chileno a Euro");
            System.out.println("12. Convertir Euro a Peso Chileno");
            System.out.println("");//OPCIÓN PARA SALIR DEL MENÚ PRINCIPAL
            System.out.println("13. SALIR");
            System.out.println(""); //SOLICITUD DE OPCIÓN POR PARTE DEL USUARIO
            System.out.print("    Seleccione una opción: ");
            int opcionPrincipal = scanner.nextInt(); 

            switch (opcionPrincipal) {               
                case 1:
                    System.out.println(""); 
                    System.out.println("Saldo inicial de Cuenta Corriente: " + cuentaCorriente.getSaldo()); //SE LLAMA GETSALDO DESDE CUENTACORRIENTE
                    System.out.println("");
                    break;
                case 2:
                	System.out.println("");
                	System.out.println("DEPÓSITO EN CUENTA CORRIENTE");
                	System.out.print("Ingrese la cantidad a depositar en Cuenta Corriente: ");
                    double cantidadDepositarCorriente = scanner.nextDouble();
                    cuentaCorriente.depositar(cantidadDepositarCorriente); //SE LLAMA EL MÉTODO DEPOSITAR DESDE CUENTACORRIENTE
                	System.out.println("");
                	break;
                case 3:
                	System.out.println("");
                	System.out.println("GIRO EN CUENTA CORRIENTE");
                	System.out.print("Ingrese la cantidad a retirar de Cuenta Corriente: ");
                    double cantidadRetirarCorriente = scanner.nextDouble(); 
                    cuentaCorriente.retirar(cantidadRetirarCorriente); //SE LLAMA EL MÉTODO RETIRAR DESDE CUENTACORRIENTE
                	System.out.println("");
                	break;
                case 4:
                	System.out.println("");
                	System.out.println("TRANSFERENCIA HACIA CUENTA VISTA");
                    System.out.print("Ingrese la cantidad a transferir de Cuenta Corriente a Cuenta Vista: ");
                    double cantidadTransferirCorriente = scanner.nextDouble(); 
                    cuentaCorriente.transferir(cuentaVista, cantidadTransferirCorriente); //SE LLAMA EL MÉTODO TRANSFERIR DESDE CUENTACORRIENTE
                	System.out.println("");
                	break;
                case 5:
                    System.out.println("");
                    System.out.println("Saldo inicial de Cuenta Vista: " + cuentaVista.getSaldo()); //SE LLAMA GETSALDO DESDE CUENTAVISTA
                    System.out.println("");
                    break;
                case 6:
                	System.out.println("");
                	System.out.println("DEPÓSITO EN CUENTA VISTA");
                	System.out.print("Ingrese la cantidad a depositar en Cuenta Vista: ");
                    double cantidadDepositarVista = scanner.nextDouble(); 
                    cuentaVista.depositar(cantidadDepositarVista); //SE LLAMA EL MÉTODO DEPOSITAR DESDE CUENTAVISTA
                	System.out.println("");
                	break;
                case 7:
                	System.out.println("");
                	System.out.println("GIRO EN CUENTA VISTA");
                    System.out.print("Ingrese la cantidad a retirar de Cuenta Vista: ");
                    double cantidadRetirarVista = scanner.nextDouble();
                    cuentaVista.retirar(cantidadRetirarVista);//SE LLAMA EL MÉTODO RETIRAR DESDE CUENTAVISTA
                	System.out.println("");
                	break;
                case 8:
                	System.out.println("");
                	System.out.println("TRANSFERENCIA HACIA CUENTA CORRIENTE");
                    System.out.print("Ingrese la cantidad a transferir de Cuenta Vista a Cuenta Corriente: ");
                    double cantidadTransferirVista = scanner.nextDouble();
                    cuentaVista.transferir(cuentaCorriente, cantidadTransferirVista); //SE LLAMA EL MÉTODO TRANSFERIR DESDE CUENTAVISTA
                	System.out.println("");
                	break;
                case 9:
                	System.out.println("");
                	System.out.println("CONVERTIR PESOS CHILENOS A DÓLARES");
                    System.out.print("Ingrese la cantidad de pesos chilenos a convertir: ");
                    double cantidadConvertidaPesoCLDolar = scanner.nextDouble();
                    dolar.convertirPesoCL(cantidadConvertidaPesoCLDolar); //SE LLAMA EL MÉTODO CONVERTIRPESOCL DESDE DOLAR
                	System.out.println("");
                	break;
                case 10:
                	System.out.println("");
                	System.out.println("CONVERTIR DÓLARES A PESOS CHILENOS");
                    System.out.print("Ingrese la cantidad de dólares a convertir: ");
                    double cantidadConvertidaDolarPesoCL= scanner.nextDouble();
                    dolar.convertirMonedaExtranjera(cantidadConvertidaDolarPesoCL); //SE LLAMA EL MÉTODO CONVERTIRMONEDAEXTRANJERA DESDE DOLAR
                	System.out.println("");
                	break;
                case 11:
                	System.out.println("");
                	System.out.println("CONVERTIR PESOS CHILENOS A EUROS");
                    System.out.print("Ingrese la cantidad de pesos chilenos a convertir: ");
                    double cantidadConvertidaPesoCLEuro = scanner.nextDouble();
                    euro.convertirPesoCL(cantidadConvertidaPesoCLEuro); //SE LLAMA EL MÉTODO CONVERTIRPESOCL DESDE EURO
                	System.out.println("");
                	break;
                case 12:
                	System.out.println("");
                	System.out.println("CONVERTIR EUROS A PESOS CHILENOS");
                    System.out.print("Ingrese la cantidad de euros a convertir: ");
                    double cantidadConvertidaEuroPesoCL= scanner.nextDouble();
                    euro.convertirMonedaExtranjera(cantidadConvertidaEuroPesoCL); //SE LLAMA EL MÉTODO CONVERTIRPESOCL DESDE EURO
                	System.out.println("");
                	break;
                case 13:
                    System.out.println("Agradecemos tu preferencia. Saliendo de tu billetera...");
                    scanner.close(); //CIERRE DEL SCANNER
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}