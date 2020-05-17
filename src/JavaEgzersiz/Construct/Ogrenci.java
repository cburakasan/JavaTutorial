package JavaEgzersiz.Construct;

public class Ogrenci {
    private String adi;
    private Integer okulNo;

    public Ogrenci(String adi,Integer okulNo){
        this.adi = adi;
        this.okulNo = okulNo;

    }
    public Ogrenci(){

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Integer getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(Integer okulNo) {
        this.okulNo = okulNo;
    }
}
