public class Main {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Bittu", "Welcome to our website!"),
                new SMSNotification("Rahul", "Your OTP is 458921"),
                new PushNotification("Priya", "50% Discount Available Today!")
        };

        System.out.println("========== SMART NOTIFICATION SYSTEM ==========\n");

        for (Notification notification : notifications) {
            notification.sendNotification();
            System.out.println();
        }

        System.out.println("All notifications have been sent successfully.");
    }
}