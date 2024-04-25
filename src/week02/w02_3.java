package week02;

public class w02_3 {


    public static void main(String[] args) {

//        for(int i=0; i < 5; i++) { // 변수 i 값은 0 ~ 4 까지 반복
//            System.out.println(i + "번째 출력"); // i 변수와 문자열 합치기
//        }

          // 향상된 for 문

//        int[] numbers = {3,6,9,12,15};
//        for(int fortest: numbers) {
//            System.out.print(fortest + " ");
//        }

//        // 만약 기존 for 문으로 구현한다면?

//        int[] numbers = {3,6,9,12,15};

//        for(int i=0; i < 5; i++) // 또는
//        for(int i = 0; i < numbers.length; i++) { // 배열에 .length 를 붙이면 길이값이 응답됩니다.
//        System.out.println(numbers[i]);

        // while 문
//      int number = 0;
//      while(number < 3) { // ~ 동안 -> 3인 동안
//          number++;
//          // 0일때 ++ 로 인해 1출력
//          // 1일때 ++ 로 인해 2출력
//          // 2일때 ++ 로 인해 3출력
//          System.out.println(number + "출력");
//        }

        // do-while 문
//        int number = 4;
//        do {
//            System.out.println("출력 : "+number);
//        } while(number < 3); // 연산을 한번 수행 후 조건문 체크

        // break 명령어
//        int number = 0;
//        while(number < 3) {
//            number++;
//            if (number == 2) {
//                break;  // 2일때 반복 중단
//            }
//            System.out.println(number + "출력");
//        }

        // do while 문과 break
//        int number = 4;
//        do {
//            // do 안의 로직을 먼저 수행.
//            System.out.println(number + " 출력");
//            // 추가적인 로직을 여기에서 수행.
//            if (number == 2) {
//                break;  // 2일 때 반복 중단
//            }
//        } while (number < 3);  // 조건을 체크하여 반복 여부 결정

        // break 명령 범위
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i: " + i);
//            if (i == 2) {
//                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
//            }
//            for (int j = 0; j < 10; j++) {
//                System.out.println("j: " + j);
//                if (j == 2) {
//                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
//                }
//                // i=0 일때, 밑에 for문으로 가서 반복 진행
//                // j=0 부터 시작이며, j==2 가 될때까지 반복
//                // i=0 이지만, j==2까지 반복하여 j는 0부터 2까지 출력
//                // 출력 = i: 0, j: 0, j: 1, j: 2
//            }
//        }

        // continue 명령
        int number = 0;
        while(number < 3) {
            number++;
            if (number == 2) {
                continue;  // 2일때 반복 패스
            }
            System.out.println(number + "출력");
        }
    }
}
