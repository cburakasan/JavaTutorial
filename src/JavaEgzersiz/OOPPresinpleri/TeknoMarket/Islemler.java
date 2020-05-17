package JavaEgzersiz.OOPPresinpleri.TeknoMarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner girdi = new Scanner(System.in);
    static Integer urunMiktari = 0;
    static List<Bilgisayar> bilgisayarList = new ArrayList<>();
    static List<Telefon> telefonList = new ArrayList<>();


    protected static void islemMenusu(Integer urunTuru) {
        while (true) {

            System.out.println("Urun eklemek icin 7'i , Urun satisi icin 8'i , Stok kontrolu icin 9'u, cikis icin 4'u seciniz");
            int islemSecimi = girdi.nextInt();
            if (islemSecimi == 7) {
                urunEkle(urunTuru);
            } else if (islemSecimi == 8) {
                urunSatisi();
            } else if (islemSecimi == 9) {
                stokKontorlu();
            } else {
                break;
            }
        }
    }

    private static void urunEkle(Integer urunTuru) {
        if (urunTuru == 1) {
            while (true) {
                Telefon telefon = new Telefon();
                System.out.println("Telefonun markasını gırın");
                String marka = girdi.next();
                telefon.setMarka(marka);
                System.out.println("Fıyat gırınız");
                double fiyat = girdi.nextDouble();
                telefon.setFiyat(fiyat);
                telefonList.add(telefon);
                System.out.println("Cikis icin 0'i seciniz");
                int cikisDegeri = girdi.nextInt();
                if (cikisDegeri == 0) {
                    break;
                }
            }
        } else if (urunTuru == 2) {
            while (true) {
                Bilgisayar bilgisayar = new Bilgisayar();
                System.out.println("Bilgisayarin markasını gırın");
                String marka = girdi.next();
                bilgisayar.setMarka(marka);
                System.out.println("Fıyat gırınız");
                double fiyat = girdi.nextDouble();
                bilgisayar.setFiyat(fiyat);
                bilgisayarList.add(bilgisayar);
                System.out.println("Cikis icin 0 'i seciniz");
                int cikisDegeri = girdi.nextInt();
                if (cikisDegeri == 0) {
                    break;
                }
            }


        }
    }

    private static void stokKontorlu() {
        System.out.println("Telefon Stok bilgisi icin 1'i, Bilgisayar Stok Bilgisi icin 2'i secin");
        int stokSecimi = girdi.nextInt();
        if (stokSecimi == 1) {
            int telefonStok = telefonList.size();
            System.out.println("telefon Stok Miktari=" + " " + telefonStok);
        } else if (stokSecimi == 2) {
            int bilgisayarStok = bilgisayarList.size();
            System.out.println("Bilgisayar Stok Miktari=" + " " + bilgisayarStok);
        }
    }

    public static void urunSatisi() {
        String telefonMarka = null;
        System.out.println("Telefon satmak icin 1'i Bilgisayar satmak icin 2'i secin");
        int satisSecimi = girdi.nextInt();
        if (satisSecimi == 1) {
            System.out.println("Hangi marka telefonu satmak istediginizi giriniz");
            telefonMarka = girdi.next();
            Integer telefonSayisi = 0;
            for (Telefon telefon : telefonList) {
                if (telefonMarka.equals(telefon.getMarka())) {
                    telefonSayisi++;
                }
            }
            System.out.println("Girdiginiz markaya ait stoktaki urun adedi=" + " " + telefonSayisi);
            System.out.println("Lutfen satmak istediginiz urun miktarini giriniz");
            int satilacakUrunAdeti = girdi.nextInt();
            if (satilacakUrunAdeti == 0 || satilacakUrunAdeti > telefonSayisi) {
                System.out.println("Stokta yeterli urun bulunmamaktadir");
                return;
            }
            Integer satilanUrunAdeti = 0;
            while (true) {
                for (Iterator<Telefon> iterator = telefonList.iterator(); iterator.hasNext(); ) {
                    Telefon telefon = iterator.next();
                    if (telefonMarka.equals(telefon.getMarka())) {
                        iterator.remove();
                        satilanUrunAdeti++;
                        if (satilanUrunAdeti == satilacakUrunAdeti) {
                            break;
                        }
                    }

                }
                break;
            }
        }
    }
}
