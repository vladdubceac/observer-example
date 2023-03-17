package learning.vladdubceac.observer;

public interface Subject {

    // methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    // method to notify observers of changes
    public void notifyObservers();

    // method to get updates from subject
    public Object getUpdate(Observer obj);
}
