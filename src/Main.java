import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {

                // [JDK] :
                // (1) compiler : .java -> .class
                // (2) JRE
                // (3) JDB : 디버깅

                // int[] a = {1, 2, 3};
                // System.out.println(Arrays.toString(a));

                Scanner sc = new Scanner(System.in);
                // Scanner 객체를 new 명령어로 생성합니다.
                // sc(Scanner)의 .next(); 를 실행하면 input 변수에 입력한 글자를 받을 수 있습니다.
                String title = sc.nextLine();
                float score = sc.nextFloat(); // Float 실수는 nextFloat() 메서드로 받습니다.
                int Rate = (int) score; // 별점 int 형 변환
                double percentage = Rate * 100 / 5; // 퍼센트 계산

                sc.nextLine(); // 이 라인 추가 - 개행 문자 제거
                String recipe1 = sc.nextLine();
                String recipe2 = sc.nextLine();
                String recipe3 = sc.nextLine();
                String recipe4 = sc.nextLine();
                String recipe5 = sc.nextLine();
                String recipe6 = sc.nextLine();
                String recipe7 = sc.nextLine();
                String recipe8 = sc.nextLine();
                String recipe9 = sc.nextLine();
                String recipe10 = sc.nextLine();

                // 결과 출력
                System.out.println("[ " + title + " ]");
                System.out.println("별점 : " + Rate + " (" + percentage + "%)");
                System.out.println("1. " + recipe1);
                System.out.println("2. " + recipe2);
                System.out.println("3. " + recipe3);
                System.out.println("4. " + recipe4);
                System.out.println("5. " + recipe5);
                System.out.println("6. " + recipe6);
                System.out.println("7. " + recipe7);
                System.out.println("8. " + recipe8);
                System.out.println("9. " + recipe9);
                System.out.println("10. " + recipe10);
            }
}