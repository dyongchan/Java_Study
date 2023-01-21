// 정수를 입력하세요:5000
// 5000초는 1시간, 23분, 20초 입니다.

package java_outline;
import java.util.Scanner;

public class java02_연산자 {
    public static void main(String args[]) {

        System.out.print("정수를 입력하세요:");
        Scanner scanner = new Scanner(System.in);

        String time = scanner.next();
        int a = Integer.valueOf(time);

        int b = a / 3600;
        int c = a % 3600;
        int d = c / 60;
        int e = c % 60;

        System.out.print(time);
        System.out.println("초는 "+b+"시간, "+d+"분, "+e+"초입니다.");
    }
}
