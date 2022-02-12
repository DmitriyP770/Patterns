package Factory;

public class SimplePizzaFactory {
//Вынесли процесс создания экземпляра пиццы из Стора в Фабрику
   Pizza createPizza(String type){
      Pizza pizza;
      if (type.equals("Clam")){
         pizza = new ClamPizza();
      } else if (type.equals("Pepperoni")){
         pizza = new PepperoniPizza();
      } else {
         pizza = new CheesePizza();

      }
      return pizza;
   }
}
