package java_outline;

// 숫자를 입력받고 해당하는 만큼 수박수 리턴

import java.util.Scanner;

public class java16_수박수 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int insert = scanner.nextInt();

        String str = ""; // int i = 0; 과 같이 문자열의 초기값을 비워놓고 선언

        for (int i=0; i<insert; i++) {
            if (i % 2 == 0) {
            str = str + '수';
            } else {
                str = str + '박';
            }
        }
        System.out.print(str);
    }
}
