// 돈의 액수를 입ㄺ 받아 각각의 지폐 및 동전으로 입출력 및 연산자 실습 예제

package java_outline;

import java.util.Scanner;

public class java03_출력과연산자 {
    public static void main(String args[]) {

        System.out.print("금액을 입력하시오 : ");
        Scanner scanner = new Scanner(System.in);

        int insert = scanner.nextInt();

        int a = insert / 50000;
        int b = insert % 50000;
        int c = b / 10000;
        int d = b % 10000;
        int e = d / 1000;
        int f = d % 1000;
        int g = f / 100;
        int h = f % 100;
        int i = h / 50;
        int j = h % 50;
        int k = j / 10;
        int l = j % 10;
        int m = l / 1;

        System.out.println("오만원권 "+a+"매");
        System.out.println("만원권 "+c+"매");
        System.out.println("천원권 "+e+"매");
        System.out.println("백원 "+g+"개");
        System.out.println("오십원 "+i+"개");
        System.out.println("십원 "+k+"개");
        System.out.println("일원 "+m+"개");
    }
}
