package JavaEgzersiz.OOPPresinpleri.TeknoMarket;

import java.util.Scanner;

public class TeknoMarket {
    static Scanner girdi = new Scanner(System.in);
    static Islemler islemler = new Islemler();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Telefon için 1'i, Bilgisayar icin 2'i,cikis icin 3'u seciniz");
            int secim = girdi.nextInt();
            if (secim == 3) {
                break;
            }
            islemler.islemMenusu(secim);

        }
    }


}
