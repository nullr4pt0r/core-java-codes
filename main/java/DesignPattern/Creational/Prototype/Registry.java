package DesignPattern.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
  private static Map<String, Student> studentRegistry = new HashMap<>(10, 0.70F);

 static  Student get(String key){
      return studentRegistry.get(key);
  }

 static  void put(String key, Student obj){
      studentRegistry.put(key, obj);
  }

}
