package java_outline.중요개념학습;

public class java01_Class { // Car 클래스의 선언이라고 가정
    String modelName; // field의 선언
    static String color; // static = 공통적인 : 모든 클래스가 공유한다.

    java01_Class(String modelName, String color) {
        this.modelName = modelName; // this : 현재 선언한 객체의 modelName 및 color를 바로 초기화한다.
        this.color = color;
    }

    public String getModel() { // public = 모든 클래스에서 참조 가능 (다른패키지의 클래스, 자식, 같은 패키지 내 다른클래스)
        return this.modelName + " 은 " + this.color;
    }

    public static void accerlate(int speed, int distance) { // 메서드의 선언 (자료형 = return 존재) (void = return 값 없이 가능)
        System.out.print("현재 속도는 " + speed + "로 달리며 " + distance + "만큼 간다.");
    }


    public static void main(String args[]) { // main 함수부 = 자바 프로그램이 시작할 때 main을 찾고 바로 실행
        java01_Class Car = new java01_Class("람보르기니", "노란색");

        System.out.print(Car.getModel());
        Car.accerlate(30,5);
    }
}
