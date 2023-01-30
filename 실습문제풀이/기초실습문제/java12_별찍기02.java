package java_outline;

// Baekjun 반복문 별찍기2번 재풀이

import java.util.Scanner;

public class java12_별찍기02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int insert = scanner.nextInt();

        for (int i = 0; i < insert; i++) {

            for (int k = insert - 1; i < k; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
