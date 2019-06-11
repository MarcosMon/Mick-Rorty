package org.lasencinas.factorias;

import org.lasencinas.abstractclass.FactoriaMickRortyProducts;
import org.lasencinas.abstractclass.MickRortyProducts;
import org.lasencinas.productos.EyeHole;

public class FactoriaEyeHole extends FactoriaMickRortyProducts{

	@Override
    public MickRortyProducts creaProductoTipo() {
        return new EyeHole();
    }
}
