// 무한정으로 입력받는데 while의 break문을 활용하여 exit입력되면 프로그램종료

package java_outline;

import java.util.Scanner;
public class java07_반복문02 {
    public static void main (String args[]) {

        System.out.print("exit을 입력하면 종료합니다.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String a = scanner.next();

            if (a.equals("exit")) {
                break;
            }
        }

        System.out.print("종료합니다...");

    }
}
// String의 클래스 메소드 .equals를 통해 문자열이 같은지 판별하는 조건식 사용
