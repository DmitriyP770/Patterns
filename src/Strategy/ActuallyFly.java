package Strategy;

public class ActuallyFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("flying");
    }
}
