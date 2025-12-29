public class ObsImpl1 implements Observer{
    @Override
    public void update(Observable obsle) {
        int state=((ObsbleImpl)obsle).getState();
        double res=state*state+9;
        System.out.println("nouvel mise a jour state="+state);
        System.out.println("resultat="+res);
    }
}
