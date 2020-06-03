package atuendo;

import clima.ProvedorClima;

import java.util.List;
import java.util.stream.Collectors;

public class AsesorDeImagen {

    private ProvedorClima provedorClima;

    public AsesorDeImagen(ProvedorClima provedorClima) {
        this.provedorClima = provedorClima;
    }

    public Atuendo obtenerSugerencia(List<Atuendo> atuendos){
        int temperatura = provedorClima.getTemperaturaBsAs();

        List<Atuendo> atuendosAptos = atuendos.stream()
                .filter(atuendo -> atuendo.atuendoAptoParaTemperatura(temperatura)).collect(Collectors.toList());

        return atuendosAptos.get(0);
    }
}
