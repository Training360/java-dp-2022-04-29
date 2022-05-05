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
        var target = new ConcreteTemperatureService();
        var retry = new RetryTemperatureService(target, 100);
        var converter = new ConverterTemperatureService(retry,
                t -> 3 * t);


        retry.setDelay(200);
        converter.setFunction(t -> 4 * t);

        float result = new Forecast(
                converter)
                .getForcast("Budapest");
        System.out.println(result);
    }
}
