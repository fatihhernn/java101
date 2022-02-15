package EffectiveJava.item3;

public class Item3Test {
    public static void main(String[] args) {
        /*
        DefineSingleton defineSingleton=DefineSingleton.getInstance();
        DefineSingleton defineSingleton1=DefineSingleton.ds;


        System.out.println(defineSingleton.hashCode());
        System.out.println(defineSingleton1.hashCode());

         */

        //2 THREAD aynı anda girdiğinde LAZY singleton prensibi korunamaz
        //EAGER ve ENUM sigleton prensibine uygular
        // önerilen ENUM dur. private ctor yoktur;

        new Thread(() -> {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hash code of Lazy : "+ LazyCache.getInstance().hashCode());
            System.out.println("Hash code of Eager : "+ EagerCache.getInstance().hashCode());
            System.out.println("Hash code of Enum : "+ CacheSingleton.INSTANCE.hashCode());
        }).start();

        new Thread(() -> {

            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hash code of Lazy : "+ LazyCache.getInstance().hashCode());
            System.out.println("Hash code of Eager : "+ EagerCache.getInstance().hashCode());
            System.out.println("Hash code of Enum : "+ CacheSingleton.INSTANCE.hashCode());
        }).start();
    }
}
