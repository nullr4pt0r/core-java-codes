package accessmodifiers.samepackage;

public class Data {

    private int num = 10;
    protected  int nump = 11;
    int numd = 12;
    public int numpub = 13;

    public class publicInner {};
    protected class protectedInner{
        public protectedInner(){

        }
    };
    private class privateInner{};
    class defaultInner{};

    public static void main(String[] args) {
        Data df = new Data();
        System.out.println("private num : "+df.num);
    }
}
