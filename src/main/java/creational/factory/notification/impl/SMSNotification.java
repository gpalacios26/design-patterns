package creational.factory.notification.impl;

import creational.factory.notification.Notification;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando notificación por SMS");
    }
}
