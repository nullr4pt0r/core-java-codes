package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class B {
    public static void main(String[] args) throws Exception{
        Class<?> c = A.class;
        //to access the fields
        Field[] fields = c.getFields();
        for(Field f:fields){
            System.out.println(f.getModifiers());
            System.out.println(f.getDeclaringClass());
            System.out.println(f.getName());
            System.out.println(f.getType());
        }
        System.out.println("***");
        //to access
        fields = c.getDeclaredFields();
        Constructor[] cons = c.getDeclaredConstructors();

        A a = null;
        for (Constructor co : cons) {
            co.setAccessible(true);
            a = (A) co.newInstance();
        }
        if(a == null){
            System.out.println("constructor is null");
            throw new RuntimeException("constructor is null");
        }
        for(Field f:fields){
            System.out.println(f.getModifiers());
            System.out.println(f.getDeclaringClass());
            System.out.println(f.getName());
            System.out.println(f.getType());
            f.setAccessible(true);
            f.set(a, "john");
            System.out.println(f.get(a));
        }
    }
}
