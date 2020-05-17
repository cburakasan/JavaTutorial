package JavaEgzersiz.Metodlar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Metodlar {
    public static void main(String[] args) {
//        egzersiz1();
//        toplama(55,65);
//        egzersiz2();
//        egzersiz3();
//        egzersiz4();

    }

    private static void egzersiz3() {

        Integer toplam = toplamaIslemi(12, 5);
        toplam = toplam + 5;
        System.out.println(toplam);

    }

    private static Integer toplamaIslemi(int ilkSayi, int ikinciSayi) {
        Integer toplam = ilkSayi + ikinciSayi;
        return toplam;

    }


    public static void egzersiz1() {
        Integer a = 55, b = 35, toplam = 0;
        toplam = a + b;
        System.out.println(toplam);
    }

    public static void toplama(Integer a, Integer b) {
        Integer toplam = 0;
        toplam = a + b;
        System.out.println(toplam);
    }

    //    klavyeden girilen ik sayiyi carpan metod yaz.
    public static void egzersiz2() {
        System.out.println("Lutfen sayi giriniz");
        Scanner girdi = new Scanner(System.in);
        Integer sonuc = 0;
        int sayi1 = girdi.nextInt();
        int sayi2 = girdi.nextInt();
        carpma(sayi1, sayi2, sonuc);

    }

    public static void carpma(Integer sayi1, Integer sayi2, Integer sonuc) {
        sonuc = sayi1 * sayi2;
        System.out.println(sonuc);
    }
//    overloading demek ayni isimde cagirilan metdoun parametrelerini degistirerek kullanmaktir.

//    metorn return type!

    public static void egzersiz4() {
        System.out.println("Lutfen 5 sayi hazirlayiniz");
        Scanner sayiGir = new Scanner(System.in);
        List<Integer> sayiGrubu = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ".sayiyi giriniz");
            int sayi = sayiGir.nextInt();
            sayiGrubu.add(sayi);
        }
        Integer toplam = toplam(sayiGrubu);
        System.out.println("toplam"+toplam);

    }

    public static Integer toplam(List<Integer> sayilar) {
        Integer toplam=0;
        for (int i = 0; i < sayilar.size(); i++) {

            Integer sayiDegeri = sayilar.get(i);
            toplam=toplam+sayiDegeri;
        }
        return toplam ;

    }





}
