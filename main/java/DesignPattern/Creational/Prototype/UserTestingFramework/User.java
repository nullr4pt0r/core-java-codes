package DesignPattern.Creational.Prototype.UserTestingFramework;



public class User implements ObjectClonable<User>{
    private long userId;

    private String username;
    private String email;
    private String displayName;
    private int age;
    private UserType type;

    public User(){}
    public User(long userId, String username, String email, String displayName, int age, UserType type) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.displayName = displayName;
        this.age = age;
        this.type = type;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public UserType getType() {
        return type;
    }

    public User(User u){
        this.userId = u.userId;
        this.username = u.username;
        this.email = u.email;
        this.displayName = u.displayName;
        this.age = u.age;
        this.type = u.type;
    }

    public User clone(){
        return new User(this);
    }
}


