import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Sett {
    public static String customSortString(String order, String s) {
        Map<Character, Integer> set = new HashMap<>();
        for(char ch:s.toCharArray()){
            set.put(ch, set.getOrDefault(ch, 0)+1);
        }

        StringBuilder str = new StringBuilder();
        for(char ch:order.toCharArray()){
            if(set.containsKey(ch)){
                str.append(ch);
                set.put(ch, set.get(ch)-1);
                if(set.get(ch)==0){
                    set.remove(ch);
                }
            }
        }

        for(char ch:set.keySet()){
            for(int i=0; i<set.get(ch); i++){
                str.append(ch);
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        System.out.println(customSortString("kqep", "pekeq"));
    }
}