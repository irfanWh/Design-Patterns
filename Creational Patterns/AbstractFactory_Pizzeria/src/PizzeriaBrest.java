// Pizzeria de Brest
public class PizzeriaBrest extends Pizzeria {

    protected Pizza creerPizza(String type) {

        Pizza pizza = null;
        FabriqueIngredientsPizza fabrique =
                new FabriqueIngredientsPizzaBrest();

        if (type.equals("fromage")) {
            pizza = new PizzaFromage(fabrique);
            pizza.nom = "Pizza au fromage style Brest";
        }

        else if (type.equals("fruits de mer")) {
            pizza = new PizzaFruitsDeMer(fabrique);
            pizza.nom = "Pizza Fruits de Mer style Brest";
        }

        return pizza;
    }
}
