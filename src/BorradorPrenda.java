import java.awt.*;

import static java.util.Objects.requireNonNull;

public class BorradorPrenda {

    private TipoDePrenda tipoDePrenda;
    private TipoDeMaterial tipoDeMaterial;
    private Trama trama = Trama.LISA;
    private Color colorPrimario;
    private Color colorSecundario;

    public BorradorPrenda(TipoDePrenda tipoDePrenda){
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "Tipo de prenda es un valor obligatorio");
    }

    public void especificarTipoDeMaterial(TipoDeMaterial tipoDeMaterial){
        this.tipoDeMaterial = requireNonNull(tipoDeMaterial, "TipoDeMaterial de prenda es un valor obligatorio");
    }

    public void especificarTrama(Trama trama){
        this.trama = requireNonNull(trama, "Trama de la prenda no puede ser nula");
    }

    public void especificarColorPrimario(Color colorPrimario) {
        this.colorPrimario = requireNonNull(colorPrimario, "Color de prenda es un valor obligatorio");
    }

    public void especificarColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Prenda crearPrenda(){
        return new Prenda(tipoDePrenda, new MaterialDePrenda(trama, tipoDeMaterial), colorPrimario, colorSecundario);
    }
}
