import Strategy.IStrategy;

public class Contexe {
    private IStrategy strategy;

    public Contexe() {
        this.strategy = new DefaultStgImplt();
    }

    public void process(){
//        if (type==1){
//            System.out.println("algo1");
//        } else if (type==2) {
//            System.out.println("algo2");
//        } else if (type==3) {
//            System.out.println("algo3");
//        } else {
//            System.out.println("algo par default");
//        }
        strategy.applyStrategy();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
