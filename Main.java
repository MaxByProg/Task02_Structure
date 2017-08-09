package Task02_Structure;

/**
 * Created by mbikov on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mike");
        Person person2 = new Person("Mike2");
        Person person3 = new Person("Mike3");
        Person person4 = new Person("Mike4");

        Post post1 = new Post("Bug", false);
        Post post2 = new Post("Bug2", false);
        Post post3 = new Post("Bug3", false);
        Post post4 = new Post("Boss", true);

        Person person12 = new Person("Mike12");
        Person person22 = new Person("Mike22");
        Person person32 = new Person("Mike32");
        Person person42 = new Person("Mike42");

        Post post12 = new Post("Bug12", false);
        Post post22 = new Post("Bug22", false);
        Post post32 = new Post("Bug32", false);
        Post post42 = new Post("Boss2", true);

        Department root = new Department("root");
        Department child = new Department("child");
        root.addChild(child);

        System.out.println(root);
        System.out.println(child);
//        Department child = new Department("child");
//        Department child1 = new Department("child1");
//        Department child2 = new Department("child2");
//
//        root.addChild(child);
//        root.addChild(child1);
//        child1.addChild(child2);


    }
}
