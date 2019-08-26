public interface SpaceShip {
    boolean launch(int cargoCarried);
    boolean land(int cargoCarried);
    boolean canCarry(Item Item); //returns true if the rocket can carry such item or false if it will exceed the weight limit
    boolean carry (Item Item); //takes an Item object and updates the current weight of the rocket.

}
