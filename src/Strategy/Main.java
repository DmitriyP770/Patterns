package Strategy;
// Задача создать уток
public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        mallardDuck.display();
        mallardDuck.fly();
        redHeadDuck.quack();
        mallardDuck.swim();
// теперь у нас появилась резиновая утка, для которой пришлось переопределять флай - она не летает, и крякание
    RubberDuck rubberDuck = new RubberDuck();
    rubberDuck.quack();
    }

}
