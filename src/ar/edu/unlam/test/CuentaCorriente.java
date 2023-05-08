package ar.edu.unlam.test;

public class CuentaCorriente extends Cuenta {

	private Double descubierto;
	private Double interes;
	
	
	public CuentaCorriente(Integer idCuenta, Cliente cliente) {
		super(idCuenta, cliente);
		this.descubierto = 150.0;
		this.interes = 0.05 * descubierto;
	}
	
	public boolean aplicaInteres() {
		if(descubierto < 150) {
			return true;
		}return false;
	}

	public boolean extraerDineroDeCuenta(Double montoAExtraer) {
		if(montoAExtraer<=saldo + descubierto) {
			saldo -= montoAExtraer;
			return true;
		}
		return false;
	}

	public void depositarDineroEnCuenta(Double montoADepositar) {
		this.setSaldo(montoADepositar + saldo + descubierto);
	}

	public Double getSobregiro() {
		return descubierto;
	}


	public void setSobregiro(Double sobregiro) {
		this.descubierto = sobregiro;
	}
	 
}
