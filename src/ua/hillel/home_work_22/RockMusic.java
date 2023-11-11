package ua.hillel.home_work_22;

public class RockMusic extends MusicStyles {

    @Override
    public void styleMusic() {
        System.out.println("\nStyle of music is Rock music.");
    }

    @Override
    public void bands() {
        System.out.println("Rock bands and artists: The Beatles, Nickelback, Arctic Monkeys, " +
                "Evanescence.");
    }

    @Override
    public void playMusic() {
        System.out.println("These bands and artists play Rock music.");
    }
}
