package java_outline;

import java.util.Scanner;

// 주어진 문자열 중 가운데 문자 가져오기 홀수 = 가운데 / 짝수는 가운데 2가지

public class java17_가운데글자가져오기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String result = "";

            if (str.length() % 2 == 0) {
                int index1 = str.length() / 2 - 1;
                int index2 = str.length() / 2;

                result = result + str.charAt(index1) + str.charAt(index2);
                System.out.print(result);
            } else {
                int index3 = str.length() / 2;

                result = result + str.charAt(index3);
                System.out.print(result);
        }
    }
}
// 문자열의 길이를 이용하여 길이를 2로 나눈몫의 인덱스를 사용
