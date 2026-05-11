package DSA;

import java.util.HashMap;
import java.util.Map;

import java.util.LinkedHashMap;
import java.util.Map;
    // making a class <Key, Value> extending LinkedHashMap
public class LRUCache<V,K> extends LinkedHashMap<V,K> {
    private final int capacity;
        // make a constructor with constructor
        public LRUCache(int capacity) {
            // use constructor and toggle access order
            super(capacity, 0.75f, true);
            this.capacity = capacity;

        }

        // override removeEldestEntry returning if size()> capacity
        @Override
        protected boolean removeEldestEntry(Map.Entry<V, K> eldest) {
            return size() > capacity;
        }

        public static void main(String[] args) {

        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "Apple");
        cache.put(2, "Banana");
        cache.put(3, "Mango");

        System.out.println(cache);

        // Access key 1
        cache.get(1);

        System.out.println(cache);

        // Add new element
        cache.put(4, "Orange");

        System.out.println(cache);
    }
}