package aaaa.binarysearch;

public class Koko {
    static public int minEatingSpeed(int[] piles, int h) {
        int min = 0;
        int max = Integer.MIN_VALUE;

        for(int i:piles){
            min += i;
            max = Math.max(max, i);
        }
        int start = min/h, end = max;
        int res = Integer.MAX_VALUE;
        while(start < end){
            int mid = (start + end)/2;
            int k = findKBanana(mid, piles);
            if(k <= h){
                res = Math.min(mid,res);
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return res;
    }

  static  int findKBanana(int banana, int[] pile){
        int hour = 1;
        int k = 0;
        for(int i=0;i<pile.length;i++){
            if(k+pile[i] < banana){
                k += pile[i];
            }else{
                hour++;
                k = pile[i];
            }
        }
        return hour;
    }
    public static void main(String[] args) {
        int[] pile = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(pile, h));
    }
}
