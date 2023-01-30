package java_outline;

// 문자열의 비교를 통해 각 문자의 개수가 같으면 True, 다르면 False 출력

import java.util.Scanner;

public class java13_문자열 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num_s = 0;
        int num_y = 0;

        String s = scanner.next();

        s = s.toLowerCase();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'p') {
                num_s++;
            }
            if (s.charAt(i) == 'y') {
                num_y++;
            }
        }

        if (num_s == num_y) {
            System.out.print("True");
        } else if(num_s == 0 && num_y == 0) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
// 문자열에 인덱스를 통해 문자를 추출한다. : 문자열.charAt()
// String str = "Mozi Tistory Is Best"
// 문자열의 길이 : str.length()
// 몇개의 단어로 이루어졌나? = charAt() 메소드를 통해 띄어쓰기 + 1 을 하면 단어의 개수 출력 가능
// str = str.toLowerCase(); 소문자로변경
// str = str.toUpperCase(); 대문자로변경