package Strategy;

public class DecoyDuck extends Duck {
    @Override
    void display() {
        System.out.println("Decoy's Duck picture");

            }

    public DecoyDuck() {
        flyable = new NoFlying();
        quackable = new NoQuack();
    }
}
