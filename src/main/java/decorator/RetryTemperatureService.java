package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RetryTemperatureService implements TemperatureService {

    private TemperatureService target;

    private int delay;

    @Override
    public float getTemperatureFor(String city, int days) {
        float result = 0;
        int counter = 1;
        do {
            if (counter > 1) {
                try {
                    Thread.sleep(delay);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
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

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
