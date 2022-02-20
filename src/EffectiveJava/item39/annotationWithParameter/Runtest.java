package EffectiveJava.item39.annotationWithParameter;

public class Runtest {

    public static void main(String[] args) throws ClassNotFoundException {
        int tests=0;
        int passed=0;
/*
        Class<?> testClass=Class.forName("EffectiveJava.item39.annotationwithparameter.Sample2");
        for (Method m:testClass.getDeclaredMethods()){
            if (m.isAnnotationPresent(ExceptionTest.class)){
                tests++;
                try{
                    m.invoke(null);
                    System.out.printf("Test %s failed : no exception%n",m);
                } catch (InvocationTargetException | IllegalAccessException wrappedExc) {
                    Throwable exc=wrappedExc.getCause();
                    int oldPassed=passed;
                    Class<? extends Throwable> excTypes=m.getAnnotation(ExceptionTest.class).value();
                    for (Class<? extends Throwable> excType : excTypes){
                        if (excType.isInstance(exc)){ //alinan hatanın değeri bizim değerle eş ise başarılı olarak
                            passed++;
                            break;
                        }
                }
            }
        }
        System.out.printf("Passed %d , Failed %d%n",passed,tests-passed);
 */
    }

}
