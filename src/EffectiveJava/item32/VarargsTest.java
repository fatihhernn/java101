package EffectiveJava.item32;

import java.util.List;

public class VarargsTest {
    public static void main(String[] args) {
        dangerous(List.of("There be dragons"));
    }
    static void dangerous(List<String>... strLists){
        List<Integer> integers=List.of(42);
        Object[] objects=strLists;
        objects[0]=integers; //karmaşıklığa yol açar ..

        String s =strLists[0].get(0); //.ClassCastException => generic tipler arrayize edilemez
    }
}
