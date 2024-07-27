package interfaces.functional;

public class ABC implements FunB{

    public static void main(String[] args) {
        new ABC().msg();
        new ABC().msgHello();
        FUNA.msgHi();
    }

    @Override
    public void msg() {
        System.out.println("MSG");
    }
}
