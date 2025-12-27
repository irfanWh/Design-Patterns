import Strategy.IStrategy;

public class DefaultStgImplt implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("algo par default");
    }
}
