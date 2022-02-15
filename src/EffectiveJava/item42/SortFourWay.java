package EffectiveJava.item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortFourWay {
    public static void main(String[] args) {


        //array oluşturup içerisini stringlerle doldu
        String[] namaList={"veli","furkan","berna","zeynep","pınar","furkan","ali"};

        //array'i listeye ata
        List<String> words= Arrays.asList(namaList);

        System.out.println(words);


        //baş harflerine göre sırala anonymous class instance as a function object - obsolute!
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.charAt(0),o2.charAt(0));
            }
        });
        System.out.println(words);
        System.out.println("---------------------------------------");

        Collections.shuffle(words);
        System.out.println(words);

        // Lambda expression as a function object (replaces anonymous class )
        Collections.sort(words,(s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(words);
        System.out.println("---------------------------------------");

        Collections.shuffle(words);
        System.out.println(words);


        Collections.sort(words,Comparator.comparingInt(String::length));
        System.out.println(words);
        System.out.println("---------------------------------------");

        Collections.shuffle(words);
        System.out.println(words);

        //default method List.sort in conjuction with comparator constructor method
        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);



    }
}
