package Strategy;

public class MallardDuck  extends Duck{
    //поведение реализуется за счет других объектов

    public MallardDuck() {
        flyable = new ActuallyFly();
        quackable = new ActuallyQuack();
    }

    @Override
    void display() {
        System.out.println("Picture of Mallard Duck");
    }
}
