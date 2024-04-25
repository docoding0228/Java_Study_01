package week02;
import java.util.Arrays;

public class w02_4_array {
    public static void main(String[] args) {

//        // 배열 생성
//        //배열 생성후 초기화하면 배열의 주소가 할당된다.
//        int[] intArray = new int[3]; // 초기값 {0,0,0}
//        boolean[] boolArray = new boolean[3]; // 초기값 {false, false, false}
//        String[] stringArray = new String[3]; // 초기값 {"","",""}
//
//        //배열 선언만 해놓고 나중에 초기화를 시킬수도 있다.
//        int[] intArray2;
//        intArray2 = new int[3]; // 초기값 {0,0,0}

//        // 배열 중 하나만 조회
//        int[] intArray = new int[3]; // 모두 0으로 초기화된 사이즈8의 배열 생성
//        // 배열에서 2번쨰 순번의 값을 출력해본다. (0부터 순번이 시작하므로 2번째 순번은 1)
//        System.out.println(intArray[2]);

//        //배열에 특정값 대입하며 선언
//        int[] intArray = {1, 2, 3, 4, 5};
//        String[] stringArray = {"a", "b", "c", "d"};
//
//        //for문을 통해 값을 대입
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i;
//        }
//        //향상된 for문을 통한 배열 출력
//        for (int i : intArray) {
//            System.out.print(i); // 01234
//        }
//        System.out.println(); // 줄바꿈
//        //배열의 주소를 모두 같은값으로 초기화
//        Arrays.fill(intArray, 0);//배열의 모든 값을 0으로 초기화
//
//        for (int i : intArray) {
//            System.out.print(i);  // 11111
//        }

//        // 얕은 복사(Shallow Copy)
//        int[] a = { 1, 2, 3, 4 };
//        int[] b = a;
//        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정. (1 -> 3)
//        System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됨.


//        // 깊은 복사(Deep Copy)
//        int[] a = { 1, 2, 3, 4 };
//        int[] b = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정 (1 -> 3)
//        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로.

//        // 깊은 복사 메서드
//        // 1. clone() 메서드
//        int[] a = { 1, 2, 3, 4 };
//        int[] b = a.clone(); //
//        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작.
//        // clone() 메서드는 기본적으로 얕은 복사를 수행. 이는 객체 내부의 참조 변수들이 동일한 메모리 주소를 가리킨다는 것을 의미

//        // 2. Arrays.copyOf() 메서드
//        int[] a = { 1, 2, 3, 4 };
//        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줘야함.
//        // System.out.println(b); // 제대로 출력되지 않음.
//        System.out.println(Arrays.toString(b));
//        // 배열의 내용을 출력하려면 Arrays.toString()을 사용해야 한다.

        String str = "ABCD";
        // length()
        int strLength = str.length();
        System.out.println(strLength);  // 4 출력

        // charAt(int index)
        char strChar = str.charAt(2); // 순번은 0부터 시작하니까 2순번은 3번째 문자를 가리킵니다.
        System.out.println(strChar);  // C 출력

        // substring(int from, int to)
        String strSub = str.substring(0, 3); // 0~2순번까지 자르기 합니다. (3순번은 제외)
        System.out.println(strSub);  // ABC 출력

        // equals(String str)
        String newStr = "ABCE";  // str 값과 같은 문자열 생성
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // false 출력

        // toCharArray()
        char[] strCharArray = str.toCharArray(); // String 을 char[] 로 변환

        // 반대로 char[] 를 String로 변환하는 방법
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // char[] 를 String 으로 변환

    }
}
