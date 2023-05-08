package ar.edu.unlam.test;

import java.util.ArrayList;

public class Banco {

	private String nombre;
	private ArrayList<Cuenta> listaCuentas;
	private ArrayList<Cliente> listaClientes;

	public Banco(String nombre) {
		this.nombre = nombre;
		this.listaCuentas = new ArrayList<>();
		this.listaClientes = new ArrayList<>();
	}

	public void agregarCuentaAlBanco(Cuenta cuenta) {
		this.listaCuentas.add(cuenta);
		
	}
	public void agregarClienteNuevoAlBanco(Cliente cliente) {
		this.listaClientes.add(cliente);
		
	}

	public Integer obtenerCantidadDeCuentas() {
		return this.listaCuentas.size();
	}
	public Integer obtenerCantidadDeClientes() {
		return this.listaClientes.size();
	}
	public Cliente buscarClientePorId(Integer idCliente) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getIdCliente().equals(idCliente)) {
				return cliente;
			}
		}
		return null;
	}
	public Cuenta buscarCuentaPorId(Integer idCuenta) {
		for (Cuenta cuenta : listaCuentas) {
			if (cuenta.getIdCuenta().equals(idCuenta)) {
				return cuenta;
			}
		}
		return null;
		/**for (int i = 0; i < cuenta.size(); i++) {
			if (this.cuenta.get(i).getId().equals(idCuenta)) {
				return this.cuenta.get(i);
			}}
		for (Cuenta cuenta : listaCuentas) {
			if (cuenta.getId().equals(idCuenta))
				return cuenta;
		}
		return null;*/
	}
	public boolean transferirDineroDeCuentaOrigenACuentaDestino(Double monto, Integer idCuenta, Integer idCuenta) {
		/**Double cuentaOrigen = 0.0;
		Double cuentaDestino = 0.0;
		for (int i = 0; i < cuenta.size(); i++) {
			if (this.cuenta.get(i).getId().equals(idCuenta1) && this.cuenta.get(i).getId().equals(idCuenta)) {

				cuentaOrigen = extraerDineroDeCuenta(cuenta.get(i).getId(), monto);
				cuentaDestino = depositarDineroEnCuenta(cuenta.get(i).getId(), monto);
				return true;
			}
		}return false;*/

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}
