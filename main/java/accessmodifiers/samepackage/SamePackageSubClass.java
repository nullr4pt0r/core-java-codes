package accessmodifiers.samepackage;

public class SamePackageSubClass extends Data {

    public static void main(String[] args) {
        SamePackageSubClass sc = new SamePackageSubClass();
        Data dt = new Data();
        protectedInner pt = dt.new protectedInner();
    }
}
