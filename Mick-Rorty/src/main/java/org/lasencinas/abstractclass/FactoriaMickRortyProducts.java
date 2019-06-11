package org.lasencinas.abstractclass;

public abstract class FactoriaMickRortyProducts {


	    public MickRortyProducts creaProducto() {
	    	MickRortyProducts producto = creaProductoTipo();
	        producto.ponerEnvase();
	        
	        return producto;
	    }

	    protected abstract MickRortyProducts creaProductoTipo();
}
