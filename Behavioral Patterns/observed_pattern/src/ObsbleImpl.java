import java.util.ArrayList;
import java.util.List;

public class ObsbleImpl implements Observable{
    private List<Observer> observers=new ArrayList<>();
    private int state=10;

    @Override
    public void subscribe(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public void unsubscribe(Observer obs) {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers){
            o.update(this);// pour push method this.state instead this
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
}
