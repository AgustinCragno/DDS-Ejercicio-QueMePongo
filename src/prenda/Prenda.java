package prenda;

import prenda.material.MaterialDePrenda;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {

    private TipoDePrenda tipo;
    private MaterialDePrenda material;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(TipoDePrenda tipo, MaterialDePrenda material, Color colorPrimario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
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
