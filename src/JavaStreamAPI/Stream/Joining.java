package JavaStreamAPI.Stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Joining {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        System.out.println(namesToStringStream(collection));

    }

    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToStringStream(List<Person> people) {
       return new StringBuilder("Names: ").append(
                        people.stream()
                       .map(Person::getName)
                       .reduce((i,sum)->i+", "+sum)
                       .orElse(""))
                        .append(".")
                        .toString();

    }
    public static String namesToStringJoining(List<Person> people) {
        return "Names: "+
                people.stream()
                    .map(Person::getName)
                .collect(Collectors.joining(","))+".";
    }

}

