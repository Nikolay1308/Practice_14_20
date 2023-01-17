package Exercise_8;

public class FootballTeam {
    String name;
    String country;
    String[] listPlayers;
    int rating;

    public FootballTeam(String name, String country, String[] listPlayers, int rating) {
        this.name = name;
        this.country = country;
        this.listPlayers = new String[11];
        this.rating = rating;
    }
    public void changeRating(int rating) {
        this.rating = rating;
    }
    public void replacePlayer (String newPlayer, String oldPlayer) {
        for (int i = 0; i < this.listPlayers.length; i++) {
            if (listPlayers[i].equals(oldPlayer)) listPlayers[i] = newPlayer;
        }
    }
}

