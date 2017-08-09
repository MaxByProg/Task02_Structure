package Task02_Structure;
import java.util.*;
/**
 * Created by mbikov on 07.08.2017.
 */
public class Tree<T> {
    private Node<T> root;

    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.subdepartments = new ArrayList<Node<T>>();
    }

    public static class Node<T> {
        private T data;
        private Node<T> department;
        private List<Node<T>> subdepartments;
    }
}
