package EffectiveJava.item1;

public class Fenerbahce {
    private String yeniFutbolcu;
    private int yas;

    //1.ctor => aslında birden fazla ctor oluşturulabilir
    public Fenerbahce(String yeniFutbolcu, int yas) {
        this.yeniFutbolcu = yeniFutbolcu;
        this.yas = yas;
    }

    //2.ctor
    public Fenerbahce(String yeniFutbolcu) {
        this.yeniFutbolcu = yeniFutbolcu;
    }

    public static Fenerbahce yeniFutbolcuUret(String yeniFutbolcu){
        return new Fenerbahce(yeniFutbolcu,22);
    }

    public String getYeniFutbolcu() {
        return yeniFutbolcu;
    }

    public void setYeniFutbolcu(String yeniFutbolcu) {
        this.yeniFutbolcu = yeniFutbolcu;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
