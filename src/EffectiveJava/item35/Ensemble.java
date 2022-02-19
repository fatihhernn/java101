package EffectiveJava.item35;

public enum  Ensemble {
    SOLO(1),DUET(2),TRIO(3),QUARTER(4);
    //11 koro yok bu seneryao için en iyi uygulaması bu

    private final int numberOfMusician;

    Ensemble(int size) {
        this.numberOfMusician=size;
    }

    public static void main(String[] args) {
        System.out.println(Ensemble.DUET.numberOfMusician);
    }
}
