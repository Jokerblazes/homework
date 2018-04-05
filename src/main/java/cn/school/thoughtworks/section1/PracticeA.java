package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        /*
        * 集合中可能会出现重复的字母
        * 使用map
        * key记录字母
        * value记录次数
        * */
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : collection2) {
            map.merge(s, 1, (a, b) -> a + b);
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
