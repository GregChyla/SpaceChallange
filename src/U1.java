 import java.util.Random;

public class U1 extends Rocket {

    int cost = 100;
    int weight = 10000;
    int maxWeight = 18000;
    double cargoLimit = maxWeight - weight;
    int cargoCarried = 0;
    double launchExplosionChance = (cargoCarried / cargoLimit) * 0.05;
    double landCrashChance = (cargoCarried / cargoLimit) * 0.01;

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

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public double getCargoLimit() {
        return cargoLimit;
    }

    public int getCargoCarried() {
        return cargoCarried;
    }

    public void setCargoCarried(int cargoCarried) {
        this.cargoCarried = cargoCarried;
    }

    public void setLaunchExplosionChance(double launchExplosionChance) {
        this.launchExplosionChance = launchExplosionChance;
    }

    public void setLandCrashChance(double landCrashChance) {
        this.landCrashChance = landCrashChance;
    }
}
