package week03;

public class w03_1_class {

    public static void main(String[] args) {
//        1. 만들려고 하는 설계도를 선언. (클래스 선언) // w03_1_car
//        2. 객체가 가지고 있어야할 속성(필드) 정의 // String company
//        3. 객체를 생성하는 방식을 정의 (생성자) // public w03_1_car()
//        4. 객체가 가지고 있어야할 행위(매서드)를 정의 // double gasPedal(double kmh)

//        w03_1_car firstcar = new w03_1_car();
//        w03_1_car twocar = new w03_1_car();
//        System.out.println(firstcar); // week03.w03_1_car@3b07d329

//        w03_1_car[] carArray = new w03_1_car[3];
//        w03_1_car firstcar = new w03_1_car();
//        firstcar.changeGear('P');
//        carArray[0] = firstcar;
//
//        w03_1_car twocar = new w03_1_car();
//        twocar.changeGear('N');
//        carArray[1] = twocar;
//
//        w03_1_car threecar = new w03_1_car();
//        threecar.changeGear('D');
//        carArray[2] = threecar;
//
//        for (w03_1_car w03_1_car: carArray)
//        {
//            System.out.println(w03_1_car.gear);
//        }

//        w03_1_car car = new w03_1_car();
//        System.out.println("car.model = " + car.model); // 초기값 "Gv80"이 출력됩니다.
//        System.out.println("car.color = " + car.color); // 기본값 null이 출력됩니다.
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed); // 기본값 0.0이 출력됩니다.
//        System.out.println("car.gear = " + car.gear);  // 기본값 \u0000(공백)이 출력됩니다.
//        System.out.println("car.lights = " + car.lights); // 초기값 true가 출력됩니다.
//        System.out.println();
//
//        System.out.println("car.tire = " + car.tire); // 초기값 인스턴스의 주소가 출력됩니다.
////      객체의 참조(주소값)가 출력되는 것은 객체가 제대로 생성되고, 그 객체에 대한 참조(reference)가 변수에 저장
////      자바에서 객체는 메모리의 특정 위치에 저장되며, 해당 위치를 가리키는 "참조"를 통해 객체에 접근.
////      new 키워드를 사용하여 객체를 생성할 때, 해당 객체는 메모리 공간을 할당받고, 이 메모리 위치를 참조하는 값(주소값)이 반환
//
//        System.out.println("car.door = " + car.door); // 기본값 null이 출력됩니다.
//        System.out.println();
//
//        // 필드 사용
//        car.color = "blue"; // 필드 color에 "blue" 데이터를 저장합니다.
//        car.speed = 100;    // 필드 speed에 100 데이터를 저장합니다.
//        car.lights = false; // 필드 lights에 false 데이터를 저장합니다.
//
//        System.out.println("car.color = " + car.color); // 저장된 "blue" 데이터가 출력됩니다.
//        System.out.println("car.speed = " + car.speed); // 저장된 100.0 데이터가 출력됩니다.
//        System.out.println("car.lights = " + car.lights); // 저장된 false 데이터가 출력됩니다.

        w03_1_car car = new w03_1_car(); // 객체 생성

        // 메서드 호출 및 반환값 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        // gasPedal 메서드 내부에 호출된 changeGear(type); 메서드의 결과 확인
        // gear의 초기값은 'P'
        System.out.println("car.gear = " + car.gear); // 'D' 출력

        System.out.println();
        // 가변길이 매개변수 확인
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);

    }
}
