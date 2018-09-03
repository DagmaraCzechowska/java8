package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Edward", "Czechowski", 32);
        Person person2 = new Person("Anna", "Wesołowska", 43);
        Person person3 = new Person("Dariusz", "Nowak", 28);
        Person person4 = new Person("Olga", "Paluszkiewicz", 22);
        Person person5 = new Person("Zuzanna", "Czechowska", 86);
        Person person6 = new Person("Róża", "Fiołek", 20);

        List<Person> people = Arrays.asList(person1,person2,person3,person4,person5,person6);

        //Consumer cons = person -> System.out.println(person);

        consumeList(people, (person -> System.out.println(person)));
        //consumeList(people, (System.out::println));

    }

    //interfejs funkcyjny
    static <T> void consumeList(List<T> list, Consumer <T> consumer){
        for (T t: list){
            consumer.accept(t);
        }
    }
}
