package Strategy;

public abstract class Duck {
    void quack(){
        System.out.println("quack-quack");
    }
    void fly(){
        System.out.println("flying");
    }
    abstract void display();
}
