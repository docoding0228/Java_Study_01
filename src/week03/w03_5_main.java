package week03;

public class w03_5_main {
    public static void main(String[] args) {

        // 생성자 오버로딩을 통해 여러 상황에서 자동차 생산
        // 제네시스 자동차를 생산 : static final String COMPANY = "GENESIS"; 상수 고정
        // 모든 자동차는 생산시 기어의 최초 상태 'P' 로 고정 : char gear = 'P'; 직접 대입하여 초기화

        // 모델을 변경하면서 만들 수 있고 색상 : Blue, 가격 50000000 고정
        w03_5_this car1 = new w03_5_this("GV60");
        System.out.println("car1.model = " + car1.model);
        System.out.println("car1.color = " + car1.color);
        System.out.println("car1.price = " + car1.price);
        System.out.println("car1.gear = " + car1.gear + "\n");

        // 모델, 색상을 변경하면서 만들 수 있고 가격 100000000 고정
        w03_5_this car2 = new w03_5_this("GV70", "Red");
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.color = " + car2.color);
        System.out.println("car2.price = " + car2.price);
        System.out.println("car2.gear = " + car2.gear + "\n");

        // GV80 모델, 색상 Black, 가격 120000000 으로 완전하게 고정된 경우
        w03_5_this car3 = new w03_5_this("GV80", "Black", 120000000);
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("car3.price = " + car3.price);
        System.out.println("car3.gear = " + car3.gear + "\n");

        // this 키워드를 통해 car3 인스턴스 자신을 반환 : car3.returnInstance() = 인스턴스의 주소
        System.out.println(car3.returnInstance().model); // car3의 model
        System.out.println(car3.returnInstance().color); // car3의 color
        System.out.println(car3.returnInstance().price); // car3의 price

    }
}




