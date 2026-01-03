public class FactoryImplB implements AbstractFactory{
    @Override
    public AbstarctPlugin getInstance() {
        return new PluginImplB();
    }
}
