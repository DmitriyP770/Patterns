package Strategy;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        mallardDuck.display();
        mallardDuck.fly();
        redHeadDuck.quack();

    }
}
