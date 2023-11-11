package ua.hillel.home_work_22;

public class PopMusic extends MusicStyles {

    @Override
    public void styleMusic() {
        System.out.println("\nStyle of music is Pop-music.");
    }

    @Override
    public void bands() {
        System.out.println("Pop bands and artists: Coldplay, Simple plan, Avril Lavigne, " +
                "Imagine Dragons.");
    }

    @Override
    public void playMusic() {
        System.out.println("These bands and artists play Pop music.");
    }
}
