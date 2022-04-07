package programming.practice;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Features {
    public static void main(String[] as) {

        Predicate<Integer> odd = x->x%2!=0;
        List<Integer> numbers = Arrays.asList(1, 1,7, 2, 1, 4, 3, 2, 5, 5);
        List<Integer> uniqueOdd = numbers.stream().distinct().filter(odd).collect(Collectors.toList());

        System.out.println(uniqueOdd);


        OptionalDouble avg = uniqueOdd.stream().mapToInt(x->x).average();

        //Integer avg1 = uniqueOdd.stream().collect(Collectors.averagingInt(x->x.intValue()));

        System.out.println(avg);



        ConcurrentHashMap map = new ConcurrentHashMap();

        map.put("A",1);
        map.put("B",2);
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(map.get(s));
            if(!map.containsKey("C"))map.put("C",3);

        }
        System.out.println(map);

    }
}
