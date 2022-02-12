package Factory;

public class Pizza {
    String type;


    void prepare(){
        System.out.println("preparing pizza");
    }
    void bake(){
        System.out.println("baking pizza");
    }
    void cut(){
        System.out.println("cutting pizza");
    }
    void box(){
        System.out.println("boxing pizza");
    }

    Pizza orderPizza(String type){
        Pizza pizza ;
        if (type.equals("Clam")){
            pizza = new ClamPizza();
        } else if (type.equals("Pepperoni")){
            pizza = new PepperoniPizza();
        } else {
            pizza = new CheesePizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
