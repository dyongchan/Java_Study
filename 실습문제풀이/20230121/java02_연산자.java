// 정수를 입력하세요:5000
// 5000초는 1시간, 23분, 20초 입니다.

package java_outline;
import java.util.Scanner;

public class java02_연산자 {
    public static void main(String args[]) {

        System.out.print("정수를 입력하세요:");
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();

        int a = time / 3600;
        int b = time % 3600;
        int c = b / 60;
        int d = b % 60;

        System.out.print(time);
        System.out.println("초는 "+a+"시간, "+c+"분, "+d+"초입니다.");
    }
}
