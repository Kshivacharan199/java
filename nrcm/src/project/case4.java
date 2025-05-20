package project;

interface Equipment {
    void showEquipment();
}

interface Player {
    void showPlayers();
}

class Sport {
    void favoriteSport() {
        System.out.println("Favorite Sport: Soccer");
    }
}

class Match extends Sport implements Equipment, Player {
    public void upcomingEvents() {
        System.out.println("Upcoming Events: League Finals, Charity Cup, World Tournament");
    }

    public void showEquipment() {
        System.out.println("Essential Equipment: Soccer Ball, Cleats, Shin Guards");
    }

    public void showPlayers() {
        System.out.println("Star Players: Lionel Messi, Cristiano Ronaldo, Neymar Jr.");
    }
}

public class case4 {
    public static void main(String[] args) {
        Sport s1 = new Sport();
        Match m1 = new Match();

        m1.showEquipment();
        m1.showPlayers();
        m1.upcomingEvents();
        s1.favoriteSport();
    }
}



