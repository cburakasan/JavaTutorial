package CiftlikApp;

import JavaEgzersiz.OOPPresinpleri.TeknoMarket.Telefon;
import JavaEgzersiz.training.Aylar;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class MandaIslem {
    Scanner girdi = new Scanner(System.in);
    private List<Manda> disiMandaList ;
    private List<String> aylar ;

    public List<Manda> mandaBilgileri() {
        System.out.println("Lütfen toplam manda sayisini giriniz. ");
        int toplamMandaSayisi = girdi.nextInt();
        List<Manda> mandaList = new ArrayList<>();
        for (int i = 1; i <= toplamMandaSayisi; i++) {
            Manda manda = new Manda();
            String uniqueID = UUID.randomUUID().toString();
            String id = uniqueID.substring(0, 8);
            manda.setId(id);
            System.out.println("Lütfen" + i + ". Mandanin kilosunu giriniz");
            double mandaKilo = girdi.nextDouble();
            manda.setKilo(mandaKilo);
            System.out.println("Lütfen" + i + ". Mandanin yasini giriniz");
            int mandaYas = girdi.nextInt();
            manda.setYas(mandaYas);
            System.out.println("Lütfen" + i + ". Mandanin cinsiyetini giriniz");
            String mandaCinsiyet = girdi.next();
            manda.setCinsiyet(mandaCinsiyet);
            mandaList.add(manda);
        }
        return mandaList;
    }

    public List<Manda> getDisiMandaList() {
        return disiMandaList;
    }

    public void setDisiMandaList(List<Manda> disiMandaList) {
        this.disiMandaList = disiMandaList;
    }

    public void mandaCiftlesme(List<Manda> mandas) {
        disiMandaList =new ArrayList<>();
        List<Manda> erkekMandaList = new ArrayList<>();

        for (Manda manda : mandas) {
            if (manda.getCinsiyet() .equals("comus")  && (manda.getYas() >= 2 && manda.getYas() <= 7)) {
                disiMandaList.add(manda);
            } else if (manda.getCinsiyet() .equals("manda")  && (manda.getYas() >= 2 && manda.getYas() <= 7)) {
                erkekMandaList.add(manda);
            }
        }
        System.out.println("**************************Manda Bilgileri******************************************");
        System.out.println("****ID******************YAS**************KILO********************");
        for (Manda manda : erkekMandaList) {
            System.out.println(manda.getId()+"    "+manda.getYas()+"           "+manda.getKilo());
        }

        aylar = new ArrayList<>();
        String ocak = "ocak";
        String subat = "subat";
        String mart = "mart";
        String nisan = "nisan";
        String mayis = "mayis";
        String haziran = "haziran";
        String temmuz = "temmuz";
        String agustos = "agustos";
        String eylul = "eylul";
        String ekim = "ekim";
        String kasim = "kasim";
        String aralik = "aralik";
        aylar.add(ocak);
        aylar.add(subat);
        aylar.add(mart);
        aylar.add(nisan);
        aylar.add(mayis);
        aylar.add(haziran);
        aylar.add(temmuz);
        aylar.add(agustos);
        aylar.add(eylul);
        aylar.add(ekim);
        aylar.add(kasim);
        aylar.add(aralik);
        List<Manda> damizlikMandaList = new ArrayList<>();
        while (true) {
            Random random = new Random();
            int randomAyDegeri = random.nextInt(11);
            String ay = aylar.get(randomAyDegeri);
            if (ay.equals("eylul")) {
                System.out.println("lutfen damizlik mandalarin kupe numarasini girin");
                String kupeNo = girdi.next();

                for (Iterator<Manda> iterator = erkekMandaList.iterator(); iterator.hasNext(); ) {
                    Manda erkekManda = iterator.next();
                    if (erkekManda.getId().equals(kupeNo)) {
                        damizlikMandaList.add(erkekManda);
                        iterator.remove();
                    }
                }

                break;
            }

        }
        System.out.println("Ahirdaki damizlik comus sayisi=" + " " + disiMandaList.size());
        System.out.println("Ahirdaki damizlik manda sayisi"+ " "+ damizlikMandaList.size());
        System.out.println("Ahirdaki kurbanlik manda sayisi"+" "+erkekMandaList.size());
        System.out.println("Muhtemel malak sayisi=" + " " + disiMandaList.size());

    }
        public void mandaDogum(List<String> ayList, List<Manda> mandaList, List<Manda> disiMandaList){
            for (String ay : ayList) {
                try {
                    System.out.println("bu ay "+ ay.toUpperCase());
                    if (ay.equals("subat")){
                        Thread.sleep(200);
                        System.out.println("veteriner kontrolu gelmistir.");
                    }
                    else if (ay.equals("nisan")){
                        Thread.sleep(200);
                        System.out.println("ultrason zamani gelmistir");
                    }
                    else if (ay.equals("temmuz")){
                        int malakSayisi = disiMandaList.size();

                        for (int i = 0; i < malakSayisi; i++) {
                            Manda manda = new Manda();
                            String cinsiyet = Cinsiyet.getRandomCinsiyet().toString();
                            manda.setCinsiyet(cinsiyet);
                            manda.setYas(0);
                            mandaList.add(manda);

                        }
                        int topamMandaSayisi = mandaList.size();
                        System.out.println("Yeni dogan malak sayisi= "+malakSayisi);
                        System.out.println("Ahirdaki toplam manda sayisi= "+topamMandaSayisi);
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }




        }

    public List<String> getAylar() {
        return aylar;
    }

    public void setAylar(List<String> aylar) {
        this.aylar = aylar;
    }
}



