package aaaa.binarysearch;

import java.util.HashMap;
import java.util.Map;

public class TimeKeyMap {
    Map<String, Map<Integer, String>> timeMap;
    public TimeKeyMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timeMap.computeIfAbsent(key, (k)-> new HashMap<Integer, String>()).put(timestamp, value);

    }

    public String get(String key, int timestamp) {
         return   timeMap.get(key).get(timestamp);
    }

    public static void main(String[] args) {

    }
}
