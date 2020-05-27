package atuendo;

import prenda.CategoriaDePrenda;

public class ExcepcionCategoriaDePrenda extends RuntimeException{

    public ExcepcionCategoriaDePrenda(CategoriaDePrenda categoria) {
        super("No hay prendas que cumplan con el requisito de categoria: no pertenece a " + categoria.name());
    }
}
