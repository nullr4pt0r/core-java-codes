package generics;

public class Puppy extends Dog{
    int age;

    public Puppy(String food) {
        super();
    }

    public Puppy(int age) {
        super();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "age=" + age +
                ", food='" + food + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
