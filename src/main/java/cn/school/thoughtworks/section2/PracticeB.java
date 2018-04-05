package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        final char zero = '0';
        for (String s : collection1) {
            if (s.length() != 1) {
                char c = s.charAt(0);
                char number = s.charAt(2);
                result.merge(String.valueOf(c), Integer.valueOf(number - zero), (a, b) -> a + b);
            } else {
                result.merge(s,1,(a,b) -> a + b);
            }
        }
        return result;
    }
}
