package org.lasencinas.factorias;

import org.lasencinas.abstractclass.FactoriaMickRortyProducts;
import org.lasencinas.abstractclass.MickRortyProducts;
import org.lasencinas.productos.TurbulentJuice;

public class FactoriaTurbulentJuice  extends FactoriaMickRortyProducts{

	@Override
    public MickRortyProducts creaProductoTipo() {
        return new TurbulentJuice();
    }
	
}

