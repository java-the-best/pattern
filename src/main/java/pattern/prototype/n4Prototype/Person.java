package pattern.prototype.n4Prototype;

import org.w3c.dom.ls.LSOutput;

public class Person implements Cloneable {
    private String name;
    private int age;
    private final Address address;

    public Person(String name, int age, Address address) {
        System.out.println("constuctor1");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(Person person) {
        System.out.println("constuctor2");
        this.name = person.name;
        this.age = person.age;
        this.address = new Address(person.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }
}
