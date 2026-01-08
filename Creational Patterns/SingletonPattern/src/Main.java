//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        President president1 = President.getInstance();
        President president2 = President.getInstance();
        System.out.println(president2 == president1);
    }
}