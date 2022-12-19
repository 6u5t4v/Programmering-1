package Opgave_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1
        List<String> names = new ArrayList<>() {
            {
                add("Pax");
                add("Fido");
                add("Molly");
                add("Pluto");
                add("Juno");
            }
        };

        //2
        System.out.println(names);
        System.out.println("-".repeat(30));

        // 3
        names.set(2, "King");
        System.out.println(names);
        System.out.println("-".

                repeat(30));

        // 4
        names.remove(1);
        System.out.println(names);
        System.out.println("-".repeat(30));

        // 5
        names.add(3, "Trine");
        System.out.println(names);
        System.out.println("-".

                repeat(30));

        // 6
        names.set(0, "Bella");
        System.out.println(names);
        System.out.println("-".repeat(30));

        // 7
        System.out.println(names.size());
        System.out.println("-".repeat(30));

        // 8
        int fiveLetterNames = 0;
        for (String name : names) {
            if (name.length() == 5) {
                fiveLetterNames++;
            }
        }
        System.out.println(fiveLetterNames);
        System.out.println("-".repeat(30));

        // 9
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        System.out.println("-".repeat(30));

        // 10
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(i + " " + names.get(i));
            }
        }
    }
}