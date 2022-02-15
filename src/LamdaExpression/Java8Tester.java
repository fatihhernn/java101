package LamdaExpression;

public class Java8Tester {
    public static void main(String[] args) {

        Java8Tester tester=new Java8Tester();

        MathOperation addition=(int a,int b)->a+b;
        addition.operation(5,7);

        MathOperation subtraction =( a, b)->a-b;
        addition.operation(5,7);

        MathOperation multiplication  =(int a,int b)-> {
            return a * b;
        };

        MathOperation division=(a,b)->a/b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        GreetingMessage greetingMessage=(message -> System.out.println("Hello "+message));

        greetingMessage.sayMessage("Fatih");
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }


}

@FunctionalInterface
interface MathOperation{
    int operation(int a,int b);
}

@FunctionalInterface
interface GreetingMessage{
    void sayMessage(String message);
}

