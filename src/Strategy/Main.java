package Strategy;
// Задача создать уток
public class Main {
    public static void main(String[] args) {
       Duck mallardDuck = new MallardDuck();
       Duck redHeadDuck = new RedHeadDuck();
        mallardDuck.display();

        mallardDuck.swim();
        mallardDuck.performQuack();
        redHeadDuck.performFly();
// теперь у нас появилась резиновая утка, для которой пришлось переопределять флай - она не летает, и крякание
    RubberDuck rubberDuck = new RubberDuck();
    rubberDuck.performQuack();
//Теперь у нас есть деревянная утка, которая ни летает, ни квакает
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();

    }


}
