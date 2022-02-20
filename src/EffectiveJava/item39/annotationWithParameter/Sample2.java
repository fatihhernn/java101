package EffectiveJava.item39.annotationWithParameter;

public class Sample2 {

    /**
     * eğer bu method bana bu hatayı atıyorsa benim için bu test geçerli bir testdir
     * bu annotation parametre alabildiğini annotationda belirtmiştik
     */
    @ExceptionTest(ArithmeticException.class)
    public static void m1(){//test should pass
        int i=0;
        i=i/i;
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m2(){ // should fail (wrong ex) çünkü biz sadece aritmetic exlerde bunu geçerli kılıyoruz => patlar
        int[] a=new int[0];
        int i=a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3(){
        //should fail (no exception) , çünkü burada ex bekleniyor => patlar
    }
}
