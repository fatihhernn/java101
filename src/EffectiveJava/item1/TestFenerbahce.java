package EffectiveJava.item1;

public class TestFenerbahce {
    public static void main(String[] args) {
        Fenerbahce fenerbahce=new Fenerbahce("Mesut",22);
        Fenerbahce fenerbahce1=new Fenerbahce("Alex",21);

        Fenerbahce f= Fenerbahce.yeniFutbolcuUret("ronaldo");
        System.out.println(f.getYeniFutbolcu());
        System.out.println(f.getYas());

        //Fenerbahce fenerbahce2=new Fenerbahce()
    }
}
