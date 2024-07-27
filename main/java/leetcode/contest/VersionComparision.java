package leetcode.contest;

public class VersionComparision {

   static public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int res = 0;
       int i = 0;
        for (; i < v1.length; i++) {
            //iterate v1

            //compare with v2

            if (i >= v2.length) {
                break;
            }
//            res = v1[i].compareTo(v2[i]);
            res = Integer.valueOf(v1[i]).compareTo(Integer.valueOf(v2[i]));
            if (res != 0) {
                return res;
            }
        }

       while (i < v1.length) {
           res = Integer.valueOf(v1[i]).compareTo(0);
           i++;
           if (res != 0) {
               return res;
           }
       }
       while (i < v2.length) {
           res = Integer.valueOf(0).compareTo(Integer.valueOf(v2[i]));
           i++;
           if (res != 0) {
               return res;
           }
       }
       return res;
    }

    public static void main(String[] args) {
        String v1 = "1";
        String v2 = "1.1";

        System.out.println(compareVersion(v1,v2));
    }
}