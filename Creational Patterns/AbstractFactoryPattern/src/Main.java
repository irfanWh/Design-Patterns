import com.sun.source.util.Plugin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //implimentation statique
        AbstractFactory factory1 = new FactoryImplA();
        AbstarctPlugin plugin1 = factory1.getInstance();
        plugin1.traitement();

        //implementation dynamique
        AbstractFactory factory2 = (AbstractFactory) Class.forName("FactoryImplB").newInstance();
        AbstarctPlugin plugin2 = factory2.getInstance();
        plugin2.traitement();
    }
}