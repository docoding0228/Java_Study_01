package week5.Generics1;

public class Main {
    public static void main(String[] args) {
        // 문자열을 위한 Box
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, World!");
        String str = stringBox.getItem();
        System.out.println("박스에 있는 문자열: " + str);

        // 정수를 위한 Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(100);
        Integer num = integerBox.getItem();
        System.out.println("박스에 있는 정수: " + num);

        // 커스텀 타입을 위한 Box
        Box<Person> personBox = new Box<>();
        personBox.setItem(new Person("John", 30));
        Person person = personBox.getItem();
        System.out.println("박스에 있는 사람: " + person.getName() + ", 나이: " + person.getAge());
    }
}