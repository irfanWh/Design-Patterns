package Decorateur;

import Boissons.Boisson;

public class Caramel extends DecorateurBoisson{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" et caramel";
    }

    @Override
    public double cout() {
        return 3.6 + boisson.cout();
    }
}
