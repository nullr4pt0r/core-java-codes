package accessmodifiers.differentpackage;

import accessmodifiers.samepackage.Data;

public class DiffPackageDiffClass extends Data {
    public static void main(String[] args) {
        Data dt = new Data();
        protectedInner pt = dt.new protectedInner();
        publicInner pi = dt.new publicInner();
    }
}
