package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        //numbers.stream().forEach(number-> System.out.println(number));
//        List<Integer> list = numbers.stream()
//                .filter(number ->number %2==0)
//                .map(number-> number*2)
//                .collect(Collectors.toList());
//                //.peek(number -> System.out.print(number + " "))
//                //.map(number-> number*2)
//                //.peek(number -> System.out.print(number + " "))
//               // .collect(Collectors.toList());
//        System.out.println(list);

        Integer list2 = numbers.stream()
                .filter(number ->number >10)
                .map(number-> number*10)
                .min(Integer::compareTo)
                .get();
                //.collect(Collectors.toList());

        System.out.println(list2);

        List<String> listOfNames = Arrays.asList("Dagmara","Dariusz","Anna","Maik","Edward","Olga");

        //lista
        //imiona > 5liter,
        //wszystkie do Uppercase(wielkie litery)
        //dokleic @ do kazdego imienia
        // ograniczyc liste do 2 os.
        //wyswietlic
        listOfNames.stream()
                .filter(name -> name.length()>5)
                .map(name -> name.toUpperCase())
                .map(name -> "@" + name)
                .limit(2).forEach(System.out::println);

    }
}
