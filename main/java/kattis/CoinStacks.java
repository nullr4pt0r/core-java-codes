package kattis;

import java.util.*;

public class CoinStacks {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> coins = new ArrayList<>(size);

        for(int i=0;i<size;i++){
            coins.add(in.nextInt());
        }

        int sum = coins.stream().mapToInt(i -> i).sum();

        if(sum%2 != 0 || sum/2 < Collections.max(coins)){
            System.out.println("no");
        }
        else{
            System.out.println("yes");

            while(sum > 0){
                int maxIndex = coins.indexOf(Collections.max(coins));
                for(int i=0;i<size;i++){
                    if(i == maxIndex){
                        continue;
                    }
                    else if(coins.get(i) > 0){
                        System.out.println(maxIndex+1+" "+(i+1));
                        coins.set(maxIndex, coins.get(maxIndex)-1);
                        coins.set(i, coins.get(i)-1);
                        sum -= 2;
                        break;
                    }
                }
            }
        }
    }
}
