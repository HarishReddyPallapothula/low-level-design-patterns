package org.harry.creational_patterns.factory_method;

public class NotificationPush implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Are you trying to login please approve this push request : "+message);
    }
}
