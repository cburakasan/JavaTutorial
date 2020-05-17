package JavaEgzersiz.OOPPresinpleri;

import JavaEgzersiz.OOPPresinpleri.TeknoMarket.Bilgisayar;

public class Objects {
    public static void main(String[] args) {
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.setIslemci("i5 8300");
        bilgisayar.setDepoHacmi(256);
        bilgisayar.setDepolamaTuru("SSD");
        bilgisayar.setEkranKarti("Nvidia Gtx 1050 Gt");
        bilgisayar.setEkranBoyutu(15.6);

        System.out.println("Bilgisayarin işlemcisi="+bilgisayar.getIslemci());
        System.out.println("Bilgisayarin Depo Hacmi="+bilgisayar.getDepoHacmi());
        System.out.println("Bilgisayarin Depolama Türü="+bilgisayar.getDepolamaTuru());
        System.out.println("Bilgisayarin Ekran Kartı="+bilgisayar.getEkranKarti());
        System.out.println("Bilgisayarin Ekran Boyutu="+bilgisayar.getEkranBoyutu());
    }


}
