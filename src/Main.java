import model.ObserverAgua;
import model.ObserverCeu;
import model.ObserverTerra;
import service.ObserverService;

public class Main {
    public static void main(String[] args) {
        double numeroRound1 = Math.random();
        double numeroRound2 = Math.random();

        ObserverService observable = new ObserverService();

        ObserverCeu observerCeu = new ObserverCeu();
        ObserverAgua observerAgua = new ObserverAgua();
        ObserverTerra observerTerra = new ObserverTerra();

        observable.registerObserver(observerCeu);
        observable.registerObserver(observerAgua);
        observable.registerObserver(observerTerra);

        // Round 1
        System.out.println("Round1:");

        if (numeroRound1 < 0.2) {
            observable.notifyObservers("eclipse lunar iniciou");
        } else if (numeroRound1 < 0.7) {
            observable.notifyObservers("alga rara");
        } else {
            observable.notifyObservers("wally");
        }

        // Round 2
        System.out.println("Round 2:");

        if (numeroRound2 < 0.2) {
            observable.notifyObservers("eclipse lunar terminou");
        } else if (numeroRound2 < 0.7) {
            observable.notifyObservers("alga rara");
        } else {
            observable.notifyObservers("wally");
        }
    }
}
