package Strategy;

public class RubberDuck extends Duck{
    @Override
    void fly() {

    }

    @Override
    void display() {
        System.out.println("Rubber Duck picture");
    }

    @Override
    void quack() {
        System.out.println("pick-pick");
    }
}
