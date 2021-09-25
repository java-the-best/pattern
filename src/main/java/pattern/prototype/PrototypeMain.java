package pattern.prototype;

import pattern.prototype.n4Prototype.Address;
import pattern.prototype.n4Prototype.Person;

public class PrototypeMain {

    public static void main() {
//        pattern.prototype.n1Prototype.Person person = new pattern.prototype.n1Prototype.Person("Mike", 22);

//        pattern.prototype.n2Prototype.Address address = new pattern.prototype.n2Prototype.Address("str", 55);
//        pattern.prototype.n2Prototype.Person person = new pattern.prototype.n2Prototype.Person("Mike", 22, address);
//        pattern.prototype.n2Prototype.Person person2 = null;
//        try {
//            person2 = person.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(person != person2);
//        System.out.println(person.getName() == person2.getName());
//        System.out.println(person.getAddress().getStreet() == person2.getAddress().getStreet());
//
//        person.setName("Den");
//        System.out.println(person2.getName());
//
//        address.setStreet("new");
//        person.setAddress(address);
//        System.out.println(person2.getAddress().getStreet());

//        pattern.prototype.n3Prototype.Address address = new pattern.prototype.n3Prototype.Address("str", 55);
//        pattern.prototype.n3Prototype.Person person = new pattern.prototype.n3Prototype.Person("Mike", 22, address);
//        pattern.prototype.n3Prototype.Person person2 = null;
//        try {
//            person2 = person.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(person != person2);
//        System.out.println(person.getName() == person2.getName());
//        System.out.println(person.getAddress().getStreet() == person2.getAddress().getStreet());
//
//        person.setName("Den");
//        System.out.println(person2.getName());
//
//        address.setStreet("new");
//        person.setAddress(address);
//        System.out.println(person2.getAddress().getStreet());

        // нет проблем с финальными полями и конструктором
        Address address = new Address("str", 55);
        Person person = new Person("Mike", 22, address);
        Person person2 = new Person(person);
        System.out.println(person != person2);
        System.out.println(person.getName() == person2.getName());
        System.out.println(person.getAddress().getStreet() == person2.getAddress().getStreet());

        person.setName("Den");
        System.out.println(person2.getName());

        address.setStreet("new");
        System.out.println(person.getAddress().getStreet());
        System.out.println(person2.getAddress().getStreet());
    }
}
