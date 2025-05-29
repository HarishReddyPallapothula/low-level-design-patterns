package org.harry.creational_patterns.factory_method;

public class NotificationEmail implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Welcome Email : "+message);
    }
}
