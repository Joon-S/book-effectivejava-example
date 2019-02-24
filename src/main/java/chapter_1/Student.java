package chapter_1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {

    private String name;
    private int age;

    public static Student newInstanceByNameAndAge(String name, int age) {
        Student person = new Student();
        person.setName(name);
        person.setAge(age);
        return person;
    }

    public void say() {
        System.out.println(getName() + getAge());
    }
}
