package pattern.builder;

import pattern.builder.n2Bbuilder.Person;
import pattern.builder.n2Bbuilder.PersonBuilderImpl;

public class BuilderMain {

    public static void main() {
        Person person = new PersonBuilderImpl().setName("Mike").setAge(22).build();
        person.print();
    }
}
