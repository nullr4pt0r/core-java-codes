package zoho;

class Result {

    /*
     * Complete the 'solution' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING n as parameter.
     */

    public static int solution(String n) {
        if(n.isEmpty() || n == null){
            return 0;
        }
        // Your logic goes here
        StringBuilder sb = new StringBuilder();
        int size = n.length();
        //find the digits
        n = new StringBuilder(n).reverse().toString();
        for(int i=0;i<size;i++){
            if(i%2 == 0){
                int num = Integer.parseInt(String.valueOf(n.charAt(i)));
                num *= 2;
                if(num > 10){
                    num -= 9;
                }
                sb.append(num);
            }else{
                sb.append(n.charAt(i));
            }
        }
        //check if it is multiple of 10

        int ans = 0;
        int num = Integer.parseInt(sb.toString());
        while(num>0){
           int res = num % 10;
            num = num / 10;
            ans += res;
        }
        if(ans % 10 == 0){
            return ans;
        }
        ans = ans % 5;
        return 5 - ans;
    }

}

public class CheckSum {
    public static void main(String[] args)  {
     String n = "13";
        System.out.println(Result.solution(n));
    }
}
