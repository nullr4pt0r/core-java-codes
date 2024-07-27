//package DesignPattern.Creational.Singleton.SingleThreaded.Scaler.Logging;
//
//
//
//import org.springframework.boot.logging.LogLevel;
//
//import java.io.*;
//import java.time.LocalDateTime;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//
//public class LoggerImpl implements Logger {
//
//    PriorityQueue<Character> queue = new PriorityQueue<>();
//
//    public void populate(){
//        for(char ch = 'a';ch<='z';ch++){
//
//        }
//    }
//
//    private static Logger log = new LoggerImpl();
//    private String filePath;
//    private PrintWriter printWriter;
//    @Override
//    public void log(LogLevel level, String message) {
//        int[] arr = {1,2,3};
//
//        Arrays.stream(arr).sum();
//        PriorityQueue<Character> q = new PriorityQueue<>();
//        if(printWriter == null){
//            throw new IllegalStateException();
//        }
//        String msg = "DateTime: "+ LocalDateTime+" LogLevel: "+level+" message: "+message;
//        printWriter.println(msg);
//    }
//
//    @Override
//    public void setLogFile(String filePath) {
//        this.filePath = filePath;
//        try {
//            printWriter = new PrintWriter(new FileWriter(filePath, true));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//
//            e.printStackTrace();
//            System.out.println("Invalid file path!");
//
//        }
//    }
//
//    @Override
//    public String getLogFile() {
//        return this.filePath;
//    }
//
//    @Override
//    public void flush() {
//        if(printWriter != null){
//            printWriter.flush();
//            printWriter = null;
//        }
//    }
//
//    @Override
//    public void close() {
//        if(printWriter != null){
//            printWriter.close();
//            printWriter = null;
//        }
//    }
//
//    private LoggerImpl(){}
//
//    public static Logger getInstance(){
//        return log;
//    }
//
//    public static void resetInstance(){
//       log = null;
//    }
//}