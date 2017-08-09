package Task02_Structure;
import java.util.*;

/**
 * Created by mbikov on 07.08.2017.
 */
public class Post {
    private String post;
    private boolean boss;
    private static int postCount = 0;
    private static int mainPostCount = 0;
    private final int postID = postCount++;
    //private final int mainPostID = mainPostCount++;

    public static Map<Integer, String> mapPosts = new HashMap<>();
    public static Map<Integer, String> mapMainPosts = new HashMap<>();
//    public static List<String> listPosts = new LinkedList<>();
//    public static List<String> listMainPosts = new LinkedList<>();

    public Post(String post, boolean boss) {
        this.post = post;
        this.boss = boss;
        if (boss == true){
            mapMainPosts.put(mainPostCount++, post);
        }
        else{
            mapPosts.put(postID, post);
        }
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post='" + post + '\'' +
                ", boss=" + boss +
                '}';
    }
}
