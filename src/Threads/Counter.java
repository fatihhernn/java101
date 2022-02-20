package Threads;

public class Counter {

    private int count;

    public synchronized void increment(){
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    /**
     * ya increment metodunu sycronized ekle ya da int tipini AtomicInteger'a çevir
     */
}
