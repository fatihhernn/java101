package EffectiveJava.item32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PickTwo {
    public static void main(String[] args) {
        String[] attr=pickTwo("Good","Fast","Cheap");
        System.out.println(Arrays.toString(attr));
    }

    private static <T> T[] pickTwo(T a,T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0:
                return toArray(a, b);
            case 1:
                return toArray(b, c);
            case 2:
                return toArray(a, c);
        }
                throw new AssertionError();
    }

    private static <T> T[] toArray(T... args) {// tipin ne olduğu bilinmiyor. nesne oluştururken obje olarak oluşturuyor => Object[]
        return args;
    }

    //List<Object> objects=new ArrayList<String>(); yazılamadığı için üst tarafta yazılan metotda kullanılmaz
}
