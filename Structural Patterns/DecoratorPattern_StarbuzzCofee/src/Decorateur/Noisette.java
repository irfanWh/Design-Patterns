package Decorateur;

import Boissons.Boisson;

public class Noisette extends DecorateurBoisson{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" avec noisse";
    }

    @Override
    public double cout() {
        return 5.1 + boisson.cout();
    }
}
