package Task02_Structure;
import java.util.*;

/**
 * Created by mbikov on 07.08.2017.
 */
public class Person {
    private static int count = 0;
    private final int ID = count++;
    private String name;
    public static Map<Integer, String> personList = new LinkedHashMap<>();

    public Person(String name) {
        this.name = name;
        personList.put(ID, name);
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", personList=" + personList +
                '}';
    }
}