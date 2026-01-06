public class PizzaFruitsDeMer extends Pizza {

    FabriqueIngredientsPizza ingredientFactory;

    public PizzaFruitsDeMer(FabriqueIngredientsPizza ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void preparer() {
        System.out.println("Préparation de " + nom);
        pate = ingredientFactory.creerPate();
        sauce = ingredientFactory.creerSauce();
        fromage = ingredientFactory.creerFromage();
        moules = ingredientFactory.creerMoules();
    }
}
