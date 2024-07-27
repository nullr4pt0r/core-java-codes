package Singleton;

 class Data {
    //to make singleton class
    //private constructor
    //getter to get object
    private static Data data = null;//eager loading
    private Data(){}

    public  static Data getData()  {
        if(data == null){
            synchronized (Data.class) {
                if (data == null) {
                    System.out.println("Data created" + Thread.currentThread().getName());
                    data = new Data();
                }
            }
        }
        System.out.println("Data returned"+Thread.currentThread().getName());
        return data;
    }
}

public class client{
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(System.identityHashCode(Data.getData()));
        }).start();
        new Thread(() -> {
            System.out.println(System.identityHashCode(Data.getData()));

        }).start();
        new Thread(() -> System.out.println(System.identityHashCode(Data.getData()))).start();
        new Thread(() -> System.out.println(System.identityHashCode(Data.getData()))).start();
        new Thread(() ->System.out.println(System.identityHashCode(Data.getData()))).start();
        new Thread(() -> System.out.println(System.identityHashCode(Data.getData()))).start();
    }
}