public class Main {
    public static void main(String[] args) {

        Pizzeria brest = new PizzeriaBrest();
        Pizzeria strasbourg = new PizzeriaStrasbourg();

        System.out.println("Commande Pizza Fromage Brest");
        brest.commanderPizza("fromage");

        System.out.println("\nCommande Pizza Fruits de mer Brest");
        brest.commanderPizza("fruits de mer");

        System.out.println("\nCommande Pizza Fromage Strasbourg");
        strasbourg.commanderPizza("fromage");

        System.out.println("\nCommande Pizza Fruits de mer Strasbourg");
        strasbourg.commanderPizza("fruits de mer");
    }
}
