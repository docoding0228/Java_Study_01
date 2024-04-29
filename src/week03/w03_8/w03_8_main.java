package week03.w03_8;

    public class w03_8_main {
        public static void main(String[] args) {
            // 부모 클래스 자동차 객체 생성
            w03_8_Car car = new w03_8_Car();
            car.horn(); // 경적

            System.out.println();
            // 자식 클래스 스포츠카 객체 생성
            w03_8_SportCar sportsCar = new w03_8_SportCar("Orion");

            // 오버라이딩한 brakePedal(), horn() 메서드 호출
            sportsCar.brakePedal();
            sportsCar.horn();

        }
    }

