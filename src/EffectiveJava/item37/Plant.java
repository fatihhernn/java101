package EffectiveJava.item37;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Plant {

    enum Lifecycle{
        ANNUAL,PERENNIAL,BIENNIAL
    }
    final String name;
    final Lifecycle lifecycle;

    public Plant(String name, Lifecycle lifecycle) {
        this.name = name;
        this.lifecycle = lifecycle;
    }

    @Override
    public String toString() {
        return name;
    }
    //bitkilerimiz var ve bunların kimisi tek yıl kimisi 2 yıl kimisi çok yıllar yaşayabiiyor
    public static void main(String[] args) {
        Plant[] garden={new Plant("Basil",Lifecycle.ANNUAL),new Plant("Carroway",Lifecycle.BIENNIAL),new Plant("Dill",Lifecycle.ANNUAL),
                new Plant("Lavender",Lifecycle.PERENNIAL),new Plant("Parsley",Lifecycle.BIENNIAL),new Plant("Rosemary",Lifecycle.PERENNIAL)
        };

        Set<Plant>[] plantByLifeCycleArr=(Set<Plant>[]) new Set[Plant.Lifecycle.values().length]; //kontrolsüz tür dönüşümü ve indislerle uğraşmak zorunda bırakır

        for (int i = 0; i < plantByLifeCycleArr.length; i++) {
            plantByLifeCycleArr[i]=new HashSet<>();
        }
        for (Plant p:garden){
            plantByLifeCycleArr[p.lifecycle.ordinal()].add(p);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < plantByLifeCycleArr.length; i++) {
            System.out.printf("%s : %s%n",Plant.Lifecycle.values()[i],plantByLifeCycleArr[i]);
        }
        System.out.println("-----------------------");

        Map<Plant.Lifecycle,Set<Plant>> plantByLifeCycle=new EnumMap<>(Plant.Lifecycle.class);
        for (Plant.Lifecycle lifecycle:Plant.Lifecycle.values()){  //enumların değerlerini key olarak ekledim
            plantByLifeCycle.put(lifecycle,new HashSet<>());
        }
        for (Plant p:garden){
            plantByLifeCycle.get(p.lifecycle).add(p); // keyleri get edip listeme ekle
        }
        System.out.println(plantByLifeCycle);
        System.out.println("-----------------------");
        System.out.println(Arrays.stream(garden).collect(groupingBy(p->p.lifecycle)));
    }
}
