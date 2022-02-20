package EffectiveJava.item39.markerAnnotation;

public class Sample {

    @Test
    public static void m1(){
        //test should pass
    }
    public static void m2(){
        //test should pass
    }
    @Test
    public static void m3(){
        throw new RuntimeException("Boom");
    }
    public static void m4(){
        //test should pass
    }

    @Test
    public void m5(){
        //INVALID USE : nonstatic method
    }

    public static void m6(){
        //test should pass
    }

    @Test
    public static void m7(){//test should fail
        throw new RuntimeException("Crash");
    }

}
