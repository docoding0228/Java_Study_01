package week03.w03_2;

public class w03_2_main {
    public static void main(String[] args) {
        // 클래스 필드 company 확인
        System.out.println(w03_2_car.company + "\n");
        // 클래스 필드 변경 및 확인
        w03_2_car.company = "Audi";
        System.out.println(w03_2_car.company + "\n");

        // 클래스 메서드 호출
        String companyName = w03_2_car.setCompany("Benz");
        System.out.println("companyName = " + companyName);

        System.out.println();
        // 참조형 변수 사용
        w03_2_car car = new w03_2_car(); // 객체 생성

        car.company = "Ferrari";
        System.out.println(car.company + "\n");

        String companyName2 = car.setCompany("Lamborghini");
        System.out.println("companyName2 = " + companyName2);

        ///dsada


    }
}
