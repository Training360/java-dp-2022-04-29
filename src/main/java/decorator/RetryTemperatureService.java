package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RetryTemperatureService implements TemperatureService {

    private TemperatureService target;

    @Override
    public float getTemperatureFor(String city, int days) {
        float result = 0;
        int counter = 1;
        do {
            System.out.println("trying " + counter);
            try {
                result = target.getTemperatureFor(city, days);
            } catch (IllegalStateException e) {
                result = 0;
            }
            counter++;
        } while (result == 0) ;
        return result;
    }
}
