import prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {

    private String tag;
    private List<Prenda> prendas;

    public Guardarropas(String tag) {
        this.tag = tag;
        prendas = new ArrayList<>();
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public void quitarPrenda(Prenda prenda){
        prendas.remove(prenda);
    }

    public String getTag() { return tag; }
    public List<Prenda> getPrendas() { return prendas; }
}
