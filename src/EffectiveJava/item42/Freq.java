package EffectiveJava.item42;

import java.util.Map;
import java.util.TreeMap;

public class Freq {
    public static void main(String[] args) {
        Map<String ,Integer> freqTable=new TreeMap<>();

        for (String s :
                args) {
            freqTable.merge(s,s.length() , (count, incr) -> count + incr);

        }
        System.out.println(freqTable);

        freqTable.clear();
        for (String s :
                args) {
            freqTable.merge(s, 1, Integer::sum);

        }
        System.out.println(freqTable);
    }
}
