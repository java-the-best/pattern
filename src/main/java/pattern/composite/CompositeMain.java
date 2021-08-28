package pattern.composite;

import pattern.composite.composite.Folder;

public class CompositeMain {

    public static void main() {
        Folder users = new Folder("users");
        Folder etc = new Folder("etc");
        Folder root = new Folder("root");
        root.addFolder(users, etc);

        Folder mike = new Folder("Mike");
        Folder kent = new Folder("Kent");
        Folder max = new Folder("Max");
        users.addFolder(mike, kent, max);

        Folder one = new Folder("one");
        Folder two = new Folder("two");
        Folder three = new Folder("three");
        mike.addFolder(one, two, three);

        root.printFolders();
    }
}
