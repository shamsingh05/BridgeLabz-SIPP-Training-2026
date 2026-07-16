public class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("------------------------------------------------");
        System.out.println("PUSH NOTIFICATION");
        System.out.println("Recipient : " + recipientName);
        System.out.println("Message   : " + message);
        System.out.println("Status    : Push Notification Sent Successfully");
    }
}