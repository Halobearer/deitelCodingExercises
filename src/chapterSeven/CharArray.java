package chapterSeven;


import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[][] charArray = new char[3][3];

        charArray[0][0] = 'X';
        charArray[0][1] = 'O';
        charArray[0][2] = 'X';
        charArray[1][0] = 'O';
        charArray[1][1] = 'O';
        charArray[1][2] = 'X';
        charArray[2][0] = 'X';
        charArray[2][1] = 'O';
        charArray[2][2] = 'O';


        int indexI;
        for (indexI = 0; indexI < charArray.length; indexI++) {
            for (int indexJ = 0; indexJ < charArray[indexI].length; indexJ++) {
                if (charArray[indexI][indexJ] == 'X') {
                    charArray[indexI][indexJ] = '1';
                } else if (charArray[indexI][indexJ] == '0') {
                    charArray[indexI][indexJ] = 'O';
                }
            }
        }
        System.out.println(Arrays.deepToString(charArray));


//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = 0; j < charArray.length; j++) {
//
//                System.out.println(charArray[i][j]);
//            }
//        }

//
//        for (int index = 0; index < charArray.length; index++) {
//            if (charArray[index][charArray.length] == 'X'){
//                charArray[index] = '1';
//            }
//        }

    }


}
