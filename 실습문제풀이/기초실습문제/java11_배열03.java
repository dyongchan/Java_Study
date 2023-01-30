package java_outline;

// 입력받은 정수를 뒤집어서 배열로 출력

import java.util.Arrays;
import java.util.Scanner;

public class java11_배열03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[5];

        for (int i=0; i<array.length; i++) {
            array[i] = n % 10; // 12345 array[0] = {5,
            n = n / 10;
           /* 12345 / 10 = 1234 % 10 = 4
            100으로 나눈 나머지에서 10으로 나눈 몫 = array[1] */
        }
        System.out.println(Arrays.toString(array));
    }
}

// 입력받은 정수 n을 배열에 넣고 (쪼개서?) 인덱스를 거꾸로 출력
// 형변환이 필요하다. String.valueOf( /// );
// System.out.println(Arrays.toString(array))
// String str = String.valueof(number) : 문자열로 인식
// str.length() String 길이 구하는 메쏘드