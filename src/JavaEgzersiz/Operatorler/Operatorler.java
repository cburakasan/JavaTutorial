package JavaEgzersiz.Operatorler;

public class Operatorler {
    public static void main(String[] args) {
//        toplam();
//        stringVeIntıgerDegerleriToplama();
//        atamaVeToplamaOperatoru();
        durumOperatorleri();

    }

    public static void toplam() {
        Integer sayi1 = 15;
        Integer toplam = sayi1 + 5;
        System.out.println(toplam);

        Integer sayi2 = 22;
        toplam = toplam + sayi2;
        System.out.println("burak" + toplam);
    }

    public static void stringVeIntıgerDegerleriToplama() {
        Integer deger = 4;
        String deger2 = "16";
        String sonuc = deger + deger2;/*
        deger atama yapmak icin atamak istediğimiz yapinin sonuna noktalivirgul koyulduktan sonra alt+enter komutuyla girilir ikinci secenek secilip deger atanir
        */
        System.out.println(sonuc);

    }

    public static void atamaVeToplamaOperatoru() {
        Integer deger = 17;
        Integer degerCikarma = 20;
        deger = deger + 7;
        deger += 7;//toplama islemi bu sekilde de yapılabilir.
        degerCikarma -= 2;
        System.out.println(deger);
        System.out.println(degerCikarma);

    }


    public static void durumOperatorleri() {
        int x = 17;
        Integer y = 30;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);

    }


}