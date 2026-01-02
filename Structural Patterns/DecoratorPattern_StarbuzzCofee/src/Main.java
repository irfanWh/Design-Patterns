import Boissons.Boisson;
import Boissons.Espresso;
import Decorateur.Caramel;
import Decorateur.Chocolat;
import Decorateur.Noisette;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}