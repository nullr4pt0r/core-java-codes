package exceptions.Custom;

class invalidfileException extends RuntimeException{
    invalidfileException(String msg, Throwable cause){
        super(msg, cause);
    }
}
public class Fnf {
    public static void main(String[] args) {
        try{

                throw new Exception();

        } catch (Exception e) {
            throw new invalidfileException("invalid file ", e);
        }
    }
}
