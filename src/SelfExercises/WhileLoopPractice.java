package SelfExercises;

public class WhileLoopPractice {
    public static void main(String[] args) {

        String superScript = " ";
        for (int damian = 1; damian <= 10; damian++){

            if (damian == 1){
                superScript = "st";
            }
            else if (damian == 2){
                superScript = "nd";
            }
            else if (damian == 3){
                superScript = "rd";
            }
            else{
                superScript = "th";
            }

            if (damian % 2 == 0) {
                System.out.println(damian + superScript + " is an even number ");
            }
            if (damian % 2 != 0) {
                System.out.println(damian + superScript + " is an odd number ");
            }
        }
    }
}