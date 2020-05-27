package atuendo;

import clima.ProvedorClima;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ropero {

    private List<Atuendo> atuendos;

    public Ropero() {
        atuendos = new ArrayList<>();
    }

    public void agregarAtuendo(Atuendo atuendo){
        atuendos.add(atuendo);
    }

    public Atuendo obtenerSugerencia(ProvedorClima provedorClima){
        int temperatura = provedorClima.getTemperaturaBsAs();

        List<Atuendo> atuendosAptos = atuendos.stream()
                .filter(atuendo -> atuendo.atuendoAptoParaTemperatura(temperatura)).collect(Collectors.toList());

        return atuendosAptos.get(0);
    }
}
