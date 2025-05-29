package org.harry.creational_patterns.factory_method;

public class NotificationOTP implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Please dont share this OTP with anyone, if you didnt request please report it immediately : "+ message);
    }
}
