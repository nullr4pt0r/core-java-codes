package completesearch;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsetBits {

    static void generateSubset(int n){
        for(int b = 0;b < (1 << n);b++){
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((b & (1 << i)) != 0)
                    subset.add(i);
            }

            System.out.print("Subset " + b + ": {");
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));
                if (i < subset.size() - 1) System.out.print(",");
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Generating Subsets : ");
        generateSubset(n);
    }
}
