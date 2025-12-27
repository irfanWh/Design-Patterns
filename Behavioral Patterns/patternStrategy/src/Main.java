import Strategy.IStrategy;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Contexe contexe=new Contexe();
        Scanner scanner=new Scanner(System.in);
//        contexe.process();
//        contexe.setStrategy(new StgImplt1());
//        contexe.process();
//        contexe.setStrategy(new StgImplt2());
//        contexe.process();
//        contexe.setStrategy(new StgImplt3());
//        contexe.process();
        while (true){
            System.out.println("Donner la strategy:");
            String strategyName=scanner.nextLine();
            if (strategyName.equals("quit")){
                break;
            }
            IStrategy strategy=(IStrategy) Class.forName(strategyName).newInstance();
            contexe.setStrategy(strategy);
            contexe.process();
        }
    }
}