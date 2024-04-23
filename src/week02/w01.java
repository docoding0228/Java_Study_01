package week02;

public class w01 {
    public static void main(String[] args) {

//        // x + y = z
//        int x = 5;
//        int y = 10;
//        int z = x + y;
//        System.out.println(z);
//
//        System.out.println(4 + 2); //6
//        System.out.println(4 - 2); //2
//        System.out.println(4 * 2); //8
//        System.out.println(4 / 2); //2
//        System.out.println(5 / 2); //2
//        System.out.println(2 / 4); //0
//        System.out.println(4 % 2); //0
//        System.out.println(5 % 2); //1

//        System.out.println(10 > 9); // 10 는 9 보다 크다 (참이면 true, 거짓이면 false)
//        System.out.println(10 >= 9); // 10 는 9 보다 크거나 같다 (true)
//        System.out.println(10 < 9); // 10 는 9 보다 작다 (false)
//        System.out.println(10 <= 9); // 10 는 9 보다 작거나 같다 (false)
//        System.out.println(10 == 10); // 10 는 10 와 같다 (true)
//        System.out.println(10 == 9); // 10 는 9 과 같다 (false)
//        System.out.println(10 != 10); // 10 는 10 와 같지 않다 (false)
//        System.out.println(10 != 9); // 10 는 9 과 같지 않다 (true)

        // 논리 연산자
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1); // true
        System.out.println(flag2); // true
        System.out.println(flag3); // false

        // 피연산자 중 하나라도 true 이면 true
        System.out.println(flag1 || flag2); // true
        System.out.println(flag1 || flag2 || flag3); // true
        // 피연산자 모두 true 이면 true
        System.out.println(flag1 && flag2); // true (flag1, flag2 모두 true 라서)
        System.out.println(flag1 && flag2 && flag3); // false (flag3은 false 라서)

        // And 연산
        System.out.println(true); // 5 는 3 보다 크고, 3 은 1 보다 크다 (true)
        System.out.println(false); // 5 는 3 보다 크고, 3 은 1 보다 작다 (false)

        // Or 연산
        System.out.println(true); // 5 는 3 보다 크거나, 3 은 1 보다 크다 (true)
        System.out.println(true); // 5 는 3 보다 크거나, 3 은 1 보다 작다 (true)
        System.out.println(false); // 5 는 3 보다 작거나, 3 은 1 보다 작다 (false)

        // System.out.println(1 < 3 < 5); // 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!flag1); // false (flag1 값의 반대)
        System.out.println(!flag3); // true (flag3 값의 반대)
        System.out.println(false); // false
        System.out.println(true); // true
    }
}