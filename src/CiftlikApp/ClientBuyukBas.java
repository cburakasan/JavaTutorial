package CiftlikApp;

import java.util.List;

public class ClientBuyukBas {
    public static void main(String[] args) {
        MandaIslem mandaIslem = new MandaIslem();
        List<Manda> mandaList = mandaIslem.mandaBilgileri();
        mandaIslem.mandaCiftlesme(mandaList);
        mandaIslem.mandaDogum(mandaIslem.getAylar(),mandaList,mandaIslem.getDisiMandaList());

    }
}
