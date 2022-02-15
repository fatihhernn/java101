package JavaStreamAPI.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {

    public static void main(String[] args) {
        System.out.println(mapToUppercase("aaron", "frank", "william", "gilliam"));
    }

    //array elemanlarının tamamını al =>    stream()
    //buyuk harflere cevir =>    map()     <= transformasyon yapılacak
    //liste olarak geri dön => collect()
    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }
    public static Collection<String> mapToUppercaseStream(String... names) {
        //names arrayini for döngüsü olmadan stream açalım
        //stream adında collection çevirdi
        //stream bir collection değildir. bunu alıp zaten collectiona çavirecez
        //map bir for döngüsü görevi görüyor
        return Arrays.asList(names).stream()
                .map(name->name.toUpperCase())
                .collect(Collectors.toList());
    }


}

