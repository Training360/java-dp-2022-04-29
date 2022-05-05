package decorator;

import lombok.AllArgsConstructor;

import java.util.function.Function;

@AllArgsConstructor
public class ConverterTemperatureService implements  TemperatureService {

    private TemperatureService temperatureService;

    private Function<Float, Float> function;

    @Override
    public float getTemperatureFor(String city, int days) {
        return function.apply(temperatureService.getTemperatureFor(city, days));
    }

    public void setFunction(Function<Float, Float> function) {
        this.function = function;
    }
}
