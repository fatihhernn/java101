package EffectiveJava.item39.annotationwitharrayparameter;

import EffectiveJava.item39.annotationWithParameter.ExceptionTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests=0;
        int passed=0;

        Class<?> testClass=Class.forName("EffectiveJava.item39.annotationWithParameter.Sample2");
        for (Method m:testClass.getDeclaredMethods()){
            if (m.isAnnotationPresent(EffectiveJava.item39.annotationWithParameter.ExceptionTest.class)){
                tests++;
                try{
                    m.invoke(null);
                    System.out.printf("Test %s failed : no exception%n",m);
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc=wrappedExc.getCause();
                    Class<? extends Throwable> excType=m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)){ //alinan hatanın değeri bizim değerle eş ise başarılı olarak
                        passed++;
                    }
                    else {
                        System.out.printf("Test %s failed : excepted %s, got %s%n",m,excType.getName(),exc);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid @Test : "+m);
                }
            }
        }
        System.out.printf("Passed %d , Failed %d%n",passed,tests-passed);
    }
}
