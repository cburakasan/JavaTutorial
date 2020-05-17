package JavaEgzersiz.Listler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listler {
    public static void main(String[] args) {
//        egzersiz1();
//        egzersiz2();
//        egzersiz3();
        egzersiz4();
    }
    public static void egzersiz1 (){

        List<String> listString = new ArrayList<>();
        listString.add("Burak");
        listString.add("Nesrin");
        listString.add("Fırat");

        for (String isim : listString) {
            isim = isim + " Aşan";
            System.out.println(isim);

        }
        String isim = listString.get(2);
        System.out.println(isim);

        String removeString = listString.remove(1);
        for (String s : listString) {
            System.out.println(s);
        }
        List<String> soyisimList= new ArrayList<>();
        soyisimList.add("Asanlar");
        soyisimList.add("Ulgaylar");

        listString.addAll(soyisimList);
        for (String yeniIsim : listString) {
            System.out.println(yeniIsim);
        }

    }
    public static void egzersiz2(){
        List<Integer> sayiList= new ArrayList<>();
        System.out.println("Lutfen 5 sayi degeri giriniz");
        Scanner sayiGirin= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayi giriniz");
            int sayi = sayiGirin.nextInt();
            sayiList.add(sayi);
        }
        System.out.println("Girilen sayilar");
        for (Integer girilenSayi : sayiList) {
            System.out.println(girilenSayi);
        }
        }

        public static void egzersiz3(){
            System.out.println("5 ogrencinin vize notlarini giriniz");
            List<Integer> sayiList2= new ArrayList<>();
            Scanner sayiGir = new Scanner(System.in);
            for (int i=0; i<5;i++){
                System.out.println(i+". ogrencinin viz notunu giriniz");
                int vize = sayiGir.nextInt();
                sayiList2.add(vize);
            }
            Integer toplam=0;
            for (Integer not : sayiList2) {
                toplam=toplam+not;

            }
            Double ortalama= 0.0;
            ortalama= (double)(toplam/sayiList2.size());
            System.out.println(ortalama);
        }
        public static void egzersiz4(){
//       ogrencilerin vize ve final notlarinin ortalamasina gore harf notu versin. list kullan. ogrenci sayisini kullanici versin.
            System.out.println("sinif mevcudunu giriniz");
            Scanner girdi=new Scanner(System.in);
            int sinifMevcudu = girdi.nextInt();
            List<Integer> sayiList = new ArrayList<>();
            Integer ort=0;
            for (int i = 1; i <= sinifMevcudu; i++) {
                System.out.println("Lutfen vize notunu giriniz");
                int vizeNotu = girdi.nextInt();
                System.out.println("Lutfen final notunu giriniz");
                int finalNotu = girdi.nextInt();
              ort= (vizeNotu+finalNotu)/2;
                sayiList.add(ort);
            }
            for (Integer ortalama : sayiList) {
                System.out.println(ortalama);
            }
        }





}
