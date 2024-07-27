package IteraTABLE;

import java.util.ArrayList;
import java.util.Stack;


import java.util.ArrayList;
import java.util.Stack;

/**
 * This is the main class that demonstrates the usage of Stack and ArrayList.
 */
public class Client {

    /**
     * The main method that is the entry point of the program.
     * It creates a Stack and an ArrayList, adds elements to them, and then displays their contents.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Stack and add elements to it
        Stack st = new Stack<>();
        st.push("Hello");
        st.push(2);
        st.push(3.5);

        // Create an ArrayList and add elements to it
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        // Display the contents of the Stack and the ArrayList
        display(st);
        display(list);
    }

    /**
     * This method displays the contents of an Iterable object.
     * It uses a for-each loop to iterate over the elements and print them.
     * @param st the Iterable object whose contents are to be displayed
     */
    public static void display(Iterable st){
        for(Object i:st){
            System.out.println(i);
        }
    }

    static{
        System.out.println("Hello");
    }
}
