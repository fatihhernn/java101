package EffectiveJava.item46;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilePermission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class SideEffectFree {
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("C:\\Users\\Lenovo\\Desktop\\test.txt");

        /*
        // Uses the streams API but not the paradigm--Don't do this!
        Map<String, Long> freq = new HashMap<>();
        try (Stream<String> words = new Scanner(file).tokens()) {
            words.forEach(word -> {
                freq.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }

        System.out.println(freq);

         */
        // Proper use of streams to initialize a frequency table
        Map<String, Long> freq;
        try (Stream<String> words = new Scanner(file).tokens()) {
            freq = words.collect(groupingBy(String::toLowerCase, counting()));
        }
        System.out.println(freq);

        /*
        forEach işlemi, hesaplamayı gerçekleştirmek için değil, yalnızca bir akış hesaplamasının sonucunu bildirmek için kullanılmalıdır.
         */

        //Bir sıklık tablosundan ilk on kelime listesini almak için ardışık düzen
        List<String> topTen = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(5)
                .collect(toList());
        System.out.println(topTen);


        //streamler daha okunaklı hale getirdiğinden, tüm Collectors üyelerini statik olarak içe aktarmak geleneksel ve akıllıcadır.



    }
}
