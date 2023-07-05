import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author：bowen
 * @Date：2023/7/4 20:21
 */
public class Main {

    public static void main(String[] args) {
        testMap();
    }

    public static void testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "bar");

        ConcurrentHashMap<String, Object> cmap = new ConcurrentHashMap<>();
        cmap.put("foo", "bar");
    }

}
