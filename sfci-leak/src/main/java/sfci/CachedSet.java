package sfci;

import java.util.HashSet;
import java.util.Set;

public class CachedSet {

    private static CachedSet instance;

    private Set<String> data = new HashSet<String>();

    public static CachedSet getInstance() {
        synchronized (CachedSet.class) {
            if (instance == null) {
                instance = new CachedSet();
            }
        }
        return instance;
    }

    public void add(String v) {
        data.add(v);
    }

    public boolean contains(String v) {
        return data.contains(v);
    }

    public String toString() {
        return data.toString();
    }
}
