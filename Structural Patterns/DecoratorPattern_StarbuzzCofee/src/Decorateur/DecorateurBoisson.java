package Decorateur;

import Boissons.Boisson;

public abstract class DecorateurBoisson extends Boisson {
    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

//    @Override
//    public String getDescription() {
//        return super.getDescription();
//    } // pas comme ca mais on definit abstract une methode qui n'est pas abstract
    @Override
    public abstract String getDescription();
}
