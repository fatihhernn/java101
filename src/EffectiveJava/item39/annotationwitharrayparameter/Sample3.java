package EffectiveJava.item39.annotationwitharrayparameter;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

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

    @ExceptionTest({ArithmeticException.class,NullPointerException.class})
    public static void doublyBad(){
        List<String> list=new ArrayList<>();
        list.add(5,null);
    }
}
