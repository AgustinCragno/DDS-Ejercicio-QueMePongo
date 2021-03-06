package uniforme;

import prenda.*;
import prenda.material.TipoDeMaterial;
import prenda.material.Trama;

import java.awt.*;

public class SastreUTN extends Sastre {
    @Override
    protected Prenda fabricarPrendaSuperior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoDePrenda.CAMISA);
        borrador.especificarTipoDeMaterial(TipoDeMaterial.TELA);
        borrador.especificarTrama(Trama.ESTAMPADO);
        borrador.especificarColorPrimario(Color.WHITE);
        borrador.especificarColorSecundario(Color.BLUE);
        borrador.especificarTemperaturaApta(20);
        return borrador.crearPrenda();
    }

    @Override
    protected Prenda fabricarPrendaInferior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoDePrenda.PANTALON);
        borrador.especificarTipoDeMaterial(TipoDeMaterial.TELA);
        borrador.especificarColorPrimario(Color.GRAY);
        borrador.especificarTemperaturaApta(20);
        return borrador.crearPrenda();
    }

    @Override
    protected Prenda fabricarCalzado() {
        BorradorPrenda borrador = new BorradorPrenda(TipoDePrenda.ZAPATO);
        borrador.especificarTipoDeMaterial(TipoDeMaterial.CUERO);
        borrador.especificarColorPrimario(Color.BLACK);
        borrador.especificarTemperaturaApta(20);
        return borrador.crearPrenda();
    }
}
