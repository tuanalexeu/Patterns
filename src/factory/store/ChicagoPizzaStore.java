package factory.store;

import factory.pizzastyle.Pizza;
import factory.pizzastyle.chicagostyle.ChicagoStyleCheesePizza;
import factory.pizzastyle.chicagostyle.ChicagoStyleClamPizza;
import factory.pizzastyle.chicagostyle.ChicagoStylePepperoniPizza;
import factory.pizzastyle.chicagostyle.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
