package com.org.test.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicateKeys { // Case-sensitive
    private class Pair {
        private int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair) obj;

            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            return true;
        }

    }

    public static void main(String[] args) {
        HashMapDuplicateKeys obj = new HashMapDuplicateKeys();
        obj.show();
    }

    private void show() {
        Map<Pair, String> map = new HashMap<>();
        Pair obj1 = new Pair(10, 20);
        Pair obj2 = new Pair(40, 50);
        Pair obj3 = new Pair(10, 20);
        // We can see that obj1 and obj3 have same values. So, we want to store these
        // objects
        // as one .To achieve
        // that,
        // we have overridden equals() and hashCode() methods of Pair class.

        map.put(obj1, "First");
        map.put(obj2, "Second");
        map.put(obj3, "Third");
        System.out.printf("Size of Map is :%d \n", map.size());

        for (Map.Entry<Pair, String> p : map.entrySet()) {
            Pair pair = p.getKey();
            System.out.printf("Map key-value pair is (%d,%d)->%s \n", pair.x, pair.y, p.getValue());
        }
        // output -
        // Size of Map is :2
        // Map key-value pair is (10,20)->Third
        // Map key-value pair is (40,50)->Second
    }

}
