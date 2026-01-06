public class PizzaFromage extends Pizza {

    FabriqueIngredientsPizza ingredientFactory;

    public PizzaFromage(FabriqueIngredientsPizza ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void preparer() {
        System.out.println("Préparation de " + nom);
        pate = ingredientFactory.creerPate();
        sauce = ingredientFactory.creerSauce();
        fromage = ingredientFactory.creerFromage();
        legumes = ingredientFactory.creerLegumes();
        poivrons = ingredientFactory.creerPoivrons();
    }
}
