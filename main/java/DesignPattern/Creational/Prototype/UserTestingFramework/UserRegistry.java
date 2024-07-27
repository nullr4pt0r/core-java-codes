package DesignPattern.Creational.Prototype.UserTestingFramework;

import java.util.HashMap;
import java.util.Map;

public class UserRegistry implements UserPrototypeRegistry {
    private static Map<UserType, User> map = new HashMap<>();



    public void addPrototype(User user) {
        map.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
       return map.get(type);
    }

    @Override
    public User clone(UserType type) {
        return map.get(type).clone();
    }


}