package week03.w03_10_super2;

    public class w03_10_SportsCar extends w03_10_Car{
        String engine;

        public w03_10_SportsCar(String model, String color, double price, String engine) {
            // this.engine = engine; // 오류 발생
            super(model, color, price);
            this.engine = engine;
        }

        public void booster() {
            System.out.println("엔진 " + engine + " 부앙~\n");
        }

        @Override
        public double brakePedal() {
            speed = 100;
            System.out.println("스포츠카에 브레이크란 없다");
            return speed;
        }

        @Override
        public void horn() {
            booster();
        }
    }

