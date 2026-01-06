// Fabrique dérivée de Brest
public class FabriqueIngredientsPizzaStrasbourg implements FabriqueIngredientsPizza {

    public Pate creerPate() { return new PateSoufflee(); }

    public Sauce creerSauce() { return new SauceTomatesCerise(); }

    public Fromage creerFromage() { return new Mozzarella(); }

    public Legumes creerLegumes() { return new LegumesStrasbourg(); }

    public Poivrons creerPoivrons() { return new PoivronsStrasbourg(); }

    public Moules creerMoules() { return new MoulesSurgeles(); }
}
