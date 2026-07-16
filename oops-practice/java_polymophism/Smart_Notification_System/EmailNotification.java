public class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("------------------------------------------------");
        System.out.println("EMAIL NOTIFICATION");
        System.out.println("Recipient : " + recipientName);
        System.out.println("Message   : " + message);
        System.out.println("Status    : Email Sent Successfully");
    }
}