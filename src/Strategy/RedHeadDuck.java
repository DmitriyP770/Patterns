package Strategy;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackable = new ActuallyQuack();
        flyable = new ActuallyFly();
    }

    @Override
    void display() {
        System.out.println("Picture of Redhead Duck");
    }
}
