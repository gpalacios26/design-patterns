package behavioral.observer.news;

import java.util.ArrayList;
import java.util.List;

/**
 * Patrón Observer
 * Propósito: Notificar a varios objetos cuando cambia el estado de otro objeto.
 */
public class NewsPublisher {

    private final List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
}
