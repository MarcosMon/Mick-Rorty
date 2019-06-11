package org.lasencinas.abstractclass;

public abstract class MickRortyProducts {

	public boolean tieneEnvase = false;
	public String tipoProducto = null;

	public double precio = 0;

	public MickRortyProducts(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void ponerEnvase() {
		this.tieneEnvase = true;
	}

	
	
}
