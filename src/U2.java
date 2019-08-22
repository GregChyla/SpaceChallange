public class U2 extends Rocket {

    int cost = 120;
    int weight = 18000;
    int maxWeight = 29000;
    double cargoLimit = maxWeight - weight;
    int cargoCarried = 0;
    double launchExplosionChance = (cargoCarried / cargoLimit) * 0.04;
    double landCrashChance = (cargoCarried / cargoLimit) * 0.08;

    @Override
    public boolean launch() {
        return super.launch();
    }

    @Override
    public boolean land() {
        return super.land();
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCargoLimit() {
        return cargoLimit;
    }

    public void setCargoLimit(int cargoLimit) {
        this.cargoLimit = cargoLimit;
    }

    public int getCargoCarried() {
        return cargoCarried;
    }

    public void setCargoCarried(int cargoCarried) {
        this.cargoCarried = cargoCarried;
    }

    public double getLaunchExplosionChance() {
        return launchExplosionChance;
    }

    public void setLaunchExplosionChance(double launchExplosionChance) {
        this.launchExplosionChance = launchExplosionChance;
    }

    public double getLandCrashChance() {
        return landCrashChance;
    }

    public void setLandCrashChance(double landCrashChance) {
        this.landCrashChance = landCrashChance;
    }
}
