package java_outline;

public class java08_배열개념 {
    public static void main(String args[]) {
        // 인덱스는 항상 0부터!!

        // 배열의 선언
        int array[] = new int[10];

        int intArray[] = new int[10];

        int intArray1 [];

        char charArray[] = new char[20];

        // 배열의 초기화

        int array1[] = {0,1,2,3};

        // 인덱스를 통한 변경

        array1[1] = 2; // 3번째 원소 2로 변경

        // 배열간 참조 시 [] 사용하지않음

        intArray = array1;

        // 배열 길이의 출력 (size)

        int array3[] = {1,2,3,4,5,6,7,8};

        System.out.print(array.length);

        // 선언한 배열의 인덱스의 값을 배열의 길이에 맞추어 변경할 수 있음

        for(int i=0; i<array.length; i++) { // [] 안씀!!
        }

    }
}
