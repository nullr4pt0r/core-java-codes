package BitManipulation;

public class RangeOfnd {
    public static void main(String[] args) {
        int left = 5;
        int right = 7;

        int s = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            s++;
        }

        left = left << s;
        System.out.println(left);
    }
}
