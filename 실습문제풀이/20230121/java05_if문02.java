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

        if (a < b && b < c) {
            System.out.print("중간 값은 "+b);
        }
        else if (c < b && b < a){
            System.out.print("중간 값은 "+b);
        }
        else if (b < a && a < c ){
            System.out.print("중간 값은 "+a);
        }
        else if (c < a && a < b ){
            System.out.print("중간 값은 "+a);
        }
        else if (a < c && c < b ){
            System.out.print("중간 값은 "+c);
        }
        else if (b < c && c < a ){
            System.out.print("중간 값은 "+c);
        }

    }

}
