package JavaStreamAPI.Stream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFiveStream("william", "jones", "aaron", "seppe", "frank", "gilliam"));
    }

    //gelen arrayin elemanlarını al                         => stream()
    //5 ten uzun isimleri filtrele                          => filter()
    // Geri kalan listedeeki tüm harfleri sayisini getir    => mapToInt()
    //harf sayilarini topla                                 => sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFiveStream(String... names) {
        return Arrays.stream(names)
                .parallel()
                .filter(name -> name.length()>5)
                .mapToInt(String::length)
                .sum();
    }
}
