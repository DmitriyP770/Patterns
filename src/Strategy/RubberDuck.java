package Strategy;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyable = new NoFlying();
        quackable = new PickQuack();
    }

    @Override
    void display() {
        System.out.println("Rubber Duck picture");
    }


}
