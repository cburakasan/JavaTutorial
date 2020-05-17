package JavaEgzersiz.HalApp;

import java.util.Scanner;

public class HalApp {
    static Scanner kullaniciGirisi = new Scanner(System.in);
    static int havucMiktari = 0;//global degısken, class degıskenı
    static int erikMiktari = 0;

    public static void main(String[] args) {
        halApp();
    }

    public static void halApp() {
        while (true) {
            System.out.println("Lutfen yapmak istediginiz islemi seciniz");
            System.out.println("Erik Icin 1'i, Havuc Icin 2'i, Cikis icin 3'u seciniz");
            int yapilacakIs = kullaniciGirisi.nextInt();
            if (yapilacakIs == 1) {
                erikIslemleri();

            } else if (yapilacakIs == 2) {
                havucIslemleri();
                System.out.println("nesos cok tatli midir degil midir");

            } else if (yapilacakIs == 3) {
                break;


            }
        }
    }

    public static void erikIslemleri() {
        System.out.println("Lutfen elinizdeki erik miktarini tespit edip sisteme giriniz");
        erikMiktari = kullaniciGirisi.nextInt();
        while (true) {
            System.out.println("Lutfen yapmak istediginiz islemi seciniz");
            System.out.println("Urun Satisi icin 1'i, Stok kontrolu icin 2'i, Satin alma icin 3'u, Cikis icin 4'u seciniz");
            int yapilacakIs = kullaniciGirisi.nextInt();
            if (yapilacakIs == 1) {
                Integer sonMiktar = urunSatisi(erikMiktari);
                erikMiktari = sonMiktar;

            } else if (yapilacakIs == 2) {
                System.out.println("Erik miktari=" + " " + erikMiktari);

            } else if (yapilacakIs == 3) {
                Integer sonMiktar = satinAlma(erikMiktari);
                erikMiktari = sonMiktar;

            } else if (yapilacakIs == 4) {
                break;
            }
        }
    }

    public static void havucIslemleri() {
        System.out.println("Lutfen elinizdeki havuc miktarini tespit edip sisteme giriniz");
        havucMiktari = kullaniciGirisi.nextInt();
        while (true) {
            System.out.println("Lutfen yapmak istediginiz islemi seciniz");
            System.out.println("Urun Satisi icin 1'i, Stok kontrolu icin 2'i, Satin alma icin 3'u, Cikis icin 4'u seciniz");
            int yapilacakIs = kullaniciGirisi.nextInt();
            if (yapilacakIs == 1) {
                Integer sonMiktar = urunSatisi(havucMiktari);
                havucMiktari = sonMiktar;
            } else if (yapilacakIs == 2) {
                System.out.println("Havuc miktari=" + " " + havucMiktari);

            } else if (yapilacakIs == 3) {
                Integer sonMiktar = satinAlma(havucMiktari);
                havucMiktari = sonMiktar;
            } else if (yapilacakIs == 4) {
                break;
            }
        }

    }

    public static Integer urunSatisi(Integer urunMiktari) {
        System.out.println("Lutfen satilacak urun miktarini giriniz");
        int satilanUrun = kullaniciGirisi.nextInt();//local degısken, yerel degısken
        urunMiktari = urunMiktari - satilanUrun;
        return urunMiktari;
    }

    public static Integer satinAlma(Integer urunMiktari) {
        System.out.println("Lutfen satin alinan urun miktarini giriniz");
        int alinanUrun = kullaniciGirisi.nextInt();
        urunMiktari = urunMiktari + alinanUrun;
        return urunMiktari;
    }

}
