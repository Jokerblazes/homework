package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<String,List<String>> entry:
        collection2.entrySet()) {
            for (String s : entry.getValue()) {
                map.merge(s, 1, (a, b) -> a + b);
            }
        }

        for (String s : collection1) {
            Integer integer = map.get(s);
            if (integer != null && integer > 0) {
                result.add(s);
                if (integer == 1)
                    map.remove(s);
                else
                    map.put(s,integer - 1);
            }
        }
        return result;
    }
}
