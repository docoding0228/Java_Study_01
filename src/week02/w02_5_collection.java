package week02;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.HashSet;
import java.util.Set;
//import java.util.Map;
// import java.util.HashMap;
import java.util.*;

public class w02_5_collection {
    public static void main(String[] args) {

          // ArrayList 예제
//        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

//        intList.add(1);
//        intList.add(2);
//        intList.add(3);

//        System.out.println(intList.get(0)); // 1 출력
//        System.out.println(intList.get(1)); // 2 출력
//        System.out.println(intList.get(2)); // 3 출력
//        System.out.println(intList.toString()); // [1,2,3] 출력

//        intList.set(1, 10); // 1번순번의 값인 2를 10으로 수정합니다.
//        System.out.println(intList.get(1)); // 10 출력

//        intList.remove(1); // 1번순번의 값을 삭제합니다.
//        System.out.println(intList.toString()); // [1,3] 출력

//        intList.clear(); // 전체 값을 삭제합니다.
//        System.out.println(intList.toString()); // [] 출력

//        =================================================================

          // LinkedList 예제
//        LinkedList<Integer> linkedList = new LinkedList<>(); // 선언 및 생성
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//
//        System.out.println(linkedList.get(0)); // 1 출력
//        System.out.println(linkedList.get(1)); // 2 출력
//        System.out.println(linkedList.get(2)); // 3 출력
//        System.out.println(linkedList.toString()); // [1,2,3] 출력
//
//        linkedList.add(2, 4); // 2번 순번에 4 값을 추가.
//        System.out.println(linkedList); // [1,2,4,3] 출력
//
//        linkedList.set(1, 10); // 1번순번의 값을 10으로 수정.
//        System.out.println(linkedList.get(1)); // 10 출력
//
//        linkedList.remove(1); // 1번순번의 값을 삭제.
//        System.out.println(linkedList); // [1,4,3] 출력
//
//        linkedList.clear(); // 전체 값을 삭제.
//        System.out.println(linkedList); // [] 출력


//        =================================================================

        // Stack 예제
//         Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성
//
//         intStack.push(8);
//         intStack.push(7);
//         intStack.push(6);
//
//         while (!intStack.isEmpty()) { // 다 지워질때까지 출력
//             System.out.println(intStack.pop()); // 6,7,8 출력
//             // 스택은 먼저들어간 값이 제일 마지막에 나온다. 즉, 나중에 들어간 값이 제일 먼저 출력됨.
//        }
//
//         // 다시 추가
//         intStack.push(1);
//         intStack.push(2);
//         intStack.push(3);
//
//         // peek()
//         System.out.println(intStack.peek()); // 3 출력
//         System.out.println(intStack.size()); // 3 출력 (peek() 할때 삭제 안됬음)
//
//         // pop()
//         System.out.println(intStack.pop()); // 3 출력
//         System.out.println(intStack.size()); // 2 출력 (pop() 할때 삭제 됬음)
//
//         System.out.println(intStack.pop()); // 2 출력
//         System.out.println(intStack.size()); // 1 출력 (pop() 할때 삭제 됬음)
//
//         while (!intStack.isEmpty()) { // 다 지워질때까지 출력
//             System.out.println(intStack.pop()); // 1 출력 (마지막 남은거 하나)
//        }


//        =================================================================

//        // Queue 예제
//        Queue<Integer> intQueue = new LinkedList<>(); // 선언 및 생성
//
//        intQueue.add(1);
//        intQueue.add(2);
//        intQueue.add(3);
//
//        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
//            System.out.println(intQueue.poll()); // 1,2,3 출력
//        }
//        // 다시 추가
//        intQueue.add(1);
//        intQueue.add(2);
//        intQueue.add(3);

//        // peek()
//        System.out.println(intQueue.peek()); // 1 출력 (맨먼저 들어간값이 1 이라서)
//        System.out.println(intQueue.size()); // 3 출력 (peek() 할때 삭제 안됬음)

//        // poll()
//        System.out.println(intQueue.poll()); // 1 출력
//        System.out.println(intQueue.size()); // 2 출력 (poll() 할때 삭제 됬음)

//        System.out.println(intQueue.poll()); // 2 출력
//        System.out.println(intQueue.size()); // 1 출력 (poll() 할때 삭제 됬음)

//        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
//            System.out.println(intQueue.poll()); // 3 출력 (마지막 남은거 하나)
//
//        }

//        =================================================================

//        // Set 예제
//        Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성
//
//        intSet.add(1);
//        intSet.add(2);
//        intSet.add(3);
//        intSet.add(3); // 중복된 값은 덮어씀.
//        intSet.add(3); // 중복된 값은 덮어씀.
//
//        for (Integer value : intSet) {
//            System.out.println(value); // 1,2,3 출력
//        }
//
//        // contains()
//        System.out.println(intSet.contains(2)); // true 출력
//        System.out.println(intSet.contains(4)); // false 출력
//
//        // remove()
//        intSet.remove(3); // 3 삭제
//
//        for (Integer value : intSet) {
//            System.out.println(value); // 1,2 출력
//        }

        Map<String, Integer> intMap = new HashMap<>(); // 선언 및 생성

        //          키 , 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 Key값은 덮어씁니다.
        intMap.put("삼", 15); // 중복 Key값은 덮어씁니다.

        // key 값 전체 출력
        for (String key : intMap.keySet()) {
            System.out.println(key); // 일,이,삼 출력
        }

        // value 값 전체 출력
        for (Integer key : intMap.values()) {
            System.out.println(key); // 11,12,15 출력
        }

        // get()
        System.out.println(intMap.get("삼")); // 15 출력

    }
}
