package cn.school.thoughtworks.section3;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> coolectionC = new HashMap<>();
        for (String s : collectionA) {
            coolectionC.merge(s,1,(a,b) -> a + b);
        }
        PracticeB practiceB = new PracticeB();
        return practiceB.createUpdatedCollection(coolectionC,object);
    }
}
