package java_outline;

import java.util.Scanner;

// 띄어쓰기를 기준으로 단어를 구분하고 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 리턴 / 단어별로 구분하기

public class java18_이상한문자만들기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        String s =  scanner.nextLine();

        String[] arr = s.split("");

        int index = 0;

        for (int i=0; i<arr.length; i++) {
            if(arr[i] == " ") {
                index = 0;
            } else {
                if (index % 2 == 0) { // 홀수가 될때 (0부터 시작)
                    result = result + arr[i].toUpperCase();
                    index++;
                }
                else { // 짝수일때 (index 값이 1 증가 후)
                    result = result + arr[i].toLowerCase();
                    index++;
                }
            }
        }

        System.out.print(result);

    }
}
// String str.split(" ") : 띄어쓰기를 기준으로 문자열을 나눈다.
// String str.split("") " 모든 문자를 각각 나눈다.