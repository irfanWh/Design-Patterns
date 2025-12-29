public class ObsImpl2 implements Observer{
    @Override
    public void update(Observable obsle) {
        int state=((ObsbleImpl)obsle).getState();
        System.out.println("nouvel obs2 mise à jour state="+state);
        System.out.println("resultat="+(state%2==0?"pair":"imapire"));
    }
}
