package Threads;

public class Main {
    public static void main(String[] args) {
        //print5();

        /*
        Thread t1=new OrderProcessor();
        Thread t2=new OrderProcessor();

        t1.start();
        t2.start();
         */


        Thread t1=new Thread(()->{
            print5();
        },"Ahmet");

        Thread t3=new Thread(Main::print5,"Fatih");

        Thread t2=new Thread(new PaymentProcessor(),"Mehmet");

        t1.start();
        t2.start();
        t3.start();
    }

    private static void print5() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Count : "+i+" Thread: "+Thread.currentThread().getName());
        }
    }
    private static class OrderProcessor extends Thread{
        @Override
        public void run() {
            print5();
        }
    }
    private static class PaymentProcessor implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Count : "+i+" Thread: "+Thread.currentThread().getName());
            }
        }
    }
}
