package creational.factory.notification;

import creational.factory.notification.impl.EmailNotification;
import creational.factory.notification.impl.SMSNotification;

/**
 * Patrón Factory
 * Propósito: Proveer una forma de crear objetos, delegando la lógica de creación a subclases.
 */
public class NotificationFactory {

    public Notification createNotification(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SMSNotification();
            default -> throw new IllegalArgumentException("Tipo de notificación inválido");
        };
    }
}
