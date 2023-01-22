// 삼각형의 변의 길이를 나타내는 정수를 3개 입력 후 삼격형 판별 예제

package java_outline;


import java.util.Scanner;

public class java04_if문01 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오 : ");

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int a = first + second;
        int b = first + third;
        int c = second + third;

        if (a > third && b > second && c > first) {
            System.out.print("삼각형이 됩니다.");
        }
        else {
            System.out.print("삼각형이 되지 못합니다.");
        }
    }

}
