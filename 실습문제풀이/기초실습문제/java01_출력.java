// 이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.
// kim Seoul 20 65.1 true
// 이름은 kim, 도시는 Seoul, 나이는 20살, 체중은 65.1kg, 독신 여부는 true입니다.

package java_outline;

import java.util.Scanner;

public class java01_출력 {
    public static void main(String args[]) {

        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String city = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        Boolean Me = scanner.nextBoolean();

        System.out.println("이름은 "+name+","+" "+"도시는 "+city+","+" "+"나이는 "+age+"살"+","+" "+"체중은 "+weight+"kg"+","+" "+"독신 여부는 "+Me+"입니다.");
    }
}
