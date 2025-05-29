package org.harry.creational_patterns.factory_method;

public class NotificationService {
    NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory){
        this.notificationFactory = notificationFactory;
    }
    void send(String message){
        Notification notification = notificationFactory.createNotification();
        notification.notifyUser(message);
    }
}
