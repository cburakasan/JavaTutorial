package JavaEgzersiz.OOPPresinpleri.Kalitim;

public abstract class Arac {
    private Integer motorGucu;
    private Integer kapasite;

    public void tasima(){
        System.out.println("araclar tasima yapar");
    }

    public abstract void aracRengi();
    public abstract void aracBilgisi(Long aracId);
    public Integer getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(Integer motorGucu) {
        this.motorGucu = motorGucu;
    }

    public Integer getKapasite() {
        return kapasite;
    }

    public void setKapasite(Integer kapasite) {
        this.kapasite = kapasite;
    }

}
