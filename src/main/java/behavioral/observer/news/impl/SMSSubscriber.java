package behavioral.observer.news.impl;

import behavioral.observer.news.Subscriber;

public class SMSSubscriber implements Subscriber {

    @Override
    public void update(String news) {
        System.out.println("SMS recibido con noticia: " + news);
    }
}
