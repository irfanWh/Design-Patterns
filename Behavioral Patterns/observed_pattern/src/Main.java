//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObsbleImpl observable = new ObsbleImpl();
        Observer observer1 = new ObsImpl1();
        Observer observer2 = new ObsImpl2();

        observable.setState(55);
        observable.subscribe(observer1);
        observable.setState(40);
        observable.subscribe(observer2);
        observable.setState(56);
        observable.unsubscribe(observer1);
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable obsle) {// int state pour push method
                System.out.println("nouveau observataur a abonnee"+(((ObsbleImpl)obsle).getState()));
            }
        });
        observable.subscribe(obs->System.out.println("hello"));
        observable.subscribe(obs->{
            System.out.println("anonynom");
            System.out.println("hhhh");
        });
        observable.setState(78);
    }
}