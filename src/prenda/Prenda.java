package prenda;

import prenda.material.MaterialDePrenda;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {

    private TipoDePrenda tipo;
    private MaterialDePrenda material;
    private Color colorPrimario;
    private Color colorSecundario;
    private int temperaturaParaUso;

    public Prenda(TipoDePrenda tipo, MaterialDePrenda material, Color colorPrimario, int temperaturaParaUso) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.temperaturaParaUso = temperaturaParaUso;
    }

    public Prenda(TipoDePrenda tipo, MaterialDePrenda material, Color colorPrimario, Color colorSecundario, int temperaturaParaUso) {
        this(tipo, material, colorPrimario, temperaturaParaUso);
        this.colorSecundario = colorSecundario;
    }

    public TipoDePrenda getTipo() { return tipo; }
    public CategoriaDePrenda getCategoria(){ return tipo.categoriaDelTipo; }
    public MaterialDePrenda getMaterial() { return material; }
    public Color getColorPrimario() { return colorPrimario; }
    public Color getColorSecundario() { return colorSecundario; }
    public int getTemperaturaParaUso() { return temperaturaParaUso; }
}
