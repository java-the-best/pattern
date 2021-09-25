package pattern.prototype.n1Prototype;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person copy(Person person) {
        return new Person(person.name, person.age);
    }
}
