package interfaces;

import java.io.*;

public class Example {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass(10);

        try {
            // Serialize the object
            FileOutputStream fileOut = new FileOutputStream("myclass.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in myclass.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        MyClass deserializedObj = null;

        try {
            // Deserialize the object
            FileInputStream fileIn = new FileInputStream("myclass.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedObj = (MyClass) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("MyClass class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized MyClass...");
        System.out.println("myField: " + deserializedObj.getMyField());
    }
}

class MyClass implements Serializable {
    private int myField;

    public MyClass(int myField) {
        this.myField = myField;
    }

    public int getMyField() {
        return myField;
    }
}