public class Core {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("Strings before swap: a = " + a + ", b = " + b);

        // Pass the strings to the swap method
        swap(new String[]{a, b});

        System.out.println("Strings after swap: a = " + a + ", b = " + b);
    }

    // Method to swap elements of an array
    public static void swap(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
//    static void swap(Object[] a){
//        Object c = a[0];
//        a[0] = a[1];
//        a[1] = c;
//    }
//    public static void main(String[] args) {
//        String a = "123";
//        String ab = "123";
//        String b = "456";
//        String aa = new String("123");
//        String bb = new String("123").intern();
//        System.out.println(a+" "+b);
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(ab));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(System.identityHashCode(aa));
//        System.out.println(System.identityHashCode(bb));
//        //123, 456
////         b = swap(a);
//        System.out.println(a+" "+b);
//
//        String[] arr = new String[]{a,b};
//
//        swap(arr);
//
//        a = arr[0];
//        b = arr[1];
//        System.out.println(a+" "+b);
//        //456, 123
//    }
}
