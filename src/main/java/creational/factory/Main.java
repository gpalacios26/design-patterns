package creational.factory;

import creational.factory.notification.Notification;
import creational.factory.notification.NotificationFactory;
import creational.factory.notification.NotificationType;

public class Main {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        System.out.println("Creando notificación de tipo EMAIL");
        Notification notification = factory.createNotification(NotificationType.EMAIL);
        notification.notifyUser();

        System.out.println("Creando notificación de tipo SMS");
        notification = factory.createNotification(NotificationType.SMS);
        notification.notifyUser();
    }
}
