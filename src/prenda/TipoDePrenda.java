package prenda;

public enum TipoDePrenda {
    REMERA(CategoriaDePrenda.PARTE_SUPERIOR), CAMISA(CategoriaDePrenda.PARTE_SUPERIOR),
    ZAPATO(CategoriaDePrenda.CALZADO), PANTALON(CategoriaDePrenda.PARTE_INFERIOR),
    PANUELO(CategoriaDePrenda.ACCESORIO); //etc

    TipoDePrenda(CategoriaDePrenda categoria){
        this.categoriaDelTipo = categoria;
    }

    public final CategoriaDePrenda categoriaDelTipo;
}
