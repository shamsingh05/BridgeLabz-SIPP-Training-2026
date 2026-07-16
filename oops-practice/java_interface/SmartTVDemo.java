interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming subscription active.");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming subscription active.");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    public void playGame() {
        System.out.println("Playing game...");
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {
        String[] movies = {"Avengers", "Inception", "Interstellar"};
        String[] games = {"FIFA", "Minecraft", "GTA V"};

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}
