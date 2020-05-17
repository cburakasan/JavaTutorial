package JavaEgzersiz.OOPPresinpleri.Kalitim;

public class Client {
    public static void main(String[] args) {
        getUcakBilgileri();
        polimorfizim();

    }

    private static void polimorfizim() {
        Arac ucak = new Ucak();
        ucak.setKapasite(200);
        ucak.setMotorGucu(455);
        bilgileriYazdir(ucak);

        Tren tren = new Tren();
        tren.setKapasite(522);
        bilgileriYazdir(tren);

        bilgileriYazdir(ucak);
        bilgileriYazdir(tren);


    }

    public static void getUcakBilgileri() {
        Ucak ucak = new Ucak();
        ucak.tasima();
        ucak.setKoltukSayisi(200);
        ucak.setModel("Airbus");
        ucak.setMotorGucu(6000);
        Integer koltukSayisi = ucak.getKoltukSayisi();
        String model = ucak.getModel();
        Integer motorGucu = ucak.getMotorGucu();
        System.out.println("ucagin koltuk sayisi="+koltukSayisi+"ucagin modeli="+model+"ucagin motor gucu"+motorGucu);
    }

//    public static void bilgileriYazdir(Ucak ucak){
//        System.out.println(ucak.getKapasite());
//        System.out.println(ucak.getMotorGucu());
//
//    }
//
//    public static void bilgileriYazdir(Tren tren){
//        System.out.println(tren.getKapasite());
//        System.out.println(tren.getMotorGucu());
//
//    }

    public static void bilgileriYazdir(Arac arac){
        System.out.println(arac.getKapasite());
        System.out.println(arac.getMotorGucu());

    }



}
