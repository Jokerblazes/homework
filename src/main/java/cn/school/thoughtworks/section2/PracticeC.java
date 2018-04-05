package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection1) {
            if (s.length() == 1) {
                result.merge(s,1,(a,b) -> a + b);
            } else {
                String c = String.valueOf(s.charAt(0));
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < s.length(); i++) {
                    char temp = s.charAt(i);
                    if (temp >= '0' && temp <='9')
                        sb.append(temp);
                }
                result.merge(c,Integer.parseInt(sb.toString()),(a,b) -> a + b);
            }
        }
        return result;
    }
}
