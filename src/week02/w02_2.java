// 조건문으로 가위바위보 만들기
import java.util.Objects;
import java.util.Scanner;

public class w02_2{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("A 입력 : ");
//        String aHand = sc.nextLine(); // A 입력
//
//        System.out.print("B 입력 : ");
//        String bHand = sc.nextLine(); // B 입력
//
//        if (Objects.equals(aHand, "가위")) {
//            // 값을 비교하는 Obects.equals() 메서드 사용 , 두 객체가 null이거나,
//            // 객체가 같은지, 혹은 객체가 동일한 값을 가지고 있는지 비교
//            if (Objects.equals(bHand, "가위")) {
//                System.out.println("A 와 B 는 비겼습니다."); // A 와 B 의 입력값을 비교해서 결과 출력
//            } else if (Objects.equals(bHand, "바위")) {
//                System.out.println("B 가 이겼습니다.");
//            } else if (Objects.equals(bHand, "보")) {
//                System.out.println("A 가 이겼습니다.");
//            } else {
//                System.out.println(" B 유저 값을 잘못 입력하셨습니다.");
//            }
//        } else if (Objects.equals(aHand, "바위")) {
//            if (Objects.equals(bHand, "가위")) {
//                System.out.println("A 가 이겼습니다.");
//            } else if (Objects.equals(bHand, "바위")) {
//                System.out.println("A 와 B 는 비겼습니다.");
//            } else if (Objects.equals(bHand, "보")) {
//                System.out.println("B 가 이겼습니다.");
//            }
//        } else if (Objects.equals(aHand, "보")) {
//            if (Objects.equals(bHand, "가위")) {
//                System.out.println("B 가 이겼습니다.");
//            } else if (Objects.equals(bHand, "바위")) {
//                System.out.println("A 가 이겼습니다.");
//            } else if (Objects.equals(bHand, "보")) {
//                System.out.println("A 와 B 는 비겼습니다.");
//            }
//        }

        // switch/case 문

//        int month = 8;
//        String monthString = "";
//        switch (month) {
//            case 1:  monthString = "1월";
//                break;
//            case 2:  monthString = "2월";
//                break;
//            case 3:  monthString = "3월";
//                break;
//            case 4:  monthString = "4월";
//                break;
//            case 5:  monthString = "5월";
//                break;
//            case 6:  monthString = "6월";
//                break;
//            case 7:  monthString = "7월";
//                break;
//            case 8:  monthString = "8월";
//                break;
//            case 9:  monthString = "9월";
//                break;
//            case 10: monthString = "10월";
//                break;
//            case 11: monthString = "11월";
//                break;
//            case 12: monthString = "12월";
//                break;
//            default: monthString = "알수 없음";
//        }
//        System.out.println(monthString); // 8월 출력


        // if vs switch
// switch 문 실습코드를 if 문으로 바꿔보겠습니다.

// switch
        int month = 12;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "1월";
                break;
            case 2:  monthString = "2월";
                break;
            case 3:  monthString = "3월";
                break;
            case 4:  monthString = "4월";
                break;
            case 5:  monthString = "5월";
                break;
            case 6:  monthString = "6월";
                break;
            case 7:  monthString = "7월";
                break;
            case 8:  monthString = "8월";
                break;
            case 9:  monthString = "9월";
                break;
            case 10: monthString = "10월";
                break;
            case 11: monthString = "11월";
                break;
            case 12: monthString = "12월";
                break;
            default: monthString = "알수 없음";
        }
        System.out.println(monthString); // 8월 출력

// if 로 변환
        if (month == 1) {
            monthString = "1월";
        } else if (month == 2) {
            monthString = "2월";
        } else if (month == 3) {
            monthString = "3월";
        } else if (month == 4) {
            monthString = "4월";
        } else if (month == 5) {
            monthString = "5월";
        } else if (month == 6) {
            monthString = "6월";
        } else if (month == 7) {
            monthString = "7월";
        } else if (month == 8) {
            monthString = "8월";
        } else if (month == 9) {
            monthString = "9월";
        } else if (month == 10) {
            monthString = "10월";
        } else if (month == 11) {
            monthString = "11월";
        } else if (month == 12) {
            monthString = "12월";
        } else {
            monthString = "알수 없음";
        }
        System.out.println(monthString); // 8월 출력
    }
}