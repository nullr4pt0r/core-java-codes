package exceptions;

import java.io.*;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args)  {
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int b = in.nextInt();
//
//        System.out.println(A/b);
//
//       readFile();

        try{
            justThrowException();
        }catch(InvalidInputException e){
            e.printStackTrace();
        }

    }

    static void justThrowException() throws InvalidInputException{
        throw new InvalidInputException("You have entered Invalid exception");
    }
    static void readFile()  {
        try {
            File file = new File("abc");
            FileReader fr = new FileReader(file);
            fr.read();
        }
        catch(Exception e){
            System.out.println("stack trace");
            e.printStackTrace();

        }
        finally{
            System.out.println("finally");
        }
    }
}
