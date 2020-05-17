package JavaEgzersiz.OOPPresinpleri;

public class Calisan {
    private String adi;
    private Integer yasi;
    private String calisaninBirimi;
    private Double maas;

    public Double getMaas() {
        return maas;
    }

    public void setMaas(Double maas) {
        this.maas = maas;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Integer getYasi() {
        return yasi;
    }

    public void setYasi(Integer yasi) {

        this.yasi = yasi;
    }

    public String getCalisaninBirimi() {
        return calisaninBirimi;
    }

    public void setCalisaninBirimi(String calisaninBirimi) {
        this.calisaninBirimi = calisaninBirimi;
    }

    public static Double maasHesabi(Double yevmiye){
        Double maas =0.00;
        maas=yevmiye*30;
        return maas;
    }
}
