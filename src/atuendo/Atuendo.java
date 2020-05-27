package atuendo;

import prenda.CategoriaDePrenda;
import prenda.Prenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Atuendo {

    private List<Prenda> prendas;

    public Atuendo(List<Prenda> prendas) {
        this.prendas = validarCategoriasDePrenda(prendas);
    }

    /**
     * Valida que haya por lo menos una prenda de cada categoria requerida para un atuendo
     * @param prendas la lista de prendas que debe contener una parte superior,
     *               una inferior, un calzado y un accesorio
     * @return En caso positivo devuelve la misma lista de prendas, sino lanza una excepcion
     */
    private List<Prenda> validarCategoriasDePrenda(List<Prenda> prendas){
        validarCategoriaEnPrendas(prendas, CategoriaDePrenda.PARTE_SUPERIOR);
        validarCategoriaEnPrendas(prendas, CategoriaDePrenda.PARTE_INFERIOR);
        validarCategoriaEnPrendas(prendas, CategoriaDePrenda.CALZADO);
        validarCategoriaEnPrendas(prendas, CategoriaDePrenda.ACCESORIO);

        return prendas;
    }

    private void validarCategoriaEnPrendas(List<Prenda> prendas, CategoriaDePrenda categoria){
        if(prendas.stream().noneMatch(prenda -> prenda.getCategoria() == categoria)){
            throw new ExcepcionCategoriaDePrenda(categoria);
        }
    }

    public boolean atuendoAptoParaTemperatura(int temperatura){
        return prendas.stream().allMatch(prenda -> prenda.getTemperaturaParaUso() == temperatura);
    }
}
