package kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemA {
    static class Result{
        List<Moves> list;
        boolean result;

        public Result(List<Moves> list, boolean result) {
            this.list = list;
            this.result = result;
        }
    }
    static class Moves{
        int i;
        int j;

        public Moves(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    static Result solve(int len, int[] coins){
        List<Moves> list = new ArrayList<>();



        //we can solve using 2 pointers

        int i = 0;
        int j = 1;

        while(i < len && j < len){
            if(i != j && coins[i] != 0 && coins[j] != 0){
            int a = coins[i];
            int b = coins[j];

                coins[i] = a-1;
                coins[j] = b-1;
                list.add(new Moves(i+1,j+1));
            }
            else if(coins[i] == 0){
                i++;
            }else{
                j++;
            }
        }



        for(int ii:coins){
            if(ii != 0){
                return new Result(list, false);
            }
        }
        return new Result(list, true);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] coins = new int[size];

        for(int i=0;i<size;i++){
            coins[i] = in.nextInt();
        }

       Result  result = solve(size, coins);
        System.out.println(result.result?"yes":"no");
        if(result.result){
            for(Moves move:result.list){
                System.out.println(move.i+" "+move.j);
            }
        }
    }
}
