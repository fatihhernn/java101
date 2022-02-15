package EffectiveJava.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {

    }

    public static final List<Cheese> cheesesInStock=new ArrayList<>();

    public static List<Cheese> getCheeses(){
        return cheesesInStock.isEmpty()?null:new ArrayList<>(cheesesInStock);
    }

    //Olası boş bir collection dönmenin doğru yolu
    public static List<Cheese> getCheeses2(){
        return new ArrayList<>(cheesesInStock);
    }

    //optimization - avoids allocating empty collections
    public static List<Cheese> getCheeses3(){
        return cheesesInStock.isEmpty()? Collections.emptyList():new ArrayList<>(cheesesInStock);
    }

    //Olası boş bir array dönmenin doğru yolu
    public Cheese[] getCheeses4(){
        return cheesesInStock.toArray(new Cheese[0]);
    }
    private static final Cheese[] EMPTY_CHEESE_ARRAY=new Cheese[0];

    public Cheese[] getCheeses5(){
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }
}
