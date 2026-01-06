public abstract class Pizza {
    String nom;

    Pate pate;
    Sauce sauce;
    Fromage fromage;
    Legumes legumes;
    Poivrons poivrons;
    Moules moules;

    public abstract void preparer();

    public void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }

    public void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    public void emballer() {
        System.out.println("Mise en boîte officielle de la pizzeria");
    }

    public String getNom() {
        return nom;
    }
}
