package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Forecast {

    private TemperatureService service;

    public float getForcast(String city) {
        float sum = 0;
        for (int i = -10; i < 0; i++) {
            float temp = service.getTemperatureFor(city, i);
            sum += temp;
        }
        return sum/10;
    }

    public static void main(String[] args) {
        float result = new Forecast(
                new ConverterTemperatureService(
                new RetryTemperatureService(
                new ConcreteTemperatureService())))
                .getForcast("Budapest");
        System.out.println(result);
    }
}
