package JavaEgzersiz.Degiskenler;

public class Degiskenler {
    public static void main(String[] args) {
        String isim = "Burak"; // degiskenin adi isim, degiskenin tipi ise string. İcerigi Burak. "Variable"
        int sayi = 155; // degiskenin adi sayi, tipi integer, degeri 155.
        float ondalikSayi = (float) 1.255;
        float ondalikSayi2 = 1.255F;// camelcase: iki kelimeli bir isim tanımlamamız gerektiginde ikinci kelimenin ilk harfi buyuk yazılır veya alttire ile gecis yapılır.
        Character karakter = 'c';
        Double doubleSayi =1.2554877785d;// Double bir referans tipidir. Yani bir klastır ve içerisinde metodları vardır.
        // İlkel veri( primitive) ve referans veri tipi olayı.
        // primitive tipleri gomuldugu sınıflara 'wrapper classı' denir.

        System.out.println(isim);
        System.out.println(sayi);
        System.out.println(ondalikSayi);
        System.out.println(ondalikSayi2);
        System.out.println(karakter);
        System.out.println(doubleSayi);
        System.out.println(doubleSayi.byteValue());

      //  short sayi2 = (long) 13 ;  long shorta cast edilemez.
    }


}
