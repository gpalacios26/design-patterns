package behavioral.observer;

import behavioral.observer.news.NewsPublisher;
import behavioral.observer.news.Subscriber;
import behavioral.observer.news.impl.EmailSubscriber;
import behavioral.observer.news.impl.SMSSubscriber;

public class Main {

    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        Subscriber emailSubscriber = new EmailSubscriber();
        Subscriber smsSubscriber = new SMSSubscriber();

        publisher.subscribe(emailSubscriber);
        publisher.subscribe(smsSubscriber);

        publisher.publishNews("Nueva funcionalidad en la aplicación");
    }
}
