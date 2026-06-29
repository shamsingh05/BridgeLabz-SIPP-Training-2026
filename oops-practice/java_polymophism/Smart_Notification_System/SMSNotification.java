public class SMSNotification extends Notification {

    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("------------------------------------------------");
        System.out.println("SMS NOTIFICATION");
        System.out.println("Recipient : " + recipientName);
        System.out.println("Message   : " + message);
        System.out.println("Status    : SMS Sent Successfully");
    }
}