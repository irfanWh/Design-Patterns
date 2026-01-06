// Pizzeria de Strasbourg
public class PizzeriaStrasbourg extends Pizzeria {

    protected Pizza creerPizza(String type) {

        Pizza pizza = null;
        FabriqueIngredientsPizza fabrique =
                new FabriqueIngredientsPizzaStrasbourg();

        if (type.equals("fromage")) {
            pizza = new PizzaFromage(fabrique);
            pizza.nom = "Pizza au fromage style Strasbourg";
        }

        else if (type.equals("fruits de mer")) {
            pizza = new PizzaFruitsDeMer(fabrique);
            pizza.nom = "Pizza Fruits de Mer style Brest";
        }

        return pizza;
    }
}
