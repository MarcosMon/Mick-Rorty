package org.lasencinas.factorias;

import org.lasencinas.abstractclass.FactoriaMickRortyProducts;
import org.lasencinas.abstractclass.MickRortyProducts;
import org.lasencinas.productos.Plumbus;


public class FactoriaPlumbus  extends FactoriaMickRortyProducts{

	@Override
    public MickRortyProducts creaProductoTipo() {
        return new Plumbus();
    }
	
}
	


