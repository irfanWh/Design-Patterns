public class FactoryImplA implements AbstractFactory{
    @Override
    public AbstarctPlugin getInstance() {
        return new PluginImplA();
    }
}
