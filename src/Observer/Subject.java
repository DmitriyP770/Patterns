package Observer;

import java.util.ArrayList;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void  notifyObserver();
}
