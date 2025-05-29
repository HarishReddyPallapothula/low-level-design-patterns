package org.harry.creational_patterns.factory_method;
// Imagine we’re building an enterprise notification system that sends notifications via Email, SMS, or Push.
// These could be triggered by events like password resets, transaction alerts, or marketing campaigns.
// You want to:
// Abstract away the logic of how these notification types are created.
// Allow for extension (e.g., adding WhatsApp or Slack in the future).
// Adhere to SOLID principles (especially Open/Closed and Single Responsibility).

public class FactoryMethodMain {
    //we can call the required factory based on the requirements based on the client request or based on the
    // environment config file. By that we can achieve run-time polymorphism.

    //Process events with different payload types (e.g., from Kafka or RabbitMQ) and route them to different processors.
    // as the focus is more on pattern didn't implement request or config stuff.
    public static void factoryMethodMain(){
        NotificationService emailService = new NotificationService(new NotificationFactoryEmail());
        emailService.send("Welcome to the world of design Patterns");

        NotificationService pushService = new NotificationService(new NotificationFactoryPush());
        pushService.send("Click on approve");

        NotificationService OTP_Service = new NotificationService(new NotificationFactoryOTP());
        OTP_Service.send("12345 is your OTP");

    }
}
