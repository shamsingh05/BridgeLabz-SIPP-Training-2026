interface TextModeration {
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("badword");
    }
}

interface SpamDetection {
    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam content allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {
        String[] posts = {
            "Hello everyone",
            "Buy now and get 50% off",
            "This contains badword",
            "Learning Java interfaces"
        };

        ContentModerator cm = new ContentModerator();

        cm.displayModerationPolicy();

        for (String post : posts) {
            if (cm.isSpam(post)) {
                System.out.println("Spam Post: " + post);
            } else if (cm.isOffensive(post)) {
                System.out.println("Offensive Post: " + post);
            } else {
                System.out.println("Valid Post: " + post);
            }
        }
    }
}
