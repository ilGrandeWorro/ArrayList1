package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Student giorgio = new Student("Giorgio", 21);
        Student marta = new Student("Marta", 19);
        ArrayList<Student> school = new ArrayList<Student>(Arrays.asList(giorgio, marta));
        System.out.println(school);
        school.add(new Student("Marco", 19));
        school.add(new Student("Lucia", 18));
        school.add(new Student("Andrea", 20));
        school.add(new Student("Ivan", 21));
        System.out.println();
        System.out.println(school);
    }
}
