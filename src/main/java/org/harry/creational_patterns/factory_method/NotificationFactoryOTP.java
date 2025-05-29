package org.harry.creational_patterns.factory_method;

public class NotificationFactoryOTP implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new NotificationOTP();
    }
}
