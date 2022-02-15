package EffectiveJava.item55;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestDrive {
    public static void main(String[] args) {
        List<Insan> insan0=new ArrayList<>();
        insan0=null;

        Insan insan=new Insan();
        insan.setName("fatih");
        insan.setSurname("eren");

        List<Insan> doluInsan=new ArrayList<>();
        doluInsan.add(insan);

        Optional<Insan> insan1=Optional.empty();

        //Optional<List<Insan>> insan2=Optional.of(insan0);

        Optional<List<Insan>> insan3=Optional.ofNullable(doluInsan);

        insan3.filter(ad->ad.get(0).getName().equalsIgnoreCase("Fatih")).ifPresent(System.out::println);


    }
}
