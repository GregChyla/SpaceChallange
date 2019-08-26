import java.util.Random;

public class U2 extends Rocket {

    int cost = 120;
    private int weight = 18000;
    private int maxWeight = 29000;
    double cargoLimit = maxWeight - weight;
    int cargoCarried = 0;
    double launchExplosionChance = (cargoCarried / cargoLimit) * 0.04;
    double landCrashChance = (cargoCarried / cargoLimit) * 0.08;

    @Override
    public boolean launch(int cargoCarried) {

        launchExplosionChance = cargoCarried / cargoLimit * 0.05;
        Random random = new Random();
        double randomDouble = random.nextDouble()/10;

        if (randomDouble > launchExplosionChance){ return true; }
        else { return false; }
    }

    @Override
    public boolean land(int cargoCarried) {

        landCrashChance = cargoCarried / cargoLimit * 0.01;
        Random random = new Random();
        double randomDouble = random.nextDouble()/10;

        if (randomDouble > landCrashChance){ return true; }
        else { return false; }
    }
}
