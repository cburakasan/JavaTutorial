package JavaEgzersiz.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class training {
    static Scanner kullaniciGirisi = new Scanner(System.in);
    static int havucMiktari = 0;//global degısken, class degıskenı
    static int erikMiktari = 0;


    public static void main(String[] args) {
//        stringler();
        Integer degisken1;
        degisken1 = 15000;
//        Long degisken2 = 7755;
//
//        Long toplam = degisken1 + degisken2;
//        System.out.println(toplam);
//        stringExample();
//        pekistirme();
//        scanner();
//        egzersiz();
//        egzersiz2();
//        egzersiz3();
//        egzersiz4();
//        egzersiz5();
//        egzersiz6();
//        egzersiz7();
//        egzersiz8();
//        egzersiz9();
//egzersiz10();
//        egzersiz11();
//        egzersiz12();
//        egzersiz13();
//        egzersiz14();
//    egzersiz15();
//egzersiz16();
//        egzersiz17();
//        egzersiz18();
//    egzersiz19();
//        egzersiz20();
//        egzersiz21();
        halApp();
    }


    public static void stringler() {
        Integer sayi = 1905;
        String fiyatPerformans = "Asus i5 islemcili gtx 1050 ekran kartlı urun tam bir fiyat ve performans urunudur. ";
        fiyatPerformans = fiyatPerformans.toUpperCase();
        fiyatPerformans.indexOf(" ");
        System.out.println(fiyatPerformans);

    }

    public static void stringExample() {  //verilen cumlenin 7. karakterinden son karakterine kadar al ve aldığın yeni cümlenin 3. karakterini söyle.

        String s = "burak nesosu cok seviyor";
        int yedinciKarakter = s.indexOf(" ");
        String yeniCumle = s.substring(yedinciKarakter);
        int ucuncuKarakter = s.indexOf("");

        System.out.println("ucuncuKarakter" + s);
        String yCumle = s.substring(7);
        char charAt = yCumle.charAt(3);
        System.out.println(charAt);

    }

    public static void pekistirme() {
        //8. ve 20. karakterlerini ekrana yazdiran cumle.

        String cumle = "biz cok tatli bir aile olduk yasasin";
        String yCumle = cumle.substring(8, 21);
        System.out.println(yCumle);

        char karakterSekiz = cumle.charAt(8);
        char karakterYirmi = cumle.charAt(20);


        System.out.println(yCumle + " sekizinci ve yirminci karakter " + " " + karakterSekiz + " " + karakterYirmi);

        int uzunluk = cumle.length();
        System.out.println(uzunluk);
        char sonKarakter = cumle.charAt(35);
        System.out.println(sonKarakter);
        int uzunca = cumle.length() - 1;
        char yeniSonKarakter = cumle.charAt(uzunca);

        System.out.println(yeniSonKarakter);
    }

    public static void scanner() { //90-100 AA, 80-90 BA, 70-80 BB, 60-70 CB, 50-60 CC, <50 FF Yazan kod.
        System.out.println("Lutfen Notunuzu Giriniz");
        Scanner girdi = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println(i + ".  Notunuzu Giriniz");

            Integer not = girdi.nextInt();
            if (not >= 90 && not <= 100) {
                System.out.println(" Harf Notunuz :" + " " + "AA");
            } else if (not >= 80 && not < 90) {
                System.out.println(" Harf Notunuz :" + " " + "BA");
            } else if (not >= 70 && not < 80) {
                System.out.println(" Harf Notunuz :" + " " + "BB");
            } else if (not >= 60 && not < 70) {
                System.out.println(" Harf Notunuz :" + " " + "CB");
            } else if (not >= 50 && not < 60) {
                System.out.println(" Harf Notunuz :" + " " + "CC");
            } else {
                System.out.println(" Butunleme Sinavina Hak Kazandiz :" + " " + "FF");
            }
        }
    }

    public static void egzersiz() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public static void egzersiz2() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }
    }


    public static void egzersiz3() {
        //string bir cumle alalim, cumle hangi harf ile basliyorsa ekrana yazdiralim.
        String cumle = "Bu verilen odev zor bir odeve benziyor. ";
        char S = cumle.charAt(0);
        System.out.println(S);

    }

    public static void egzersiz4() {
//        varolan bir bir cumlenin ilk karakterini kullanicidan tahmin etmesini iste ve ettir. Dogru ve yanlis yaz.

        String cumle = "Doruk cok uckagitci bir bebektir";
        System.out.println("...uk cok uckagitci bir bebektir cumlesinin ilk harfini tahmin ediniz.");
        Scanner tahmin = new Scanner(System.in);
        String girdi = tahmin.next();
        Character dKarakteri = cumle.charAt(0);

        if (girdi.equals(dKarakteri.toString())) {
            System.out.println("Tebrikler Dogru Tahmin");
        } else {
            System.out.println("Tekrar Deneyin");
        }
    }

    public static void egzersiz5() {
//        kullanicidan alinan bir cumle icerisinde ahmet olup olmadigini kontrol eden kod
        System.out.println("bir cumle yaziniz");
        Scanner cumleGir = new Scanner(System.in);
        String girdi = cumleGir.next();
        boolean ahmetVarmi = girdi.contains("ahmet");
        if (ahmetVarmi == true) {

            System.out.println("Cumlenin icerisinde ahmet gecmektedir");
        } else {
            System.out.println("Cumlenin icerisnde ahmet gecmemektedir");
        }

    }

    public static void egzersiz6() {
//        kullanicidan 20 sayi girmesi istenmekte. 5 sayisini buldugu anda ekrana yazip kacinci denemede girdigi istenmekte.
//        System.out.println("Bir sayi giriniz.");
        Scanner sayiGir = new Scanner(System.in);
        Integer sayac = 0;
        Integer toplam = 0;
        for (int i = 0; i < 20; i++) {
            sayac++;
            System.out.println("Sayi Giriniz");
            int sayi = sayiGir.nextInt();
            toplam = toplam + sayi;
            if (sayi == 5) {
                toplam = toplam - 5;
                System.out.println("sayi =" + " " + i + " " + sayac + ". denemede bulunmustur");
                System.out.println("toplam=" + toplam);
                break;
            }
        }
    }

    public static void egzersiz7() {
//        kullanicidan iki cumle girdisi isteniyor. bu iki cumleden hangisi a harfi ile basliyorsa o cumlenin butun karakterlerini tek tek ekrana yazdıran kod.
//        cumlenin ilk harfini bulduran komut bulunsun.
        System.out.println("Lutfen ilk cümleyi giriniz");
        Scanner ilkCumleGir = new Scanner(System.in);
        String ilkCumle = ilkCumleGir.nextLine();
        System.out.println("Lutfen ikinci cümleyi giriniz");
        Scanner ikincicumlegir = new Scanner(System.in);
        String ikinciCumle = ikincicumlegir.next();
        boolean aHarfiMi = ilkCumle.startsWith("a");
        if (aHarfiMi == true) {
            for (int i = 0; i < ilkCumle.length() - 1; i++) {
                char karakter = ilkCumle.charAt(i);
                System.out.println(karakter);
            }

        }
    }

    public static void egzersiz8() {
//        ahmet kelimesini tersten yazdiran kodu yazin
        String kelime = "doruk";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            char yeniKelime = kelime.charAt(i);
            System.out.println(yeniKelime);
        }
    }

    public static void egzersiz9() {
// ekrana girilen 5 sayinin en buyugunu bulan kodu yaziniz.
        System.out.println("Birinci sayiyi giriniz");
        Scanner girdi = new Scanner(System.in);
        int birinciSayi = girdi.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        Scanner girdi2 = new Scanner(System.in);
        int ikinciSayi = girdi2.nextInt();
        System.out.println("Ucuncu sayiyi giriniz");
        Scanner girdi3 = new Scanner(System.in);
        int ucuncuSayi = girdi3.nextInt();
        System.out.println("Dorduncu sayiyi giriniz");
        Scanner girdi4 = new Scanner(System.in);
        int dorduncuSayi = girdi4.nextInt();
        System.out.println("Besinci sayiyi giriniz");
        Scanner girdi5 = new Scanner(System.in);
        int besinciSayi = girdi5.nextInt();
        if (birinciSayi > ikinciSayi && birinciSayi > ucuncuSayi && birinciSayi > dorduncuSayi && birinciSayi > besinciSayi) {
            System.out.println("Girilen 5 sayinin en buyugu=" + birinciSayi);
        }
        if (ikinciSayi > birinciSayi && ikinciSayi > ucuncuSayi && ikinciSayi > dorduncuSayi && ikinciSayi > besinciSayi) {
            System.out.println("Girilen 5 sayinin en buyugu=" + ikinciSayi);
        }
        if (ucuncuSayi > birinciSayi && ucuncuSayi > ikinciSayi && ucuncuSayi > dorduncuSayi && ucuncuSayi > besinciSayi) {
            System.out.println("Girilen 5 sayinin en buyugu=" + ucuncuSayi);
        }
        if (dorduncuSayi > birinciSayi && dorduncuSayi > ikinciSayi && dorduncuSayi > ucuncuSayi && dorduncuSayi > besinciSayi) {
            System.out.println("Girilen 5 sayinin en buyugu=" + dorduncuSayi);
        }
        if (besinciSayi > birinciSayi && besinciSayi > ikinciSayi && besinciSayi > ucuncuSayi && besinciSayi > dorduncuSayi) {
            System.out.println("Girilen 5 sayinin en buyugu=" + besinciSayi);
        }
    }

    //    Kullaniciya 5 sayi girdirip her sayinin uc ile bolumunden kalani bulan ve sonra bu kalanlari toplayan kod.
    public static void egzersiz10() {
        System.out.println("Birinci sayiyi giriniz");
        Scanner girdi = new Scanner(System.in);
        int birinciSayi = girdi.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        int ikinciSayi = girdi.nextInt();
        System.out.println("Ucuncu sayiyi giriniz");
        int ucuncuSayi = girdi.nextInt();
        System.out.println("Dorduncu sayiyi giriniz");
        int dorduncuSayi = girdi.nextInt();
        System.out.println("Besinci sayiyi giriniz");
        int besinciSayi = girdi.nextInt();
        int kalan1 = birinciSayi % 3;
        int kalan2 = ikinciSayi % 3;
        int kalan3 = ucuncuSayi % 3;
        int kalan4 = dorduncuSayi % 3;
        int kalan5 = besinciSayi % 3;
        Integer sonuc = kalan1 + kalan2 + kalan3 + kalan4 + kalan5;
        System.out.println("Girilen 5 sayinin herbirinin 3 e bolumunden kalanların toplami=" + sonuc);


    }

    public static void egzersiz11() {
        Integer i = 0;
        while (i < 100) {
            i++;
            System.out.println(i);
        }
        String s = "ali";
        while (s.equals("ali")) {

        }
    }

    public static void egzersiz12() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    public static void egzersiz13() {
        for (int i = 0; i < 100; i++) {
            i = i + 1;
            System.out.println(i);


        }
    }

    public static void egzersiz14() {
//        0 ile 100 arasinda hem 3 e hemde 7 ye bolunebilen sayilari yazdiran kod
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i + "sayisi hem 3 hem de 7 ile tam bolunmektedir");
            }
        }

    }

    // 2 nin uslerini yazdiran kod.
    public static void egzersiz15() {
        for (int i = 0; i < 100; i++) {
            Integer taban = 2;
            long sonuc = (long) Math.pow(taban, i);
            if (sonuc <= 100) {
                System.out.println(sonuc);
            }
        }
    }

    public static void egzersiz16() {
        for (int i = 1; i <= 5; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void egzersiz17() {
//        kullanicidan 5 cumle yazmasi istensin. bu cumle icerisinde en uzun olani bulaim.
        System.out.println("Lutfen bes cumle giriniz");
        Scanner cumleyiGirin = new Scanner(System.in);
        List<String> paragraf = new ArrayList<>();
//        String cumle1= "";
        Integer a = 0;

        String enUzunCumle = null;

        for (int i = 1; i < 6; i++) {
            System.out.println(i + ".cumleyi Giriniz");
            String cumle1 = cumleyiGirin.nextLine();
            paragraf.add(cumle1);
        }
        for (String cikti : paragraf) {
            if (a < cikti.length()) {
                a = cikti.length();
                enUzunCumle = cikti;

            }


        }
        System.out.println(enUzunCumle);


    }

    public static void egzersiz18() {
        System.out.println("Lutfen 5 sayi hazirlayiniz");
        Scanner sayiGir = new Scanner(System.in);
        List<Integer> sayiList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ".Sayiyi giriniz");
            int sayi = sayiGir.nextInt();
            sayiList.add(sayi);
        }
        Integer carpmaSonuc = carpma(sayiList);
        System.out.println("carpimin sonucu:" + carpmaSonuc);

    }

    public static Integer carpma(List<Integer> carpim) {
        Integer deger = 1;
        for (int i = 0; i < carpim.size(); i++) {
            Integer sayi = carpim.get(i);
            deger = deger * sayi;
        }
        return deger;
    }

    //   kullanicidan surekli girdirilen sayilarin 3 le bolunbildigi anda programdan cik.
    public static void egzersiz19() {
        Scanner sayiGir = new Scanner(System.in);
        boolean is3Bolunebilir = false;
        while (!is3Bolunebilir) {
            System.out.println("Lutfen sayi giriniz");
            int sayi = sayiGir.nextInt();
            if ((sayi % 3 == 0)) {
                is3Bolunebilir = true;
            }
        }
    }

    //        bir listenin icerisinde 20 tane sayi var. Bu sayilardan 5 ile bolunenler haricindekileri ekrana yazdir.
    public static void egzersiz20() {
        List<Integer> sayiGrubu = new ArrayList<>();
        sayiGrubu.add(5);
        sayiGrubu.add(22);
        sayiGrubu.add(17);
        sayiGrubu.add(32);
        sayiGrubu.add(65);
        sayiGrubu.add(23);

        for (int i = 0; i < sayiGrubu.size(); i++) {
            if (sayiGrubu.get(i) % 5 == 0) {
                continue;
            }
            System.out.println(sayiGrubu.get(i));
        }
    }

    public static void egzersiz21() {
        List<String> isimList = new ArrayList<>();
        Scanner isimGir = new Scanner(System.in);
        String ilkHarf = "a";
        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen isim giriniz");
            String isim = isimGir.next();
            isimList.add(isim);
        }
        for (int i = 0; i < isimList.size(); i++) {
            String kelime = isimList.get(i);
            if (kelime.startsWith(ilkHarf)) {
                isimList.remove(kelime);
            }
        }
        for (String isim : isimList) {
            System.out.println(isim);
        }
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
//
}
