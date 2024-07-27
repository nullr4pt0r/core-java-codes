package topics;

import java.util.*;


public class Modify {
    public static void main (String[] args) throws java.lang.Exception
    {

//        Integer[] spam = new Integer[] { 1, 2, 3 };
//        List<Integer> list = Arrays.asList(spam);
//
//        System.out.println( list ) ;
//
////        list = List.of(spam);
////        System.out.println(list);
//
//        for(Integer i:list){
//            System.out.println(i);
//            list.add(17);
//        }


//        list.set(0,12);
//        System.out.println(list);


//        Set<Integer> s = new HashSet<>();
//        s.addAll(list);
//
//        Iterator<Integer> ii = s.iterator();
//        while(ii.hasNext()){
//            System.out.println(ii.next());
//            s.add(15);
//        }



        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        System.out.println(list);

//        for(int i:list){
//            System.out.println(i);
////            list.add(177);
////            list.set(i,12);
//        }
//        System.out.println(list);
//
//        list modify panradhuna ?
//            list.set(index, value) => kedayadhu
//            list.add  or list.remove

        Set<Integer> set = new HashSet<>();
        set.addAll(list);

      Iterator<Integer> i = set.iterator();

      while(i.hasNext()){
          System.out.println(i.next());
            i.remove();
      }

        System.out.println(set);
    }
}
