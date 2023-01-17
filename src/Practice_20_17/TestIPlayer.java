package Practice_20_17;

public class TestIPlayer {
    public static void main(String[] args) {
        Player guitarPlayer = new GuitarPlayer();
        Player pianoPlayer = new PianoPlayer();
        startMusicShow(guitarPlayer);
        startMusicShow(pianoPlayer);
    }
    public static void startMusicShow(Player player){
        player.play();
        if (player instanceof GuitarPlayer){
            ((GuitarPlayer) player).rockAndRoll();
            }
        if (player instanceof PianoPlayer){
            ((PianoPlayer) player).playJazz();
        }
    }
}
