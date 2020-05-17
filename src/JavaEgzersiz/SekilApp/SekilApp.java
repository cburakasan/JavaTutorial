package JavaEgzersiz.SekilApp;

import java.util.Scanner;

public class SekilApp {
    static Scanner giris = new Scanner(System.in);

    public static void main(String[] args) {
        sekil();

    }
    public static void sekil (){
        while (true){
            System.out.println("Ucgen icin 1'i, Dortgen icin 2'i, Cember icin 3'u girin, cikis icin 4 u secin");
            int kenarSayisi = giris.nextInt();
            if (kenarSayisi==1){
                ucgen();
            }

        }


    }
    public static void ucgen(){
        System.out.println("Cevre hesaplamak için 1'i, Alan Hesaplamak için 2'i seçin");
        int secim = giris.nextInt();
        if (secim==1){
            Integer cevreUzunlugu = ucgeninCevresi();
            System.out.println("Cevrenin Uzunlugu="+cevreUzunlugu);
        }

    }
    public static Integer ucgeninCevresi(){
        Integer toplamKenarUzunlugu =0;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("Lütfen kenar uzunlugunu giriniz");
            int kenarUzunlugu = giris.nextInt();
            toplamKenarUzunlugu=toplamKenarUzunlugu + kenarUzunlugu;

        }
        return toplamKenarUzunlugu;
    }
}
