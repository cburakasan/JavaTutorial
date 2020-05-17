package JavaEgzersiz.Construct;

import JavaEgzersiz.Construct.Kalem;

public class Client {
    public static void main(String[] args) {
//        Kalem kalem = new Kalem("Kırmızı");
//        System.out.println(kalem.getKalemRengi());
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAdi("nesos");
        ogrenci.setOkulNo(11260051);
        System.out.println(ogrenci.getAdi()+" "+ogrenci.getOkulNo());

        Ogrenci ogrenci2 = new Ogrenci("Burak", 11250027);
        System.out.println(ogrenci2.getAdi() + " " + ogrenci2.getOkulNo());



    }
}
