package CiftlikApp;

public class Devekusu extends KanatliHayvanlar {
    private String cinsiyet;
    private Integer adet;
    private Integer yas;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public static void basiniGomer(){

        System.out.println("Butun devekuşlari baslarini kuma gomerler");
    }

}
