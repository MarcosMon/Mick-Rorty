package org.lasencinas.abstractclass;

import java.util.UUID;

public abstract class Factura  {
	private UUID id = UUID.randomUUID();
	private double importe;

	public String getId() {
		return id.toString();
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public abstract double calcularTotal();
}
