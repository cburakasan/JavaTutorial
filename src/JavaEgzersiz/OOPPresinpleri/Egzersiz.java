package JavaEgzersiz.OOPPresinpleri;

import JavaEgzersiz.OOPPresinpleri.TeknoMarket.Bilgisayar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Egzersiz {
    static List<Bilgisayar> bilgisayarlar = new ArrayList<>();
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Bilgisayar bilgisayar = new Bilgisayar();
            System.out.println("işlemci türünü giriniz");
            String islemci = girdi.next();
            System.out.println("ekran karti türünü giriniz");
            String ekranKarti = girdi.next();
            bilgisayar.setIslemci(islemci);
            bilgisayar.setEkranKarti(ekranKarti);
            bilgisayarlar.add(bilgisayar);

        }
        for (Bilgisayar bilgisayar : bilgisayarlar) {
            System.out.println(bilgisayar.getIslemci()+" "+bilgisayar.getEkranKarti());

        }
        }
        }



