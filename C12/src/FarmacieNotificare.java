import java.util.ArrayList;
import java.util.List;

public class FarmacieNotificare implements ISubiect{
    private List<IObserver> observers=new ArrayList<>();
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
          observers.remove(observer);
    }

    @Override
    public void notifyAll(String mesaj) {
        for (IObserver observer : observers) {
            observer.getMesaj(mesaj);
        }
    }
}
