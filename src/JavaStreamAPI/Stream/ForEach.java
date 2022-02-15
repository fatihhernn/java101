package JavaStreamAPI.Stream;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,7,8,9,0);
        a.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);
    }
}
