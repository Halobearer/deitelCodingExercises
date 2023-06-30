package chapterThree;

import java.util.Scanner;

public class Welcome1 {
    public static void main(String[] args) {
        Native pauline = new Native();
        String herName = pauline.getName();
        System.out.println(herName);

        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a new name");
        String newName = inputCollector.nextLine();
        pauline.setName(newName);
        herName = pauline.getName();
        System.out.println(herName);





    }
}
