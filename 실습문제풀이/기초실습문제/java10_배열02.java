// 배열의 길이에 따라 값을 받은 후 평균 출력

package java_outline;

import java.util.Scanner;

public class java10_배열02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("5개를 정수 입력하세요.");

        int array[] = new int[5];
        int sum = 0;


        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }

        double average = (double)sum / array.length;
        System.out.print("평균은 "+average);
    }
}
// array.length : [] 사용 x / 배열의 길이 출력 / 코드의 재사용성에 용이
// int - double 형변환 : (자료형)변수