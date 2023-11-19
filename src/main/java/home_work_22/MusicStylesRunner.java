package home_work_22;

public class MusicStylesRunner {

    public static void main(String[] args) {

        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicBand = new ClassicMusic();

        MusicStyles[] bands = {popBand, rockBand, classicBand};

        for (MusicStyles band : bands) {
            band.bands();
            band.playMusic();
        }
    }
}
