package java_outline;

import java.util.Scanner;
import java.util.Arrays;

// 주어진 두 수로 최대공약수와 최대공배수 리턴하기

public class java15_최대공약수최대공배수 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n_1 = scanner.nextInt(); // 최대공약수 = 1과 자기자신을 포함한 주어진 수를 나누어 나머지가 0이 되는 [최대의 수]
        int n_2 = scanner.nextInt(); // 최소공배수 = 공통된 배수 중 [가장 작은수]
        int bigger = 0;
        int gcd = 0;
        int lcm = 0;

        if (n_1 < n_2) {
            bigger = n_2;
        } else {
            bigger = n_1;
        }

        int[] result = new int[2];

        for (int i=1; i<=bigger; i++) {
            if (n_1 % i == 0 && n_2 % i == 0) { // 두 수를 나눈 수 중 가장 큰 수 받기
                if (gcd < i) {
                    gcd = i;
                    }
                }
            }

         lcm = gcd * ((n_1 / gcd) * (n_2 / gcd)) ; // 최대공약수를 각각 의 수로 나눈 몫들과 곱하여 최소공배수 출력

        result[0] = gcd;
        result[1] = lcm;
        System.out.print(Arrays.toString(result));
        }

    }


