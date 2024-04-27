package week03;

public class w03_4_main {

    public static void main(String[] args) {

        // 기본 생성자 호출 오류 확인
        // Car car1 = new Car(); // 오류 발생

        // 생성자 오버로딩을 통해 여러 상황에서 자동차 생산
        // 제네시스 자동차를 생산 : static final String COMPANY = "GENESIS"; 상수 고정
        // 모든 자동차는 생산시 기어의 최초 상태 'P' 로 고정 : char gear = 'P'; 직접 대입하여 초기화

        // GV60 모델만 기본으로 선택
        w03_4_constructor car2 = new w03_4_constructor("GV60");
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.gear = " + car2.gear + "\n");

        // GV70 모델, 색상 Blue 만 기본으로 선택
        w03_4_constructor car3 = new w03_4_constructor("GV70", "Blue");
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("car3.gear = " + car3.gear + "\n");

        // GV80 모델, 색상 Black, 가격 50000000 으로 완전하게 고정된 경우
        w03_4_constructor car4 = new w03_4_constructor("GV80", "Black", 50000000);
        System.out.println("car4.model = " + car4.model);
        System.out.println("car4.color = " + car4.color);
        System.out.println("car4.price = " + car4.price);
        System.out.println("car4.gear = " + car4.gear + "\n");
    }
}
