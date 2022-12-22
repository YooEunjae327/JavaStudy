package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class st {
    public static void main(String[] args) {
        String[] strArr = {"data1", "data2", "data3", "data3"};
        List<String> strList = Arrays.asList(strArr);

        Arrays.sort(strArr);
        Collections.sort(strList);

        // 기존 방식
        for(String str : strArr) {
            System.out.println(str);
        }

        for(String str : strList) {
            System.out.println(str);
        }

        // stream 사용
        strList.stream().sorted().forEach(System.out::println);
        Arrays.stream(strArr).sorted().forEach(System.out::println);

        // stream 람다 사용
        strList.stream().sorted().forEach(x -> System.out.println(x));

        Arrays.stream(strArr)
                .distinct()
                .limit(5)
                .sorted()
                .forEach(System.out::print);
    }
}
