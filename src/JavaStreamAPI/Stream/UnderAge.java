package JavaStreamAPI.Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class UnderAge {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        System.out.println(getKidNamesStream(collection));

    }


    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNamesStream(List<Person> people) {
        return people.stream().filter(person -> person.getAge()<18)  //Stream<Person>
                .map(person -> person.getName())                     //Stream<String> => "onur", "fatih", "onur"
                .collect(Collectors.toSet());                        //Set<String> => "onur", "fatih"  => set interface 1 den fazla aynı değeri tutmaz
    }

}
