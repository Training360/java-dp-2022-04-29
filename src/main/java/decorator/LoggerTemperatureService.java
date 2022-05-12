package decorator;

import java.time.LocalDateTime;

public class LoggerTemperatureService implements TemperatureService{

    private TemperatureService service;

    public LoggerTemperatureService(TemperatureService service) {
        this.service = service;
    }

    @Override
    public float getTemperatureFor(String city, int days) {
        System.out.println(LocalDateTime.now() + " temperature hívása " + city);
        var temp = service.getTemperatureFor(city, days);
        return temp;
    }
}
