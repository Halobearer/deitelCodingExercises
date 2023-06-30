package ClassExercises;

public class PythagoreanTriples {
    public static void main(String[] args) {

        for (int side1 = 1; side1 <= 500; side1++) {
           a: for (int side2 = side1+1; side2 <= 500; side2++){//you can label loops
                for (int side3 = side2+1; side3 <= 500; side3++){
                    if((side1*side1 + side2*side2) == (side3*side3)){

            System.out.println(side1+" ^2 + "+side2+" ^2 = "+side3+" ^2");
            //You can choose to apply break function
            // break a;
            //( System.out.println(side1+" + "+side2+" = ");



        }
                }

            }

        }

    }

}