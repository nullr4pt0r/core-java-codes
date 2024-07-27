package zoho;

public class EditDistanceRecursion {

    static int solve(String s1, String s2){

        //base case
        if(s1.isEmpty()){
            return s2.length();
        }
        if(s2.isEmpty()){
            return s1.length();
        }
        int i = s1.length()-1,j=s2.length()-1;
        if(s1.charAt(i) ==s2.charAt(j)){
            int result = solve(s1.substring(0,i), s2.substring(0,j));
        }else{
//            int result = //min of insert, delete, replace
//                  /
        }

return 1;
    }

    public static void main(String[] args) {

    }
}
