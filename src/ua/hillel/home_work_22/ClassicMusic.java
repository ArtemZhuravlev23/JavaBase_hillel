package ua.hillel.home_work_22;

public class ClassicMusic extends MusicStyles {

    @Override
    public void bands() {
        System.out.println("\nClassic bands and artists: Johann Sebastian Bach, " +
                "Ludwig van Beethoven, Vivaldi.");
    }
    @Override
    public void playMusic() {
        System.out.println("These bands and artists play Classical music.");
    }
}
