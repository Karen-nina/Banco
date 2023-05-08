package ar.edu.unlam.test;

import java.util.ArrayList;

public class Cliente {

	 private String nombre;
	 private Integer idCliente;
	 private ArrayList<Cuenta> listaCuentas;
	 
	public Cliente(String nombre, Integer idCliente) {
		
		this.nombre = nombre;
		this.idCliente = idCliente;
		this.listaCuentas = new ArrayList<Cuenta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public ArrayList<Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	
	 
	 

	

	
}
