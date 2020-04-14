import java.awt.*;

public class Prenda {

    public CategoriaDePrenda categoria;
    public TipoDePrenda tipo;
    public MaterialDePrenda material;
    public Color colorPrimario;
    public Color colorSecundario;

    public Prenda(CategoriaDePrenda categoria, TipoDePrenda tipo, MaterialDePrenda material,
                  Color colorPrimario, Color colorSecundario) throws ExcepcionPrendaIncompleta, ExcepcionTipoIncompatible {

        if (categoria == null || tipo == null || material == null || colorPrimario == null)
            throw new ExcepcionPrendaIncompleta("Prenda con atributos faltantes");

        else if (!tipoCategoriaCoherente(tipo, categoria))
            throw new ExcepcionTipoIncompatible("Tipo de prenda no condice con su categoria");

        else {
            this.categoria = categoria;
            this.tipo = tipo;
            this.material = material;
            this.colorPrimario = colorPrimario;
            this.colorSecundario = colorSecundario;
        }
    }

    private boolean tipoCategoriaCoherente(TipoDePrenda tipo, CategoriaDePrenda categoria) {
        return tipo.categoriaDelTipo == categoria;
    }
}