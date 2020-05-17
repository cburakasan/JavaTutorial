package CiftlikApp;

public class BuyukBas extends Hayvanlar {
    private Double kilo;
    private Integer yas;
    private String cinsiyet;
    @Override
    public void beslenme() {
        System.out.println("Buyukbas hayvanlar otculdurlar");
    }
    public static void yukTasi(){
        System.out.println("Buyukbas hayvanlar yuk tasir");
    }
    public static void sutVerir(){
        System.out.println("Buyukbas hayvanlar sut verir ");

    }

    public Double getKilo() {
        return kilo;
    }

    public void setKilo(Double kilo) {
        this.kilo = kilo;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
