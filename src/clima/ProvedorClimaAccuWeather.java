package clima;

import java.util.List;
import java.util.Map;

public class ProvedorClimaAccuWeather implements ProvedorClima {
    @Override
    public int getTemperaturaBsAs() {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
        return (int) condicionesClimaticas.get(0).get("PrecipitationProbability"); //Devuelve un número del 0 al 1
    }
}
