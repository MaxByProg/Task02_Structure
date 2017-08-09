package Task02_Structure;

import java.util.*;

/**
 * Created by mbikov on 07.08.2017.
 */
public class Department {
    private String name;
    private static int count = 0;
    private static int countBoss = 0;
    private Map<String, String> workers = new LinkedHashMap<>();
    private String boss;
    public List<Department> children;

    public Department(String name) {
        children = new ArrayList<>();
        this.name = name;
        for(int i = 0; i < 4; i++) {
            if (i == 3) {
                boss = Post.mapMainPosts.get(countBoss) + " = " + Person.personList.get(count);
                count++;
                countBoss++;
                break;
            }
            workers.put(Person.personList.get(count), Post.mapPosts.get(count));
            count++;
        }
    }

    public void addChild(Department child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", workers=" + workers +
                ", " + boss + '\'' +
                ", children=" + children +
                '}';
    }
}