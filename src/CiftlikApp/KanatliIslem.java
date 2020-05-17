package CiftlikApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class KanatliIslem {
    static Scanner girdi = new Scanner(System.in);

    public void kumestekiYumurtaSayisiniHesapla() {
        System.out.println("Lütfen çiftleşmeye hazir dişi deve kuşu sayisini girin");
        int disiDeveKusuSayisi = girdi.nextInt();
        Devekusu disidevekusu = new Devekusu();
        disidevekusu.setCinsiyet("Dişi");
        disidevekusu.setAdet(disiDeveKusuSayisi);
        System.out.println("Lütfen çiftleşmeye hazir erkek deve kuşu sayisini girin");
        int erkekDeveKusuSayisi = girdi.nextInt();
        Devekusu erkekDeveKusu = new Devekusu();
        erkekDeveKusu.setCinsiyet("Erkek");
        erkekDeveKusu.setAdet(erkekDeveKusuSayisi);
        ciftlesme(disiDeveKusuSayisi,erkekDeveKusuSayisi);
    }

    public void ciftlesme(int disiDeveKusuSayisi, int erkekDeveKusuSayisi){
        if (disiDeveKusuSayisi<erkekDeveKusuSayisi){
            System.out.println("Bir disi deve kusu bir erkek deve kusu ile ciftlesebildiginden, olusacak yumurta sayisi="+disiDeveKusuSayisi);
        }
        else if (disiDeveKusuSayisi==erkekDeveKusuSayisi){
            System.out.println("Bir disi deve kusu bir erkek deve kusu ile ciftlesebildiginden, olusacak yumurta sayisi="+disiDeveKusuSayisi);
        }
        else{
            System.out.println("Bir disi deve kusu bir erkek deve kusu ile ciftlesebildiginden, olusacak yumurta sayisi="+erkekDeveKusuSayisi);
        }

    }
    public void asi(){
        System.out.println("Lutfen kumesteki toplam deve kusu sayisini giriniz.");
        int toplamDeveKusuSayisi = girdi.nextInt();
        List<Devekusu> devekusuList =new ArrayList<>();
        for (int i = 0; i <toplamDeveKusuSayisi ; i++) {
            Devekusu devekusu = new Devekusu();
            System.out.println("Deve kusunun yasini giriniz");
            int deveKusuyasi = girdi.nextInt();
            devekusu.setYas(deveKusuyasi);
            System.out.println("Deve kusunun cinsiyetini giriniz");
            String deveKusununCinsiyeti = girdi.next();
            devekusu.setCinsiyet(deveKusununCinsiyeti);
            String uniqueID = UUID.randomUUID().toString();
            devekusu.setId(uniqueID);

            devekusuList.add(devekusu);

        }
        asiKontrol(devekusuList);

    }

    private void asiKontrol(List<Devekusu> devekusuList) {

        for (Devekusu devekusu : devekusuList) {
            if (devekusu.getYas() >= 2 && devekusu.getYas() <= 3) {
                System.out.println(devekusu.getId() + "kupe numarali devekusuna asi yapılabilir");
            }
            else {
                System.out.println(devekusu.getId() + "kupe numarali devekusuna asi yapılabilamaz");

            }
        }


    }

}



