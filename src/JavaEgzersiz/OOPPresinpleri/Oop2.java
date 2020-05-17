package JavaEgzersiz.OOPPresinpleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oop2 {
    //    klavyeden 3 tane calisan bilgisi girilsin. Bu bilgiler; calisanin adi, yasi ve calistigi birim.
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        List<Calisan> calisanList = calisanBilgisiniGetir();
        calisanlarinYaslariniYazdir(calisanList);
        calisanlarinMaaslariniYazdir(calisanList);
        calisanBilgileirniYaz(calisanList);

    }

    private static void calisanBilgileirniYaz(List<Calisan> calisanList) {
        System.out.println("           Adı           Yası       Birimi           Maaşı");
        for (Calisan calisan : calisanList) {
            System.out.println(calisan.getAdi() + " " + calisan.getYasi());
        }
    }

    public static List<Calisan> calisanBilgisiniGetir() {
        List<Calisan> calisanList = new ArrayList<>();
        System.out.println("Lutfen uc calisanin bilgilerini hazirlayiniz");
        for (int i = 1; i <= 3; i++) {
            Calisan calisan = new Calisan();
            System.out.println("Lutfen" + " " + i + ". calisanin adini giriniz");
            String calisanAdi = girdi.next();
            System.out.println("Lutfen" + " " + i + ". calisanin yasini giriniz");
            int calisaninYasi = girdi.nextInt();
            if (calisaninYasi <= 0) {
                System.out.println("calisanin yasi 0 dan kucuk girilemez");
                continue;
            }
            System.out.println("Lutfen" + " " + i + ". calisanin calistigi birimi giriniz");
            String calisaninBirimi = girdi.next();
            System.out.println("Lutfen calisanin yevmiyesini giriniz");
            double yevmiye = girdi.nextDouble();
            calisan.setAdi(calisanAdi);
            calisan.setYasi(calisaninYasi);
            calisan.setCalisaninBirimi(calisaninBirimi);
            Double maas = calisan.maasHesabi(yevmiye);
            calisan.setMaas(maas);
            calisanList.add(calisan);

        }
        return calisanList;
    }

    private static void calisanlarinYaslariniYazdir(List<Calisan> calisanList) {
        for (Calisan calisan : calisanList) {
            Integer yasi = calisan.getYasi();
            System.out.println("Calisanin yasi" + " " + yasi);
        }

    }

    private static void calisanlarinMaaslariniYazdir(List<Calisan> calisanList) {
        for (Calisan calisan : calisanList) {
            Double maas= calisan.getMaas();
            System.out.println("Calisanin maasi"+ " "+ maas);
        }
    }

}


