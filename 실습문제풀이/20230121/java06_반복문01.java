// 반복문을 이용해서 입력 5개 받고 양수들의 합만 출력

package java_outline;

import java.util.Scanner;

public class java06_반복문01 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i=0; i<5; i++) {
            int a = scanner.nextInt();

            if (a > 0) {
                sum = a + sum;
            }
        }
        System.out.print(sum);
    }
}
// 반복문의 실행 = 앞의 조건 2개 확인 후 안의 문장 실행 후 조건식 실행