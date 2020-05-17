package CiftlikApp;

public abstract class Hayvanlar {
    public abstract void beslenme();

    private Integer ayakSayisi;

    public Integer getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(Integer ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
}
