package Dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumCoins {
   static boolean found = false;
    static List<Integer> countCoins(int[] coins, int target, List<Integer> result, int index){
        if(target == 0){
            found = true;
            return result;
        }
        if(index < 0){
            return result;
        }
        for(int i = index;i>=0;i--){
            if(found){
                break;
            }
            if(coins[i] <= target){ // we take value only if it is less than target value
                //take that value
                result.add(coins[i]);
                countCoins(coins,target-coins[i],result, index);//reduce the target value and count the same index
            }//if coin value > target value , we should not pick it
            else{
                countCoins(coins, target, result, index-1);
                //move to next index coin
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] coins = {2};
        List<Integer> list = countCoins(coins, 3, new ArrayList<>(), coins.length-1);
        list.forEach(System.out::print);
    }
}
