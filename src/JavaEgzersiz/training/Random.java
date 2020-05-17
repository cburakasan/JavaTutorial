package JavaEgzersiz.training;

import java.util.ArrayList;
import java.util.List;

public class Random {
    public static void main(String[] args) {
        List<Aylar> aylar = new ArrayList<>();
        aylar.add(Aylar.OCAK);
        aylar.add(Aylar.SUBAT);
        aylar.add(Aylar.MART);
        aylar.add(Aylar.NISAN);
        aylar.add(Aylar.MAYIS);
        aylar.add(Aylar.HAZIRAN);
        aylar.add(Aylar.TEMMUZ);
        aylar.add(Aylar.AGUSTOS);
        aylar.add(Aylar.EYLUL);
        aylar.add(Aylar.EKIM);
        aylar.add(Aylar.KASIM);
        aylar.add(Aylar.ARALIK);
        java.util.Random random = new java.util.Random();
        int randomAyDegeri = random.nextInt(11);
        Aylar ay = aylar.get(randomAyDegeri);
        System.out.println(ay);
    }

}
