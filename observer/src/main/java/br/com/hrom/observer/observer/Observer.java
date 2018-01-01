package br.com.hrom.observer.observer;

public interface Observer<T> {

    void notify(T data);
}
