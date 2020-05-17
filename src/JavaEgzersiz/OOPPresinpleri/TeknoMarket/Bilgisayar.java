package JavaEgzersiz.OOPPresinpleri.TeknoMarket;

public class Bilgisayar {
    private String islemci;
    private String ekranKarti;
    private Double ekranBoyutu;
    private String depolamaTuru;
    private Integer depoHacmi;
    private String marka;
    private Double fiyat;

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getIslemci() {
        return islemci;
    }

    public void setIslemci(String islemci) {
        this.islemci = islemci;
    }

    public String getEkranKarti() {
        return ekranKarti;
    }

    public void setEkranKarti(String ekranKarti) {
        this.ekranKarti = ekranKarti;
    }

    public Double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(Double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public String getDepolamaTuru() {
        return depolamaTuru;
    }

    public void setDepolamaTuru(String depolamaTuru) {
        this.depolamaTuru = depolamaTuru;
    }

    public Integer getDepoHacmi() {
        return depoHacmi;
    }

    public void setDepoHacmi(Integer depoHacmi) {
        this.depoHacmi = depoHacmi;
    }
}
