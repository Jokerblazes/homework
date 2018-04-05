package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        final int base = 3;
        for (Map.Entry<String, List<String>> listEntry:
                object.entrySet()){
            for (String s : listEntry.getValue()) {
                Integer number = collectionA.get(s);
                if (number != null) {
                    int reduceNum = - number / base;
                    collectionA.merge(s,reduceNum,(a,b) -> a + b);
                }
            }
        }
        return collectionA;
    }
}
