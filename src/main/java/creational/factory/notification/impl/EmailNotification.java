package creational.factory.notification.impl;

import creational.factory.notification.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando notificación por Email");
    }
}
