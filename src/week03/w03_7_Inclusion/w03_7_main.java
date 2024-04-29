package week03.w03_7_Inclusion;

    public class w03_7_main {
        public static void main(String[] args) {
            // 자동차 객체 생성
            w03_7_Car car = new w03_7_Car("GV80", "Black", 50000000);

            // 자동차 부품 : 타이어, 차문, 핸들 선언
            w03_7_Tire[] tires = new w03_7_Tire[]{
                    new w03_7_Tire("KIA", 150000), new w03_7_Tire("금호", 150000),
                    new w03_7_Tire("Samsung", 150000), new w03_7_Tire("LG", 150000)
            };
            w03_7_Door[] doors = new w03_7_Door[]{
                    new w03_7_Door("LG", "FL"), new w03_7_Door("KIA", "FR"),
                    new w03_7_Door("Samsung", "BL"), new w03_7_Door("LG", "BR")
            };
            w03_7_Handle handle = new w03_7_Handle("Samsung", "S");


            // 자동차 객체에 부품 등록
            car.setTire(tires);
            car.setDoor(doors);
            car.setHandle(handle);


            // 등록된 부품 확인하기
            for (w03_7_Tire tire : car.tire) {
                System.out.println("tire.company = " + tire.company);
            }
            System.out.println();

            for (w03_7_Door door : car.door) {
                System.out.println("door.company = " + door.company);
                System.out.println("door.location = " + door.location);
                System.out.println();
            }
            System.out.println();

            // 자동차 핸들 인스턴스 참조형 변수에 저장
            w03_7_Handle carHandle = car.handle;
            System.out.println("carHandle.company = " + carHandle.company);
            System.out.println("carHandle.type = " + carHandle.type + "\n");

            // 자동차 핸들 조작해보기
            carHandle.turnHandle("Right");
            carHandle.turnHandle("Left");
        }
    }
