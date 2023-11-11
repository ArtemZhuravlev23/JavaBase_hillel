package ua.hillel.home_work_22;

public class ClassicMusic extends MusicStyles {

    @Override
    public void styleMusic() {
        System.out.println("\nStyle of music is Pop-music.");
    }

    @Override
    public void bands() {
        System.out.println("Classic bands and artists: Johann Sebastian Bach, " +
                "Ludwig van Beethoven, Vivaldi.");
    }

    @Override
    public void playMusic() {
        System.out.println("These bands and artists play Classical music.");
    }
}
