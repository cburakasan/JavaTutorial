package JavaEgzersiz.OOPPresinpleri.Kalitim;

public class Tren extends Arac{
    private Integer vagonSayisi;

    public Integer getVagonSayisi() {
        return vagonSayisi;
    }

    public void setVagonSayisi(Integer vagonSayisi) {
        this.vagonSayisi = vagonSayisi;
    }

    @Override
    public void aracRengi() {
        System.out.println("Kara tren gecikir belki hic gelmez");
    }

    @Override
    public void aracBilgisi(Long aracId) {

    }
}
