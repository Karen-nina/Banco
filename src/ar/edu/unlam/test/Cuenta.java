package ar.edu.unlam.test;

public class Cuenta {

	protected Double saldo;
	protected Integer idCuenta;
	protected Cliente cliente;
	
	public Cuenta(Integer idCuenta, Cliente cliente) {
		this.saldo = 0.0;
		this.idCuenta = idCuenta;
		this.cliente = cliente;
		
	}
	public boolean extraerDineroDeCuenta(Double montoAExtraer) {
		if(montoAExtraer <= this.saldo) {
			this.saldo = saldo-montoAExtraer;
			return true;
		}
		return false;
	}

	public void depositarDineroEnCuenta(Double montoADepositar) {
		
			this.saldo = saldo + montoADepositar;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Integer getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	
}
