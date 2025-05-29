package org.harry.creational_patterns.factory_method;

public class NotificationFactoryPush implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new NotificationPush();
    }
}
