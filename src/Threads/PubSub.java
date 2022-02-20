package Threads;

public class PubSub extends Thread {

    //
    volatile boolean notified=false;

    /**
     *
     * boolean notified=false; => sleep is over yazılı kalır => heap'e yazılmaz => console'da sadece "Sleep is over". yazısı görünecek
     *
     * global değişken kendi dünyasında bir değer olur heap'e yansıtmadığımız için dışarıda müdahale etsek bile. Heap'e yansısa bile thread'e yansımayacak.
     * Ve oradai method belki hiçbir zaman bitmeyecek
     */

    @Override
    public void run() {
        while (!notified){

        }
        System.out.println("Message received");
    }

    public static void main(String[] args) throws InterruptedException {
        PubSub pubSub=new PubSub();
        pubSub.start();
        Thread.sleep(1000);
        System.out.println("Sleep is over.");
        pubSub.notified=true;
        pubSub.join(); // bu thread'in bitmesini bekler.
        System.out.println("PubSub is terminated.");
    }
}
