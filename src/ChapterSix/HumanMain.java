package ChapterSix;

public class HumanMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 18,Gender.MALE);
        Person person1 = new Person("Mary Jane", 65,Gender.FEMALE);
        Person person2 = new Person("David JOE",23,Gender.MALE);
        Person person3 = new Person("Stellar",17,Gender.NON_BINARY);
        System.out.println(person3.getAge());
        System.out.println(person.getName());
        System.out.println(person1.getName());
    }

}
