package br.com.hrom.observer.observer;

public interface Observable<T> {
    void registerObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    public void notifyObservers(T data);
}
