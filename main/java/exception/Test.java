package exception;

public class Test {
    static String test(){
        try{
            return "a";
        }catch(Exception e){
            return "b";
        }
        finally{
            return "c";
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
