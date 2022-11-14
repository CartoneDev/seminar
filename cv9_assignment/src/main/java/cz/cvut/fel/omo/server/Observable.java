package cz.cvut.fel.omo.server;

public interface Observable {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObservers();
}
