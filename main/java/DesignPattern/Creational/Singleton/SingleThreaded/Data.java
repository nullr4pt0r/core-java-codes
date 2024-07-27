package DesignPattern.Creational.Singleton.SingleThreaded;

public class Data {
    private static Data db = null;

    private Data(){

    }

    public static Data getInstance(){
        if(db == null){

                synchronized (Data.class) {
                    System.out.println("Hello from outside if block ! "+Thread.currentThread().getName());
                    if(db == null) {
                    System.out.println("Hello from synchronized block ! "+Thread.currentThread().getName());
                    db = new Data();
                }
                    System.out.println("We are exiting the Synchronized block ! "+Thread.currentThread().getName());
            }
        }
        return db;
    }
}
