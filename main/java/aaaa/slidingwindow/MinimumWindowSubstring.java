package aaaa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
   static boolean check(Map<Character,Integer> sarr, Map<Character, Integer> tarr){
        for(char key:tarr.keySet()){
            if(!sarr.containsKey(key) || sarr.get(key)<tarr.get(key)){
                return false;
            }
        }
        return true;
    }
   static public String minWindow(String s, String t) {
        //tc
        //sc
        if(t.length() > s.length()){
            return "";
        }
        Map<Character,Integer> tmap = new HashMap();
        Map<Character,Integer> smap = new HashMap();
        for(int i=0;i<t.length();i++){
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i),0)+1);
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i),0)+1);
        }

        int l = 0, r = t.length()-1;
        int minWindow = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        while(true){
            if(check(smap, tmap)){
                if(r-l+1<minWindow){
                    minWindow = r-l+1;
                    sb.setLength(0);
                    sb.append(s.substring(l,r+1));

                }
                smap.put(s.charAt(l), smap.get(s.charAt(l))-1);
                l++;
            }else{
                r++;
                if(r >= s.length()){
                    break;
                }
                smap.put(s.charAt(r), smap.getOrDefault(s.charAt(r),0)+1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
