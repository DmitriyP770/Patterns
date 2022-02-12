package Factory;

public abstract class Pizza {
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



}
