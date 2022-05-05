package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConverterTemperatureService implements  TemperatureService {

    private TemperatureService temperatureService;

    @Override
    public float getTemperatureFor(String city, int days) {
        return temperatureService.getTemperatureFor(city, days) * 2;
    }
}
