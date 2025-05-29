package org.harry.creational_patterns.factory_method;

public class NotificationFactoryEmail implements NotificationFactory {
    public Notification createNotification() {
        return new NotificationEmail();
    }
}
