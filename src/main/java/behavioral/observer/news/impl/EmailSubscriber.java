package behavioral.observer.news.impl;

import behavioral.observer.news.Subscriber;

public class EmailSubscriber implements Subscriber {

    @Override
    public void update(String news) {
        System.out.println("Email recibido con noticia: " + news);
    }
}
