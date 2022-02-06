package Strategy;
// Реализация поведения флай и квак в отдельных классах, а не в классе Дак
public abstract class Duck {
    Flyable flyable ;
    Quackable quackable;

    public Duck() {
    }

    abstract void display();
    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void performFly(){
        flyable.fly();
    }
    public void performQuack(){
        quackable.quack();
    }
}
