package week03;

import org.w3c.dom.ls.LSOutput;

public class w03_1_car {

    // 클래스 멤버 사용 예제
    static String company = "GENESIS";
    // 1) 고유데이터 영역
    // String company; // 자동차 회사
    //    String model; // 자동차 모델
    String model;
    String color; // 자동차 색
    double price; // 자동차 가격

    // 2) 상태데이터 영역
    double speed; // 자동차 속도
    char gear; // 자동차 기어 상태(P, R, N, D)
    // boolean lights; // 자동차 조명의 상태
    boolean lights = true;

    // 1) 객체데이터 영역
//    w03_1_Tire tire;
//    w03_1_Tire tire = new w03_1_Tire();
    w03_1_Tire tire;
    w03_1_Door door = new w03_1_Door();
    w03_1_Handle handel = new w03_1_Handle();

    // 생성자 : 처음 객체가 생성될 때 어떤 로직을 수행해야하며, 어떤 값이 필수로 들어와야 하는지 정의
    public w03_1_car() {
        // 기본생성자 : 생략이 가능함
        // System.out.println("생성자가 호출 되었습니다." + "객체가 생성됩니다.");
    }
    // gasPedal
    // input : Kmh
    // output : speed

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;

//      반환 타입이 double 인 gasPedal(double kmh) 메서드를 선언.
//      매개변수인 kmh을 통해 매개값을 전달받아 자동차의 속성인 speed 필드에 해당 값을 저장.
    }

    // breakPedal
    // input : x
    // output : speed

    double breakPedal(char type) {
        speed = 0;
        type = 'P'; // 정지 후 매개변수 type을 어떤 타입으로 전달 받았는지 상관없이 'P'로 고정시키기
        changeGear(type);
        return speed;
//      반환 타입이 double인 brakePedal() 메서드를 선언.
//      메서드가 호출되면 자동차의 속성인 speed 필드의 값을 0으로 바꾼 후 speed의 값을 반환.
    }

    // changeGear
    // input : gear(char type)
    // output : gear

    char changeGear(char type) {
        gear = type;
        return gear;
//      반환 타입이 char인 changeGear(char type) 메서드를 선언
//      매개변수인 type을 통해 매개값을 전달받아 메서드가 호출되면 자동차의 속성인 gear 필드에 해당 값을 저장
    }

    // onOffLights
    // input : x
    // output : light(boolean)

    boolean onOffLights() {
        lights = !lights;
        return lights;
//      반환 타입이 boolean인 onOffLights() 메서드를 선언
//      메서드가 호출되면 자동차의 속성인 lights의 현재 논리 값을 반전 시킨 후 lights의 값을 반환
    }

    // horm 경적
    // input : x
    // output : x

    void horm() {
        System.out.println("빵빵!!");
    }
//  반환값이 없는 horn() 메서드를 선언
//  메서드가 호출되면 자동차의 경적소리인 “빵빵”이 출력

    // 메서드 예제
//    void carSpeeds(double ... speeds) {
//        for (double v : speeds) {
//            System.out.println("v = " + v);
//        }
//    }

//    w03_1_Tire setTire(w03_1_Tire tireCompany) {
//        tireCompany.company = "KIA"; // 금호 타이어를 전달 받았지만 강제로 KIA 타이어로 교체
//        tire = tireCompany;
//        return tire;
//    }
        // 클래스 멤버 사용 예제
        String getCompany() {
        return "(주)" + company;
}
        static String setCompany(String companyName) {
        // System.out.println("자동차 모델 확인: " + model); // 인스턴스 필드 사용 불가
        company = companyName;
        return company;
    }

}
