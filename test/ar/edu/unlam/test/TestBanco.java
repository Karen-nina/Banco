package ar.edu.unlam.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBanco {
	@Test

	public void testQueSePuedaAgregarUnaCuentaAlBanco() {

		String nombre = "Santander Rio";
		Banco banco = new Banco(nombre);

		String nombreCliente = "karen";
		Integer idCliente = 1;
		Cliente cliente = new Cliente(nombreCliente, idCliente);

		Double saldo = 1000.0;
		Integer idCuenta = 2;
		Cuenta cuenta = new Cuenta(saldo, idCuenta, cliente);

		banco.agregarCuentaAlBanco(cuenta);
		Integer valorEsperado = 1;
		Integer valorObtenido = banco.obtenerCantidadDeCuentas();

		assertEquals(valorEsperado, valorObtenido);

	}

	public void testQueSePuedaEncontrarUnaCuentaPorIdEnUnBanco() {

		String nombre = "Santnader Rio";
		Banco banco = new Banco(nombre);

		String nombreCliente = "karen";
		Integer idCliente = 1;
		Cliente cliente = new Cliente(nombreCliente, idCliente);

		Double saldo = 1000.0;
		Integer idCuenta = 2;
		Cuenta cuenta = new Cuenta(saldo, idCuenta, cliente);

		banco.agregarCuentaAlBanco(cuenta);

		Cuenta cuentaEncontrada = banco.buscarCuentaPorId(idCuenta);

		assertEquals(cuentaEncontrada, cuenta);

	}

	@Test
	public void testQueSePuedaHacerUnaTransferenciaEntreDosCuentas() {

		String nombre = "Santander Rio";
		Banco banco = new Banco(nombre);

		String nombreCliente = "karen";
		Integer idCliente = 1;
		Cliente cliente = new Cliente(nombreCliente, idCliente);

		Double saldo = 1000.0;
		Integer idCuenta = 2;
		Cuenta cuenta = new Cuenta(saldo, idCuenta, cliente);
		
		Double saldo1 = 2000.0;
		Integer idCuenta1 = 1;
		Cuenta cuenta1 = new Cuenta(saldo1, idCuenta1, cliente);
		
		banco.agregarCuentaAlBanco(cuenta);
		banco.agregarCuentaAlBanco(cuenta1);
		
		Double monto = 200.0;
		
		
		boolean valorObtenido = banco.transferirDineroDeCuentaOrigenACuentaDestino(monto, idCuenta, idCuenta1);
		boolean valorEsperado = true;
		
		assertEquals(valorObtenido,valorEsperado);
	}

	
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
		
	}
	public void queSeCobreElCincoPorCientoDeComisionPorMasQueElProximoDepositoNoSeaSuficieteParaCubrirElDescubierto() {
		
	}
	public void queUnaExtraccionCuandoYaSeTieneDeudaIncrementeLaDeuda() {
		
	}
	public void queVariasOperacionesDeDepositoYExtraccionGenerenElSaldoYLaDeudaCorrecto() {
		
	}
//	public void testQueNoSePuedeHacerTransferenciaPorFondoInsuficiente() {
//
//		String nombre = "Santander Rio";
//		Banco banco = new Banco(nombre);
//
//		String nombreCliente = "karen";
//		Integer idCliente = 1;
//		Cliente cliente = new Cliente(nombreCliente, idCliente);
//
//		Double saldo = 1000.0;
//		Integer idCuenta = 2;
//		Cuenta cuenta = new Cuenta(saldo, idCuenta, cliente);
//		
//		Double saldo1 = 2000.0;
//		Integer idCuenta1 = 1;
//		Cuenta cuenta1 = new Cuenta(saldo1, idCuenta1, cliente);
//		
//		banco.agregarCuentaAlBanco(cuenta);
//		banco.agregarCuentaAlBanco(cuenta1);
//		
//		Cuenta cuentaOrigen = banco.buscarCuentaPorId(idCuenta);
//		Cuenta cuentaDestino = banco.buscarCuentaPorId(idCuenta1);
//		
//		Double monto = 200.0;
//		banco.transferirDineroDeCuentaOrigenACuentaDestino(monto, cuentaOrigen.getId(), cuentaDestino.getId());
//	}

	public void testQueSePuedaExtraerDineroDeUnaCuenta() {

		String nombre = "Santander Rio";
		Banco banco = new Banco(nombre);

		String nombreCliente = "karen";
		Integer idCliente = 1;
		Cliente cliente = new Cliente(nombreCliente, idCliente);

		Double saldo = 1000.0;
		Integer idCuenta = 2;
		Cuenta cuenta = new Cuenta(saldo, idCuenta, cliente);
		
		banco.agregarCuentaAlBanco(cuenta);
		
		Double montoARetirar = 200.0;
		
		Double valorEsperado = saldo - montoARetirar;
		Double valorObtenido = banco.extraerDineroDeCuenta(idCuenta,montoARetirar);
		assertEquals(valorEsperado, valorObtenido);
}

	public void testQueSePuedaDepositarDineroEnUnaCuenta() {

		String nombre = "Santander Rio";
		Banco banco = new Banco(nombre);

		String nombreCliente = "karen";
		Integer idCliente = 1;
		Cliente cliente = new Cliente(nombreCliente, idCliente);

		Double saldo = 1000.0;
		Integer idCuenta = 2;
		Cuenta cuenta = new Cuenta(saldo, idCuenta, cliente);
		
		banco.agregarCuentaAlBanco(cuenta);
		
		Double montoADepositar = 200.0;
		
		Double valorEsperado = saldo + montoADepositar;
		Double valorObtenido = banco.depositarDineroEnCuenta(idCuenta,montoADepositar);
		assertEquals(valorEsperado, valorObtenido);
		
	}
}
