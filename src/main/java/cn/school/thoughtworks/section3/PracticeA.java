package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        final int reduceNumber = -1;
        for (Map.Entry<String, List<String>> listEntry:
        object.entrySet()){
            for (String s : listEntry.getValue()) {
                if (collectionA.get(s) != null) {
                    collectionA.merge(s, reduceNumber,(a, b) -> a + b);
                }
            }
        }
        return collectionA;
    }
}
