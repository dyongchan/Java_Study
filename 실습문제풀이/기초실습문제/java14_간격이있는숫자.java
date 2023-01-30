// 입력 값에 따른 일정 간격을 가진 배열 출력

package java_outline;

import java.util.Scanner;
import java.util.Arrays;

public class java14_간격이있는숫자 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i=0; i<array.length; i++) {
            array[i] = x * (i+1);
        }
        System.out.print(Arrays.toString(array));
    }
}