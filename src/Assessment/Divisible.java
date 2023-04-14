package Assessment;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int divider = 3;
        int ans = 0;

        for (int i = 0; i <= 30; i++) {
            if (i % divider == 0) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
