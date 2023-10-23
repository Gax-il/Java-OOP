package org.gax.cv3.main;

import org.gax.cv3.model.Patient;

public class WClass {
    public static void main(String[] args) {

        Patient p1 = new Patient("Pavel", "Novak", 2002);
        Patient p2 = new Patient("Josef","Nenovak",2111);
        Patient p3 = new Patient("Lukas", "Paviensky",2002);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));

        System.out.println(p1);
    }
}
