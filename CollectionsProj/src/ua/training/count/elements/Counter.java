package ua.training.count.elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {
    private static Map<Integer, Integer> map;
    static {
        map = new HashMap<>();
    }

    public static Map<Integer, Integer> countElements(List<Integer> list){
        if(list != null){
            for (int i = 0; i < list.size(); i++) {
                int elem = list.get(i);
                if (map.containsKey(elem)) {
                    int value = map.get(elem);
                    value++;
                    map.replace(elem, value);
                } else {
                    map.put(elem, 1);
                }
            }
        }else{
            throw new NullPointerException("List parameter was null!");
        }
        return map;
    }
}
