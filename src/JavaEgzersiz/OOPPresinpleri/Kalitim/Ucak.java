package JavaEgzersiz.OOPPresinpleri.Kalitim;

public class Ucak extends Arac {
    private String model;
    private Integer koltukSayisi;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(Integer koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    @Override
    public void tasima() {
        System.out.println("ucaklar daha hizli tasima yapar");
    }

    @Override
    public void aracRengi() {
        System.out.println("beyaz");
    }

    @Override
    public void aracBilgisi(Long aracId) {

    }
}
