package week04.w04_2;

import java.util.ArrayList;
import java.util.List;

    public class Genericfirst<T> {
        private List<T> items;

        public Genericfirst() {
            this.items = new ArrayList<>();
        }

        public void addItem(T item) {
            items.add(item);
        }

        public T getItem(int index) {
            return items.get(index);
        }

        public static void main(String[] args) {
            Genericfirst<String> stringClass = new Genericfirst<>();
            stringClass.addItem("Hello");
            System.out.println(stringClass.getItem(0));  // 출력: Hello

            Genericfirst<Integer> integerClass = new Genericfirst<>();
            integerClass.addItem(42);
            System.out.println(integerClass.getItem(0));  // 출력: 42
        }
    }