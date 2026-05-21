
// O — Open/Closed Principle (OCP)

// Software entities should be open for extension but closed for modification.
// Add new notification types without changing existing code.



interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending Email");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS");
    }
}

class NotificationService {
    void sendNotification(Notification notification) {
        notification.send();
    }
}


public class OCPMain {
    public static void main(String[] args) {
        // Create the high-level service orchestrator
        NotificationService notificationService = new NotificationService();

        // 1. Send an Email Notification
        Notification email = new EmailNotification();
        System.out.println("--- Triggering Email ---");
        notificationService.sendNotification(email);

        System.out.println(); // Just for a clean line break

        // 2. Send an SMS Notification
        Notification sms = new SMSNotification();
        System.out.println("--- Triggering SMS ---");
        notificationService.sendNotification(sms);
    }
}