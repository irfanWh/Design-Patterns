package Boissons;

public class Espresso extends Boisson {
    public Espresso() {
        description="esprisso description";
    }

    @Override
    public double cout() {
        return 12;
    }
}
