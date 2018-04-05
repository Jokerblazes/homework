package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        final char zero = '0';
        for (String s : collectionA) {
            if (s.length() != 1) {
                char c = s.charAt(0);
                char number = s.charAt(2);
                result.merge(String.valueOf(c), number - zero, (a, b) -> a + b);
            } else {
                result.merge(s,1,(a,b) -> a + b);
            }
        }

        PracticeB practiceB = new PracticeB();
        return practiceB.createUpdatedCollection(result,object);
    }
}
