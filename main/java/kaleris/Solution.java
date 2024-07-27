package kaleris;

import java.util.*;

public class Solution {

    private static List<String> createCoupon(String name, String type, String amount) {
        List<String> coupon = new ArrayList<>();
        coupon.add(name);
        coupon.add(type);
        coupon.add(amount);
        return coupon;
    }
    static int findLowestNumber(List<List<String>> products, List<List<String>> discounts){
        double total = 0;
        Map<String, List<List<String>>> discountMap = new HashMap<>();

        // Create a map of discount tags, where each tag maps to a list of discounts
        for (List<String> discount : discounts) {
            String tag = discount.get(0);
            discountMap.computeIfAbsent(tag, k -> new ArrayList<>()).add(discount);
        }

        for (List<String> product : products) {

            double price = Double.parseDouble(product.get(0));
            double lowestPrice = price;

            // Check each discount tag for the product
            for (int i = 1; i < product.size(); i++) {
                String tag = product.get(i);
                if (discountMap.containsKey(tag)) {

                  lowestPrice = (int) discountMap.get(tag).stream().mapToDouble(disc -> {
                        int type = Integer.parseInt(disc.get(1));
                        double amount = Double.parseDouble(disc.get(2));
                        switch(type) {
                            case 0:
                                return amount;
                            case 1:
                                return price - (price * (amount / 100));
                            case 2:
                                return price - amount;
                            default:
                                return price;
                        }
                    }). min().orElse(price);

//                    for (List<String> discount : discountMap.get(tag)) {
//                        int discountType = Integer.parseInt(discount.get(1));
//                        double discountValue = Double.parseDouble(discount.get(2));
//
//                        double discountedPrice;
//                        switch (discountType) {
//                            case 0:
//                                discountedPrice = discountValue; // Set price
//                                break;
//                            case 1:
//                                discountedPrice = price - (price * (discountValue / 100.0)); // Percentage discount
//                                break;
//                            case 2:
//                                discountedPrice = Math.max(0, price - discountValue); // Fixed discount
//                                break;
//                            default:
//                                discountedPrice = price;
//                        }
//
//                        lowestPrice = Math.min(lowestPrice, discountedPrice);
//                    }
                }
            }

            total += lowestPrice;
        }

        return (int) Math.round(total);
    }
    static int findLowestNumbers(List<List<String>> products, List<List<String>> discounts){

        Map<String, List<List<String>>> couponMap = new HashMap<>();

        for(List<String> discount:discounts){
            couponMap.computeIfAbsent(discount.get(0), k -> new ArrayList<>()).add(discount);
        }
        int total = 0;
        for(List<String> product:products){
            List<String> prod = product;
            int price = Integer.parseInt(prod.get(0));

            int couponSize = prod.size();
            int finalProductAmount = Integer.MAX_VALUE;
            for(int i=1;i<couponSize;i++){
                if(prod.get(i).equals("EMPTY")){
                    continue;
                }
                List<List<String>> couponList = couponMap.get(prod.get(i));

                for(int j=0;j<couponList.size();j++) {
                    int type = Integer.parseInt(couponList.get(j).get(1));
                    double discountAmount = Double.parseDouble(couponList.get(j).get(2));

                    switch (type) {
                        case 0:
                            finalProductAmount = (int) Math.min(finalProductAmount, discountAmount);
                            break;
                        case 1:
                            finalProductAmount = (int) Math.min(finalProductAmount, (price - (price * (discountAmount / 100))));
                            break;
                        case 2:
                            finalProductAmount = (int) Math.min(finalProductAmount, finalProductAmount - discountAmount);
                            break;
                        default:
                            break;
                    }
                }
            }
            total += finalProductAmount;
        }
        return total;
    }

    public static void main(String[] args) {

        List<List<String>> coupons = new ArrayList<>();

        // Hardcoded coupon data
//        coupons.add(Arrays.asList("SUMMER2024", "0", "50"));
//        coupons.add(Arrays.asList("FALLSALE", "1", "30"));
//        coupons.add(createCoupon("WELCOME10", "2", "10"));
//        coupons.add(createCoupon("HOLIDAY25", "0", "25"));
//        coupons.add(createCoupon("SPRING50", "1", "50"));
//        coupons.add(createCoupon("WELCOME10", "2", "15"));
//        coupons.add(Arrays.asList("WELCOME10", "1", "55"));// Example of same coupon name with different type

        coupons.add(Arrays.asList("dc1","0","60"));
        coupons.add(Arrays.asList("dc1","1","30"));
        coupons.add(Arrays.asList("dc1","1","20"));

        coupons.add(Arrays.asList("dc2","2","20"));
        coupons.add(Arrays.asList("dc2","1","85"));
        coupons.add(Arrays.asList("dc2","0","15"));

        List<List<String>> products = new ArrayList<>();
//        products.add(Arrays.asList("50", "SUMMER2024", "FALLSALE"));
//        products.add(Arrays.asList("100", "WELCOME10", "EMPTY"));
//        products.add(Arrays.asList("75", "HOLIDAY25", "SPRING50"));
//        products.add(Arrays.asList("120", "WELCOME10")); // Example of multiple products with the same coupon

            products.add(Arrays.asList("100", "dc1"));
            products.add(Arrays.asList("50", "dc1"));
            products.add(Arrays.asList("30", "dc1"));
            products.add(Arrays.asList("100", "dc2"));
            products.add(Arrays.asList("50", "dc2"));
            products.add(Arrays.asList("30", "dc2"));

        System.out.println("minimum amount to pay : "+findLowestNumber(products, coupons));

    }
}
