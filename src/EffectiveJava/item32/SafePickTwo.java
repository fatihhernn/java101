package EffectiveJava.item32;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SafePickTwo {
    public static void main(String[] args) {
        List<String> attr=pickTwo("Good","Fast","Cheap");
        System.out.println(attr);
    }
    private static <T> List<T> pickTwo(T a,T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0:
                return List.of(a, b);
            case 1:
                return List.of(b, c);
            case 2:
                return List.of(a, c);
        }
        throw new AssertionError();
    }
}
