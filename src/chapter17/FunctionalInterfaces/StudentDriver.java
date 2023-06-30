package chapter17.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDriver implements Comparator<Student> {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Damian", 17));
        students.add(new Student("Yinka", 27));
        students.add(new Student("Fola", 17));
        students.add(new Student("James", 24));
        students.add(new Student("Alex", 23));

        students.sort(comparator);
        System.out.println(students);
    }

    public static Comparator<Student> comparator = (s1, s2) -> {
        if (s1.getAge() > s2.getAge()) {
            return 1;
        } else if (s1.getAge() < s2.getAge()) {
            return -1;
        }
        return s1.getName().compareTo(s2.getName());
    };


    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

