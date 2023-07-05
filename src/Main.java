import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：bowen
 * @Date：2023/7/4 20:21
 */
public class Main {

    public static void main(String[] args) {
        testMap();

        testLock();
    }

    public static void testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "bar");

        ConcurrentHashMap<String, Object> cmap = new ConcurrentHashMap<>();
        cmap.put("foo", "bar");
    }

    public static void testLock() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();

        ReentrantLock fairLock = new ReentrantLock(true);
        fairLock.lock();
        fairLock.unlock();
    }

}
