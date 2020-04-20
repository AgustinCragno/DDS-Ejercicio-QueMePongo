import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {

    private TipoDePrenda tipo;
    private MaterialDePrenda material;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(TipoDePrenda tipo, MaterialDePrenda material, Color colorPrimario) {
        this.tipo = requireNonNull(tipo, "Tipo de prenda es un valor obligatorio");
        this.material = requireNonNull(material, "Material de prenda es un valor obligatorio");
        this.colorPrimario = requireNonNull(colorPrimario, "Color de prenda es un valor obligatorio");
    }

    public Prenda(TipoDePrenda tipo, MaterialDePrenda material, Color colorPrimario, Color colorSecundario) {
        this(tipo, material, colorPrimario);
        this.colorSecundario = colorSecundario;
    }

    public TipoDePrenda getTipo() { return tipo; }

    public MaterialDePrenda getMaterial() { return material; }

    public Color getColorPrimario() { return colorPrimario; }

    public Color getColorSecundario() { return colorSecundario; }
}