package leetcode.contest;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    static public String minWindow(String s, String t) {
        String res = "";

        //again minimum windo substring implies sliding window
        int l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i),0)+1);
        }

        r = t.length()-1;
        while(r < s.length()){

                //compare
                if(compare(smap, map)){
                    if(res.isEmpty() || res.length() > r-l+1){
                        res = s.substring(l,r+1);
                    }
                    char ch = s.charAt(l);
                    smap.put(ch, smap.get(ch)-1);
                    if(smap.get(s.charAt(l)) == 0){
                        smap.remove(s.charAt(l));
                    }
                    l++;

            }else{
                    r++;
                    if(r == s.length()){
                        break;
                    }
                    smap.put(s.charAt(r), smap.getOrDefault(s.charAt(r), 0)+1);
            }

        }

        return res;
    }

   static boolean compare(Map<Character, Integer> smap, Map<Character, Integer> tmap){
        for(char key:tmap.keySet()){
            if(!smap.containsKey(key) || smap.get(key) < tmap.get(key)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
