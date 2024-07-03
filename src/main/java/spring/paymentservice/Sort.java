package spring.paymentservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args){
        //List<Integer> scores = Arrays.asList(5, 7, 1, 4, 3);
        List<String> scores = Arrays.asList("k", "j", "h", "spring", "java");
        // 기존
//        Collections.sort(scores, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
        // 람다
        Collections.sort(scores, (o1, o2) -> o1.length() - o2.length());
        // Comparator 사용하게 변경
        Collections.sort(scores, Comparator.comparingInt(String::length));
        scores.forEach(System.out::println);
    }
}
