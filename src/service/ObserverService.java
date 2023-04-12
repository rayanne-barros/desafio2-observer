package service;

import model.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverService {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(String mensagem){
        observers.stream()
                .forEach(observer -> observer.atualizar(mensagem));

    }
}
