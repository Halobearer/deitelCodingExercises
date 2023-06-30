package SelfExercises;

import ChapterSix.ClassExercises.ApplicationForm;
import ChapterSix.ClassExercises.Enums.Religion;

public class ReligionEnrollment {
    public static void main(String[] args) {

        ApplicationForm applicationForm = new ApplicationForm(35,"Datsu Tertsea",234,"Sabo", Religion.ISLAMIC);
        ApplicationForm applicationForm1 = new ApplicationForm(56,"Habibi Musaila",145,"Lekki",Religion.HINDU);
        ApplicationForm applicationForm2 = new ApplicationForm(19,"Jude Ogam",789,"Apapa",Religion.JEW);
        ApplicationForm applicationForm3 = new ApplicationForm(23,"Michael Emmanuel",453,"Yaba",Religion.CHRISTIAN);
        ApplicationForm applicationForm4 = new ApplicationForm(45,"Denim mazz",777,"Orile",Religion.CHRISTIAN);


        System.out.println(applicationForm.getAge());
        System.out.println(applicationForm1.getBvn());
        System.out.println(applicationForm2.getAddress());
        System.out.println(applicationForm3.getName());
        System.out.println(applicationForm4.getBvn());

        //int numberOfChristians = 0;
      //  for (int i = 0; i < numberOfChristians; i++) {

        }
    }


