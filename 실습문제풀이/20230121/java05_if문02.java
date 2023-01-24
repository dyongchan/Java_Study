// 정수 3개를 입력 받은 후 3개의 숫자 중 중간 크기의 수를 철력하라. 평균값(X)

package java_outline;

import java.util.Scanner;

public class java05_if문02 {
    public static void main(String args[]) {
        System.out.print("정수 3개 입력");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int middle = 0;

        if ((a < b && b < c) || (c < b && b < a)) {
            middle = b;
        } else if ((c < a && a < b) || (b < a && a < c)) {
            middle = a;
        } else if ((a < c && c < b) || (b < c && c < a)) {
            middle = c;
        }

        System.out.print("중간 값은 : "+middle);
    }
}
// 코드의 중복된 부분 제거 및 단순화