package week03.w03_8_overriding;

    public class w03_8_SportCar extends w03_8_Car{
        String engine;
        public void booster() {
            System.out.println("엔진 " + engine + " 부앙~\n");
        }

        public w03_8_SportCar(String engine) {
            this.engine = engine;
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

