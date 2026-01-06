// Fabrique dérivée de Brest
public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza {

    public Pate creerPate() { return new PateFine(); }

    public Sauce creerSauce() { return new SauceMarinara(); }

    public Fromage creerFromage() { return new ParmigianoReggiano(); }

    public Legumes creerLegumes() { return new LegumesBrest(); }

    public Poivrons creerPoivrons() { return new PoivronsBrest(); }

    public Moules creerMoules() { return new MoulesFraiches(); }
}
