package interfaces.functional;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface FunB extends FUNA{
    void msg();

    public static int[] maiin(String[] args) {
        List<Integer> ne = new ArrayList<>();
        ne.add(1);
        return ne.stream().mapToInt(i -> i).toArray();
    }
}
