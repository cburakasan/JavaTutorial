package JavaEgzersiz.OOPPresinpleri;

public class Hayvan {

    private String adi;
    private Integer kosmaHizi;

    public void beslen(){
        System.out.println("Hayvan beslenıyor");
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Integer getKosmaHizi() {
        return kosmaHizi;
    }

    public void setKosmaHizi(Integer kosmaHizi) {
        if (kosmaHizi<0){
            System.out.println("Hiz degeri 0 dan kucuk olamaz");
            return;
        }
        this.kosmaHizi = kosmaHizi;

    }
}
