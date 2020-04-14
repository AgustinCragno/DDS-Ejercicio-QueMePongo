import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QueMePongo {

    private List<Prenda> prendasCargadas = new ArrayList<>();

    public void cargarPrenda(CategoriaDePrenda categoria, TipoDePrenda tipo, MaterialDePrenda material,
                             Color colorPrimario, Color colorSecundario){
        try {
            Prenda nuevaPrenda = new Prenda(categoria, tipo, material, colorPrimario, colorSecundario);
            prendasCargadas.add(nuevaPrenda);

        } catch (ExcepcionPrendaIncompleta | ExcepcionTipoIncompatible excepcionPrenda) {
            System.out.println(excepcionPrenda);
        }
    }

    public List<Prenda> getPrendasCargadas() {
        return prendasCargadas;
    }
}
