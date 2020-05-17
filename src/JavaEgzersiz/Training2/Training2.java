package JavaEgzersiz.Training2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Training2 {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
//        egzersiz1();
//        egzersiz2();
        egzersiz3();
    }

    public static void egzersiz1() {
//        kullanicidan 5 ogrencinin vize final ve butunleme notlarini girmesini istiyelim. Hepsi ayri ayri guruplansin.
        System.out.println("Lütfen 5 öğrencinin vize, final ve bütünleme notlarini hazirlayiniz");
        List<Integer> vize = new ArrayList<>();
        List<Integer> finall = new ArrayList<>();
        List<Integer> butunleme = new ArrayList<>();

        Double ortalama = 0.00;
        Integer vizeNotu = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Lütfen" + " " + i + ".  öğrencinin vize notunu giriniz");
            vizeNotu = girdi.nextInt();
            vize.add(vizeNotu);
            System.out.println("Lütfen" + " " + i + ".  öğrencinin final notunu giriniz");
            int finalNotu = girdi.nextInt();
            finall.add(finalNotu);
            ortalama = (double) (finalNotu + vizeNotu) / 2;
            if (ortalama <= 35) {
                System.out.println("Lütfen" + " " + i + ".  öğrencinin butunleme notunu giriniz");
                int butNotu = girdi.nextInt();
                butunleme.add(butNotu);
            }
        }
        for (Integer vizeNotlari : vize) {
            System.out.println(" vize notlari=" + " " + vizeNotlari);
        }
//        for (int i = 0; i < vize.size(); i++) {
//            Integer vizeNot = vize.get(i);
//            System.out.println(vizeNot);
//        }
        for (Integer finalNotlari : finall) {
            System.out.println(" final notlari=" + " " + finalNotlari);
        }
        for (Integer butNotlari : butunleme) {
            System.out.println(" butunleme notlari=" + " " + butNotlari);
        }
    }

    public static void egzersiz2() {
//        kullanıcıdan bir paragraf girmesi istenir. Bu paragrafin icerisinde "sevgi" kelimesinin goruldugu ilk noktadan paragrafın sonuna kadar olan bolumu kesip yazdir.
        System.out.println("lutfen icinde sevgi gecen bir paragraf giriniz");
        String girilenCumle = girdi.nextLine();
        int ilkSevgiDegeri = girilenCumle.indexOf("sevgi");
        String hedefCumle = girilenCumle.substring(ilkSevgiDegeri);
        System.out.println("sevgi kelimesinden sonraki kisim=" + hedefCumle);


    }

    // 1-100 sayilardan tek olanlari, çift olanlar ve asal olanlari ekrana yazdir.
    public static void egzersiz3() {
        Integer tek = 0;
        Integer cift = 0;
        Integer asal = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("çift sayi" + i);
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("tek sayi" + i);
            }
        }
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i-1; j++) {
                if (i%i==0 && i%1==0 && i%j!=0){
                    System.out.println("asal sayi"+i);
                }
            }
        }


    }


}

