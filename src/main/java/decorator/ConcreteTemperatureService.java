package decorator;

import java.util.Random;

public class ConcreteTemperatureService implements TemperatureService {

    @Override
    public float getTemperatureFor(String city, int days) {
        // Kimegy a hálózatra, html, kiveszi hőmérsékletet
        System.out.println("Get temp for " + days);
        Random random = new Random();
        int number = random.nextInt(3);
        if (number == 0) {
            System.out.println("Newtork error");
            throw new IllegalStateException("Hálózati hiba");
        }
        System.out.println("Newtork ok");
        return 18;
    }
}
