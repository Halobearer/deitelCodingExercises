package ClassExercises;

public class DiamondAsterisks {
    public static void main(String[] args) {
        int blank = 4;
        // this for loop is for the top of the code
        System.out.println(" Enter a number from 1-19: ");
        for (int topTriangleRow = 1; topTriangleRow <= 9; topTriangleRow+=2) {
            for(int space = 0; space < blank; space++){//this first for does the spacing
                 System.out.print(" ");
            }
        // this does the asterisk
             for (int asterisk = 1; asterisk<= topTriangleRow; asterisk++){
            System.out.print("*");
        }
            System.out.println();
            blank--;

        }
       // for (int count = 9; count >= 1; count -= 1) {
         //   asterisks += "*";
           // System.out.println(asterisks);

        //}
        // for the bottom section of the code
    blank = 1;
        for (int bottomTriangleRow = 7; bottomTriangleRow > 0; bottomTriangleRow-=2){
            for(int space = 0; space < blank; space++){//this first for does the spacing
                System.out.print(" ");
            }
            //this does the spacing
            for (int i = bottomTriangleRow; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
            blank++;
        }

    }
}