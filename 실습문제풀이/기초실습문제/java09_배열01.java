// 양수 5개를 입력받고 최대, 최소 값을 출력하시오.

package java_outline;

import java.util.Scanner;

public class java09_배열01 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양수 5개를 입력하세요.");

        int array[] = new int[5];
        int min = 100000;

        for (int i=0; i<5; i++) {
            array[i] = scanner.nextInt(); // 내가 입력한 숫자가 i값에 해당하는 인덱스로 초기화됨
            if (array[i] < min ) {
                min = array[i] ;
            }
        }
        System.out.print("가장 작은 수는"+min+"입니다.");
    }

}
// 가장 작은 값을 출력하시오 : 넣을 수 있는 최대의 값을 기준으로 두고 각각의 인덱스와 비교하여 값 초기화
// 가장 큰 값을 출력하시오 : 0과 같은 기준값을 설정 한 후, 각각의 인덱스와 비교하여 값을 초기화

