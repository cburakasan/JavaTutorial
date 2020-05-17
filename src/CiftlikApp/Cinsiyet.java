package CiftlikApp;

import java.util.Random;

public enum Cinsiyet {
    comus,
    manda;

    public static Cinsiyet getRandomCinsiyet() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }



}
