package zoho;


import java.util.ArrayList;
import java.util.List;

public class RemoveFragments {

        //consecutive check
    static boolean concheck(List<String> list1, List<String> frag){
        for(String str:list1){
            if(frag.contains(str)){
                int fragIndex = frag.indexOf(str);
                int index = list1.indexOf(str);
                if(check(index, fragIndex, list1, frag)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean check(int index, int fragIndex,List<String> list1, List<String> frag){
        int count = 0;

        for(int i=index;i<list1.size() && fragIndex < frag.size();i++){
            if(count == 3){
                return true;
            }
            if(frag.get(fragIndex).contains(list1.get(i))) {
                count++;
                fragIndex++;
            }else if(count > 0){
                return false;
            }
        }
        return count == 3;
    }

    public static void main(String[] args) {
        String a = "Every morning I want to do exercise";
        String b = "Every morning I want to meditate";
        String c = "It is important I want do happy";

        //find the consecutive words that are common on all 3 sentence
        //check if consecutive word count == 3
        //yes => remove those words. no just print them as it is

        solve(a,b,c);
    }

    //how to find the consecutive words.
    //length of each sentence are diff. so 3 pointers wont help
    //we first get the words in array.
    //then check the words of 2nd sentence with the first to get the consecutive words

    static void solve(String a, String b, String c){
        List<String> list1 = List.of(a.split(" "));
        List<String> list2 = List.of(b.split(" "));
        List<String> list3 = List.of(c.split(" "));

        List<String> frag = new ArrayList<>();
        for(String str:list2){
            if(list1.contains(str)){
                frag.add(str);
            }
        }

        List<String> finalList = new ArrayList<>();
        if(concheck(list2, frag)) {
            for (String str : list3) {
                if (frag.contains(str)) {
                    finalList.add(str);
                }
            }
        }

        if(concheck(list3, finalList) && finalList.size() == 3){
           a =  makeString(list1, finalList);
           b =  makeString(list2, finalList);
           c =  makeString(list3, finalList);
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    static String makeString(List<String> list1, List<String> finalList){
        StringBuilder sb = new StringBuilder();
        for(String st:list1){
            if(!finalList.contains(st)){
                sb.append(st);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
