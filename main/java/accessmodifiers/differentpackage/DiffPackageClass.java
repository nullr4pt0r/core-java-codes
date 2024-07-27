package accessmodifiers.differentpackage;

import accessmodifiers.samepackage.Data;

public class DiffPackageClass {
    public static void main(String[] args) {
        Data dt = new Data();
        System.out.println(dt.numpub);

    }
}
