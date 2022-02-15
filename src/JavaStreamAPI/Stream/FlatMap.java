package JavaStreamAPI.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

    }
    /*
    {
        {A, B, C},
        {D, E, F}

        {A1, B1, C1},
        {D1, E1, F1}
    }
     */

    //Nested list'e ait değerleri al                => stream()
    //her bir elemanı bir listeye ekle değeri dön   => flatMap()
    public static List<String> transform(List<List<String>> collection) {
        //collection.get(0).get(0)
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform2(List<List<String>> collection) {
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

}
