public class Rocket implements SpaceShip {

    @Override  //will be overridden in U1 and U2 class
    public boolean launch() {
        return false;
    }

    @Override //will be overridden in U1 and U2 class
    public boolean land() {
        return false;
    }

    @Override //implement here
    public boolean canCarry(Item Item) {
        return false;
    }

    @Override //implement here
    public boolean carry(Item Item) {
        return false;
    }


}
