package programming.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxOccurances {


    public static void main(String[] as) {
        String str = "abbccd";
        int count = 0;
        Map map = new HashMap<>();
        char[] chars = str.toCharArray();

        /****Process1*****/
        /*
        for(int i=0;i<chars.length;i++){
            String s = chars[i]+"";
            for(int j=0;j<chars.length;j++){
                String s2 = chars[j]+"";
                if(s2.equals(s)){
                   count++;
                }
            }
            map.put(s,count);
            count = 0;
        }*/

        /**process2****/
        for(int i=0;i<chars.length;i++){
            String s = chars[i]+"";

            if(map.containsKey(s)){//if map contains collect the value as count, increase the count by 1

                count = (Integer) map.get(s);
                count++;

            }else
            {
                count = 1;//if doesn't contain set count=1
            }
            map.put(s,count);
        }
        System.out.println(map);
        /*****process3 - Java8****/
        List list = Arrays.asList("cat","dog","camel","cat","rat");//Arrays.asList(chars);
        Map<String, Integer> fMap = (Map) list.stream()
                .collect(Collectors.groupingBy(x->x.toString(),Collectors.counting()));

        System.out.println(fMap);

        
        Long is = (Long) list.stream().collect(Collectors.counting());
        //OptionalInt in = is.max();
       // Integer in2 = is.max().orElse(Integer.MAX_VALUE);
//System.out.println("Max:: "+in2);


        /*MAX Int from a list of integers*/
        List<Integer> integerList = Arrays.asList(1,2,3,4,2,1,2,4);

        OptionalInt s1 = integerList.stream().mapToInt(x->x).max();
        Integer s2 = integerList.stream().mapToInt(x->x).max().orElse(Integer.MAX_VALUE);

        List l1 = integerList.stream().filter(x->x/2==0).collect(Collectors.toList());//even numbers


    }
}
