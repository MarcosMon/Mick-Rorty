package org.lasencinas.factorias;

import org.lasencinas.abstractclass.FactoriaMickRortyProducts;
import org.lasencinas.abstractclass.MickRortyProducts;
import org.lasencinas.productos.Smiggles;

public class FactoriaSmiggles  extends FactoriaMickRortyProducts{

	@Override
    public MickRortyProducts creaProductoTipo() {
        return new Smiggles();
    }
	
}
