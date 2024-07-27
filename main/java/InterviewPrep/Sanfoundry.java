package InterviewPrep;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sanfoundry {
    Sanfoundry() throws IOException {

    }
    public static void main(String[] args) {
        Integer num = 42;
        System.out.println(num.floatValue());
        System.out.println(~num);
        Double i = new Double(257.5);
        Double x = i.MIN_VALUE;
        System.out.println(x);
        HashMap<String, Integer> cart = new HashMap<>();
        // Adding elements in the cart map
        cart.put("Butter", 5);
        cart.put("Milk", 10);
        cart.put("Rice", 20);
        cart.put("Bread", 2);
        cart.put("Peanut", 2);
        // printing synchronized map from HashMap
        Map mapSynched = Collections.synchronizedMap(cart);
        System.out.println("Synchronized Map from HashMap: " + mapSynched);
    }
   }


