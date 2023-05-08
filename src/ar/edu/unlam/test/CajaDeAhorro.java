package ar.edu.unlam.test;

public class CajaDeAhorro extends Cuenta {

	private Double costoAdicional;
	private Integer cantidadDeExtracciones;
	
	public CajaDeAhorro(Integer idCuenta, Cliente cliente) {
		super(idCuenta, cliente);
		this.costoAdicional = 6.0;
		this.cantidadDeExtracciones = 0;
	}
	public boolean extraerDineroDeCuenta(Double montoAExtraer) {
		if(cantidadDeExtracciones>5 & montoAExtraer + costoAdicional <= this.saldo) {
			this.saldo = saldo - montoAExtraer - costoAdicional;
			return true;
		}else {
				if(montoAExtraer <= this.saldo) {
					this.saldo = saldo - montoAExtraer;
					this.cantidadDeExtracciones +=1;
					return true;
			}
		}
		return false;
	}

	public void depositarDineroEnCuenta(Double montoADepositar) {
		this.setSaldo(montoADepositar + saldo);
	}

	public Double getCostoAdicional() {
		return costoAdicional;
	}

	public void setCostoAdicional(Double costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
}
